package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateAverageTemp() {
        Map<String, Double> startingMap = new HashMap<>();
        double divider = 0;
        double resultAvr =0;
        for (Map.Entry<String, Double> testAVR : temperatures.getTemperatures().entrySet()) {
            divider++;
            resultAvr += testAVR.getValue();
        }
        resultAvr = resultAvr/divider;

        return resultAvr;
    }
    public double calculateMedian() {
        Map<String, Double> startingMap = new HashMap<>();
        double resultAvr =0;
        double[] tempTab = new double[temperatures.getTemperatures().entrySet().size()];
        int i=0;
        for (Map.Entry<String, Double> testAVR : temperatures.getTemperatures().entrySet()) {
            tempTab[i]=testAVR.getValue();
            i++;
        }
        double median=0;
        double average = 0.0;
        Arrays.sort(tempTab);
        if (tempTab.length % 2 == 0 )
        {
            average = tempTab[tempTab.length/2] + tempTab[(tempTab.length/2)-1];
            median = average/2.0;

        }
        else
        {
            median = tempTab[tempTab.length/2];
        }

        return median;
    }
}
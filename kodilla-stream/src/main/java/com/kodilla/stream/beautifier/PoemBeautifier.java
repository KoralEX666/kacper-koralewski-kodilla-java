package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    String textTOBeautify;

    public void beautify(String textTOBeautify, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(textTOBeautify);
        System.out.println(result);
    }


}

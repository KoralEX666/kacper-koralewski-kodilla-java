package com.kodilla.good.patterns.challenges.theoryAndPractice;
import java.time.LocalDate;

import static com.kodilla.good.patterns.challenges.theoryAndPractice.Order.createTestOrder;

public class Aplication {

public static void main(String[] args) {

    Order order;
    order = createTestOrder();
    String subcontractorOne = "ExtraFoodShop";
    String subcontractorTwo = "HealthyShop";
    String subcontractorThree = "GlutenFreeShop";
    String subcontractorFour = "SatanLair";

    SubcontractorProcessor subcontractorProcessor = new SubcontractorProcessor();

    subcontractorProcessor.process(order, subcontractorOne);

    subcontractorProcessor.process(order, subcontractorTwo);

    subcontractorProcessor.process(order, subcontractorThree);

    subcontractorProcessor.process(order, subcontractorFour);

    }
}

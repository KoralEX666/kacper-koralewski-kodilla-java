package com.kodilla.good.patterns.challenges.theoryAndPractice;
import java.time.LocalDate;

public class SubcontractorProcessor {


    public boolean process(Order order, String subcontractor){
        if(subcontractor.equals("ExtraFoodShop")) {
            sendMail(order, subcontractor);
            return true;
        } else if (subcontractor.equals("HealthyShop")) {
            ping(order, subcontractor);
            return true;
        } else if (subcontractor.equals("GlutenFreeShop")) {
            sendPenguin(order, subcontractor);
            return true;
        } else {
            System.out.println("");
            System.out.println("Ohhh... The subcontractor '" + subcontractor + "' doesn't exist, check the details and try again.");
            System.out.println("");
            return false;
        }
    }
    void sendMail(Order order, String subcontractor){
        System.out.println("");
        System.out.println("");
        System.out.println("Processing order to "+subcontractor);
        System.out.println("Turning on the computer ...");
        System.out.println("Not again... Windows isn't working!");
        System.out.println("Installing Windows ...");
        System.out.println("Office installation ...");
        System.out.println("Mail setup ...");
        System.out.println("Composing an email");
        orderPreraration(order);
        System.out.println("Clicking send button.");
        System.out.println("Processing...");
        System.out.println("Mail to " +subcontractor+" sent");
    }
    void ping(Order order, String subcontractor){
        System.out.println("");
        System.out.println("");
        System.out.println("Processing order to "+subcontractor);
        System.out.println("Processing...");
        System.out.println("Finding a computer...");
        System.out.println("Search in the internet 'what the hell Ping is???'");
        System.out.println("Where's the f... is terminal...");
        System.out.println("Copying a Command ......");
        System.out.println("F... internet is down!!!...");
        System.out.println("The cable is inserted into the socket... and... internet back to life!");
        System.out.println("Ok ... typing the command...");
        System.out.println("Processing...");
        System.out.println("Ping to " +subcontractor+" sent");
        System.out.println("Order preparation - just in advance...");
        orderPreraration(order);
        System.out.println("Waiting for a response to place an order");
    }
    void sendPenguin(Order order, String subcontractor){
        System.out.println("");
        System.out.println("");
        System.out.println("Create an order card for a penguin...");
        orderPreraration(order);
        System.out.println("Processing...");
        System.out.println("Penguin caught...");
        System.out.println("A penguin's backpack was put on...");
        System.out.println("Order card secured in the backpack...");
        System.out.println("A map with an address handed to Penguin...");
        System.out.println("Penguin exposed to the streets to go to " +subcontractor);
        System.out.println("Processing...");
        System.out.println("Penguin to " +subcontractor+" sent");
    }
    void orderPreraration(Order order){
        System.out.println("Adding order creation date: "+ LocalDate.now());
        System.out.println("Adding an order");
        System.out.println("Adding goods: "+ order.getGoods());
        System.out.println("Adding quantity: "+ order.getQuantity());
        System.out.println("Adding order expected delivery date: "+ order.getDate());
    }

}

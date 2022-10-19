package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderService {


    public boolean sale(User user, final LocalDateTime date, String product, int  quantity){
         if (user != null) {
             return true;
         } else {
             return false;
         }
    };


}

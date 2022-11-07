package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testPizzaNew() {
    //Given
       Bigmac bigmac = new Bigmac.BigmacBuilder()
               .bun("sesame")
               .burgers(15)
               .sauce("barbecue")
               .ingredient("lettuce")
               .ingredient("shrimps")
               .ingredient("chilli peppers")
               .ingredient("onion")
               .ingredient("cheese")
               .build();
       System.out.println(bigmac);
       //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(5, howManyIngredients);




    }
}

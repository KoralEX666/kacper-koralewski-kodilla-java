package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;

import javax.swing.plaf.SpinnerUI;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testLoopAndConditionalBreakpoints {

    @Test
    public void testLoop(){
        //Given
        long sum = 0;
        //when
        for(int n=0; n<1000; n++) {
            sum +=n;
            System.out.println("[" + n + "] Sum equals:" + sum );
        }
        //Then
        assertEquals(499500,sum);
    }
}

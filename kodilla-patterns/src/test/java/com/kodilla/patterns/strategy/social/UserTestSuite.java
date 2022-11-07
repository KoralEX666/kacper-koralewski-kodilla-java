package com.kodilla.patterns.strategy.social;


import com.sun.source.tree.WhileLoopTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User jack  = new Millenials("Jack Clayton");
        User jill  = new YGeneration( "Jill McArthur");
        User brian = new ZGeneration("Brian Kozlowski");

        //When
        String jackPublish = jack.sharePost();
        System.out.println("Jack post on: " + jackPublish);
        String jillPublish = jill.sharePost();
        System.out.println("Jill post on: " + jillPublish);
        String brianPublish = brian.sharePost();
        System.out.println("Brian post on: " + brianPublish);

        //Then
        assertEquals("Facebook", jackPublish);
        assertEquals("Twitter", jillPublish);
        assertEquals("Snapchat", brianPublish);
    }

    @Test
    void testIndividualSharingStrategy(){

        //Given
        User jack  = new Millenials("Jack Clayton");

        //When
        String jackPublish = jack.sharePost();
        System.out.println("Jack post on: " + jackPublish);
        jack.setSocialPublisher( new SnapchatPublisher());
        jackPublish = jack.sharePost();
        System.out.println("Jack post on: " + jackPublish);

        //Then
        assertEquals("Snapchat", jackPublish);
    }


}

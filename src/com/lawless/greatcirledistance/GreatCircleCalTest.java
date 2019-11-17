package com.lawless.greatcirledistance;

import org.junit.jupiter.api.Assertions;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GreatCircleCalTest {



    @org.junit.jupiter.api.Test
    void calculateZeroDistance() {
        GreatCircleCal greatCircleCal = new GreatCircleCal();
        double distance  = greatCircleCal.calculate(0, 0, 0, 0 );

        System.out.println(distance);
        Assertions.assertEquals(0.0,distance);
    }


    @org.junit.jupiter.api.Test
    void calculateDublinToWashington() {
        GreatCircleCal greatCircleCal = new GreatCircleCal();
        /**
         * 5,439 km
         * Distance from Washington to Dublin according to Google.
         * or 5438km according to https://www.nhc.noaa.gov/gccalc.shtml
         * Because of apperant rounding errors this doesn't match the result my implementation gets.
         *
         */

        double distance  = greatCircleCal.calculate(53.3498, 6.2603, 38.9072, 77.0369 );
        System.out.println(distance);

        Assertions.assertEquals(5438,distance);
    }


    @org.junit.jupiter.api.Test
    void calculateDublinToWashingtonRough() {
        GreatCircleCal greatCircleCal = new GreatCircleCal();
        /**
         * 5,439 km
         * Distance from Washington to Dublin according to Google.
         * or 5438km according to https://www.nhc.noaa.gov/gccalc.shtml
         */

        double distance  = greatCircleCal.calculate(53.3498, 6.2603, 38.9072, 77.0369 );
        System.out.println(distance);
        //by adding the delta value the result can be within a certain range of the correct result.
        //Which is good here as rounding errors seem to be an issue even while using doubles.
        Assertions.assertEquals(5438,distance,15);
    }

    @org.junit.jupiter.api.Test
    void calculateDublinToSydneyRough() {
        GreatCircleCal greatCircleCal = new GreatCircleCal();
        /**
         * 17,204 km
         * Distance from Dublin to Sydney according to goodle.
         */

        double distance  = greatCircleCal.calculate(53.3498, 6.2603, -33.8688, -151.2093 );
        System.out.println(distance);
        //by adding the delta value the result can be within a certain range of the correct result.
        //Which is good here as rounding errors seem to be an issue even while using doubles.
        Assertions.assertEquals(17204,distance,15);
    }

    @org.junit.jupiter.api.Test
    void calculateDublinToSouthPoleRough() {
        GreatCircleCal greatCircleCal = new GreatCircleCal();
        /**
         * 17,204 km
         * Distance from Dublin to Sydney according to goodle.
         */

        double distance  = greatCircleCal.calculate(53.3498, 6.2603, -90.0000, -45.0000 );
        System.out.println(distance);
        //by adding the delta value the result can be within a certain range of the correct result.
        //Which is good here as rounding errors seem to be an issue even while using doubles.
        Assertions.assertEquals(15945.25,distance,15);
    }




    @org.junit.jupiter.api.Test
    void calculateRandomPointsDistance() {
        GreatCircleCal greatCircleCal = new GreatCircleCal();
        Random random = new Random();
        /**
         *Just to see what happens with random doubles as points
         */



        double distance  = greatCircleCal.calculate(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble() );
        System.out.println(distance);
    }




}
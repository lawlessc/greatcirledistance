package com.lawless.greatcirledistance;

public class GreatCircleCal {
    private double Earth_radius = 6371;


    public GreatCircleCal(){}

    //using doubles for greater precesion as wiki mentions this may be an issue
    public double calculate(double latitude_one , double longitude_one,
                          double latitude_two , double longitude_two)
    {

       //we convert everything to radians
        latitude_one= Math.toRadians(latitude_one);
        longitude_one = Math.toRadians(longitude_one);
        latitude_two= Math.toRadians(latitude_two);
        longitude_two= Math.toRadians(longitude_two);

        double longitude_difference = longitude_one - longitude_two;
        //double latitude_difference = latitude_one - latitude_two;
        //latitude_difference commented out as it is never used even though it is mentioned.

        //now going with multiplications in brackets first
        double cosine_calcs =   Math.cos(latitude_one)*Math.cos(latitude_two)*Math.cos(longitude_difference);
        double sin_calcs  = Math.sin(latitude_one)*Math.sin(latitude_two);
        double central_angle = Math.acos(sin_calcs+cosine_calcs);

        double distance = Earth_radius*central_angle;

        //System.out.println("Distance is:" +distance);

return distance;
    }




}

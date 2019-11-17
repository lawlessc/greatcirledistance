package com.lawless.greatcirledistance;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
	// write your code here

     double dublin_office_long= -6.257664;
     double dublin_office_lat = 53.339428;

     TextToJsonCustomer textToJsonCustomer = new TextToJsonCustomer();
     GreatCircleCal calculator = new  GreatCircleCal();
     Output resultOutput = new Output();

    ArrayList<Customer> customers= new ArrayList<Customer>();


   calculator.calculate(Double.parseDouble(args[0]),Double.parseDouble(args[1]) ,Double.parseDouble(args[2]) , Double.parseDouble(args[3]));
   customers =  textToJsonCustomer.readJsonFile("customers.txt");




    resultOutput.start();
   for(int i = 0; i < customers.size()-1; i++)
   {


       Double distance = calculator.calculate(customers.get(i).latitude,
               customers.get(i).longitude ,
               dublin_office_lat ,
               dublin_office_long);

       if(distance <=100.00)
       {
         resultOutput.addLine("User Id: "+customers.get(i).user_id +" Name:"+customers.get(i).name   );

       }

   }

   resultOutput.endWrite();

    }
}

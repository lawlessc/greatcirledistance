package com.lawless.greatcirledistance;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class TextToJsonCustomer {
    private Gson gson = new Gson();
  //  private Reader reader;

    public TextToJsonCustomer(){}


    public ArrayList<Customer> readJsonFile(String fileNamePath)
    {
        ArrayList<Customer> customers = new ArrayList<Customer>();





        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileNamePath));
            String line = reader.readLine();
            for ( int i = 0;line != null; i++) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
                customers.add(gson.fromJson(line, Customer.class));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



//
//        try  (Reader reader = new FileReader(fileNamePath))
//        {
//
//            //reader = new FileReader(fileNamePath);
//            // Convert JSON File to Java Object
//             customers = gson.fromJson(reader., Customer[].class);
//        } catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//        return customers;
        return customers;
    }




  //  public


}

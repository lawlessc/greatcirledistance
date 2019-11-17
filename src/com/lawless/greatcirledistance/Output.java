package com.lawless.greatcirledistance;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Output {

    PrintWriter writer;



    public  Output()
    {//begins



    }


    public void start() throws FileNotFoundException, UnsupportedEncodingException {

        writer = new PrintWriter("output.txt", "UTF-8");
    }


    public void addLine(String line)
    {

        writer.println(line);
    }



    public void endWrite()
    {
        writer.close();
    }


}

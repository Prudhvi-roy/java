package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Roy_111_file
{
    public static void main (String args[])
    {
        File myFile=new File("roy111file.txt");
        try
        {
            myFile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("IOException caught");
        }
        try
        {
            FileWriter fileWriter=new Filewriter("roy111file.txt");
            fileWriter.write("this is our first file from this java course\n okay na bye ");
            fileWriter.close();
        }
        catch(IOException e)
        {
            System.out.println("IOException caught");
        }
        File myFile=new File("roy111file.txt");
        try
        {
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String Line =sc.NextLine();
                System.out.println("Line");
            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("e");
        }
        File myFile=new File("roy111file.txt");
        if(myFile.delete())
        {
            System.out.println("some problem occured while deleting the file");
        }
    }
}

/*
Title:              Assignment1 PA1.java
Course:             SENG2200
Author:             Juyong Kim
Student No:         c3244203
Date:               05/03/2019
Description:        123
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PA1
{
    public static void main (String[] args) throws Exception
    {

        String dataFile = args[0]; 
        readFile(dataFile);

        Point no1 = new Point(1,1);
        Point no2 = new Point(1,3);
        Point no3 = new Point(3,3);
        Point no4 = new Point(3,1);
        Point no5 = new Point(1,1);

        Point bo1 = new Point(1,1);
        Point bo2 = new Point(1,4);
        Point bo3 = new Point(4,4);
        Point bo4 = new Point(4,1);
        Point bo5 = new Point(1,1);

        Point po1 = new Point(1,1);
        Point po2 = new Point(1,5);
        Point po3 = new Point(5,5);
        Point po4 = new Point(5,1);
        Point po5 = new Point(1,1);

        Polygon poly1 = new Polygon(5);
        Polygon poly2 = new Polygon(5);
        Polygon poly3 = new Polygon(5);


        poly1.addPoint(no1);
        poly1.addPoint(no2);
        poly1.addPoint(no3);
        poly1.addPoint(no4);
        poly1.addPoint(no5);

        poly2.addPoint(bo1);
        poly2.addPoint(bo2);
        poly2.addPoint(bo3);
        poly2.addPoint(bo4);
        poly2.addPoint(bo5);

        poly3.addPoint(po1);
        poly3.addPoint(po2);
        poly3.addPoint(po3);
        poly3.addPoint(po4);
        poly3.addPoint(po5);

        MyPolygons polyList = new MyPolygons(3);

        System.out.println(poly1.toString());
        System.out.println(poly2.toString());
        System.out.println(poly3.toString());

        polyList.append(poly1);
        polyList.append(poly2);
        polyList.append(poly3);

        System.out.println(polyList.printList());

        System.out.println("functioning");
    }

    //recieves the file name and saves the variables into string lists
    public static void readFile(String fileName)
    {
        //variables
        List<String> input = new LinkedList<String>();
        String token1;          //dummy variable used for text manipulation

        //loading files into stuff
        try 
        {
            Scanner file1 = new Scanner(new File(fileName));

            //try catch for getting correct contents of the file
            try 
            {

//          Data manipulation is done here figure it out

//                //split by into string list outside while loop
//                while(file1.hasNext())
//                {
//                    token1 = file1.next();
//                    input.add(token1);
//                }                  
//
//                //saves the pages into a process
//                if(input.get(0).equals("begin"))
//                {
//                    //ignore the first part of file
//                    //since its begin and input.size()-1
//                    //to ignore the end string
//                    for(int i = 1; i < input.size()-1; i++)
//                    {
//                        process.addPage(input.get(i));
//                    }
//
//                }
//
            } 
            catch (NoSuchElementException e) 
            {
                System.out.println("Empty file, or invalid contents!");
            }

            //close all the files
            file1.close();
        } 
        catch (FileNotFoundException e) 
        { 
            System.out.println("File not found! Please give a valid file!");
        }
    }
}
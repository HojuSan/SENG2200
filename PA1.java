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
import java.lang.String;
import java.nio.file.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class PA1
{
    public static void main (String[] args) throws IOException
    {

        //variables
        String dataFile = args[0]; 
        File file = new File(dataFile);

        MyPolygons myPolyList = new MyPolygons();

        try 
        {
            // Here we use the Scanner class to read file content line-by-line.
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine();

                // Splitting the line with spaces
                Scanner lineScanner = new Scanner(line);

                lineScanner.useDelimiter(" ");

                //testing purposes
                while (lineScanner.hasNext()) 
                {
                    String part = lineScanner.next();
                    System.out.print(part + " ");                                                   //

                    if(part.equals("P"))
                    {

                        //num after P/ verticies
                        String verticies = lineScanner.next();
                        System.out.print(verticies + " ");                                          //
                        int pNum = Integer.parseInt(verticies);
                        int cNum = 0;

                        //creates a polygon of n+1 verticies
                        Polygon poly = new Polygon(pNum+1);

                        //creates a list of points to insert into the polygon
                        Point[] pList = new Point[pNum+1];

                        //loops till the end of the line
                        while(lineScanner.hasNext())
                        {
                            //generates values
                            String xValue = lineScanner.next();
                            System.out.print(xValue + " ");                                         //
                            String yValue = lineScanner.next();
                            System.out.print(yValue+ " ");                                          //

                            //saves x point then y point respectively
                            pList[cNum] = new Point(Integer.parseInt(xValue),Integer.parseInt(yValue));

                            poly.addPoint(pList[cNum]);

                            cNum++;
                        }

                        //adds first element to the last
                        poly.addPoint(pList[0]);

                        myPolyList.append(poly);

                    }
                }                
                System.out.println();
            }
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }

        System.out.println(myPolyList.printList());


    }//end of Main 

//    //recieves the file name and saves the variables into string lists
//    public static void readFile(String fileName, List<String> input, int amount)
//    {
//        //variables
//        String token1;          //dummy variable used for text manipulation
//
//        //loading files into stuff
//        try 
//        {
//            Scanner file1 = new Scanner(new File(fileName));
//
//            //try catch for getting correct contents of the file
//            try 
//            {
//
//                //Data manipulation is done here figure it out
//                //split by into string list outside while loop
//                while(file1.hasNext())
//                {
//                    token1 = file1.next();
//                    input.add(token1);
//                }                  
//                //System.out.println("finished while loop");
//                
//                //updates the amount of polygons in the data file
//                for(int i = 0; i < input.size(); i++)
//                {
//                    if(input.get(i).equals("P"))
//                    {
//                        amount++;
//                    }
//                }
//
//                //System.out.println("finished updating amount");
//
//            } 
//            catch (NoSuchElementException e) 
//            {
//                System.out.println("Empty file, or invalid contents!");
//            }
//
//            System.out.println("finished reading file");
//            //close all the files
//            file1.close();
//        } 
//        catch (FileNotFoundException e) 
//        { 
//            System.out.println("File not found! Please give a valid file!");
//        }
//    }
//
//    public static void createList(List<String> input, MyPolygons myPolyList)
//    {
//        //beginning for loop looks for a p to start loading points into polygons
//        for(int i = 0; i < input.size(); i++)
//        {
//            if(input.get(i).equals("P"))
//            {
//                //System.out.println("Entered equals p section");
//                //polygon verticies number
//                int pNum = Integer.parseInt(input.get(i+1));
//                int cNum = 0;
//
//                //System.out.println("pNum is: "+pNum);
//                //creates a polygon of n+1 verticies
//                Polygon poly = new Polygon(pNum+1);
//
//                //creates a list of points to insert into the polygon
//                Point[] pList = new Point[pNum+1];
//
//                //this might be where the error is
//                for(int j = i+2; j < i+(2*(pNum+1)); j+=2)
//                {
//                    //System.out.println("i is: "+ i);
//                    //System.out.println("j is: "+j);
//                    //saves x point then y point respectively
//                    pList[cNum] = new Point(Integer.parseInt(input.get(j)),Integer.parseInt(input.get(j+1)));
//
//                    poly.addPoint(pList[cNum]);
//
//                    cNum++;
//                }
//
//                //saves x point then y point respectively
//                pList[cNum] = new Point(Integer.parseInt(input.get(i+2)),Integer.parseInt(input.get(i+3)));
//
//                poly.addPoint(pList[cNum]);
//
//                myPolyList.append(poly);
//                //System.out.println("Last for loop has ended");
//            }
//        }
//    }
}
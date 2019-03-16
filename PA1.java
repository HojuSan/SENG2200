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
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class PA1
{
    public static void main (String[] args) throws Exception
    {

        //variables
        String dataFile = args[0]; 
        List<String> input = new LinkedList<String>();
        int amount = 0;
        
        //function to read file data
        readFile(dataFile, input, amount);

        //instantiates the amount of polygons within myPolygons
        MyPolygons myPolyList = new MyPolygons(amount);

        //function to create the list
        createList(input, myPolyList);

        System.out.println(myPolyList.printList());

    }//end of Main 

    //recieves the file name and saves the variables into string lists
    public static void readFile(String fileName, List<String> input, int amount)
    {
        //variables
        String token1;          //dummy variable used for text manipulation

        //loading files into stuff
        try 
        {
            Scanner file1 = new Scanner(new File(fileName));

            //try catch for getting correct contents of the file
            try 
            {

                //Data manipulation is done here figure it out
                //split by into string list outside while loop
                while(file1.hasNext())
                {
                    token1 = file1.next();
                    input.add(token1);
                }                  
                //System.out.println("finished while loop");
                
                //updates the amount of polygons in the data file
                for(int i = 0; i < input.size(); i++)
                {
                    if(input.get(i).equals("P"))
                    {
                        amount++;
                    }
                }

                //System.out.println("finished updating amount");

            } 
            catch (NoSuchElementException e) 
            {
                System.out.println("Empty file, or invalid contents!");
            }

            System.out.println("finished reading file");
            //close all the files
            file1.close();
        } 
        catch (FileNotFoundException e) 
        { 
            System.out.println("File not found! Please give a valid file!");
        }
    }

    public static void createList(List<String> input, MyPolygons myPolyList)
    {
                //beginning for loop looks for a p to start loading points into polygons
                for(int i = 0; i < input.size(); i++)
                {
                    if(input.get(i).equals("P"))
                    {
                        //System.out.println("Entered equals p section");
                        //polygon verticies number
                        int pNum = Integer.parseInt(input.get(i+1));
                        int cNum = 0;
        
                        //System.out.println("pNum is: "+pNum);
                        //creates a polygon of n+1 verticies
                        Polygon polyList = new Polygon(pNum+1);
        
                        //creates a list of points to insert into the polygon
                        Point[] pList = new Point[pNum+1];
        
                        //this might be where the error is
                        for(int j = i+2; j < i+(2*(pNum+1)); j+=2)
                        {
                            //System.out.println("i is: "+ i);
                            //System.out.println("j is: "+j);
                            //saves x point then y point respectively
                            pList[cNum] = new Point(Integer.parseInt(input.get(j)),Integer.parseInt(input.get(j+1)));
        
                            polyList.addPoint(pList[cNum]);
        
                            cNum++;
                        }
        
                        //saves x point then y point respectively
                        pList[cNum] = new Point(Integer.parseInt(input.get(i+2)),Integer.parseInt(input.get(i+3)));
        
                        polyList.addPoint(pList[cNum]);
        
                        myPolyList.append(polyList);
                        //System.out.println("Last for loop has ended");
                    }
                }
    }
}
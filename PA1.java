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
        Point no1 = new Point(1,1);
        Point no2 = new Point(1,3);
        Point no3 = new Point(3,3);
        Point no4 = new Point(3,1);

        Polygon poly = new Polygon(4);

        poly.addPoint(no1);
        poly.addPoint(no2);
        poly.addPoint(no3);
        poly.addPoint(no4);






//        //true false
//        boolean success = false;
//
//        //setting variables for num of polygons
//        int cPoly=0;
//
//        //data from the file
//        List<String> input = new LinkedList<String>();
//        String token1 = "";
//        List<Integer> xPoint  = new ArrayList<Integer>();
//        List<Integer> yPoint  = new ArrayList<Integer>();
//
//        //scanner saves next line file name into data
//        Scanner data = new Scanner(System.in);
//        System.out.println("Enter file name eg input.txt: ");
//
//        //loops till it finds a valid file
//        while (!success) 
//        {
//            //try catch for getting the correct file
//            try 
//            {
//                //changes line into string
//                String str = data.nextLine();
//                //converts the string name of the file into an actual file 
//                //that the code can read
//                Scanner file1 = new Scanner(new File(str));
//                //try catch for getting correct contents of the file
//                try 
//                {
//                    //split by  into string array outside while loop
//                    while(file1.hasNext())
//                    {
//                        token1 = file1.next();
//                        input.add(token1);
//                    }                  
//
//                    for(int i = 0; i < input.size(); i+=3)
//                    {
//                        //better to use this for string comparison
//                        //equal is 0
//                        if(input.get(i).compareToIgnoreCase("end") == 0)
//                        {
//                            //break loop if END
//                            success = true;
//                            break;
//                        }
//
//                        //Bug is here only loops once
//                        arrives.add(Integer.parseInt(input.get(i)));
//                        id.add(input.get(i+1));
//                        duration.add(Integer.parseInt(input.get(i+2)));
//                        cNum++;
//
//                    }
//
//                } 
//                catch (NoSuchElementException e) 
//                {
//                    System.out.println("Empty file, or invalid contents!");
//                }
//                file1.close();
//            } 
//            catch (FileNotFoundException e) 
//            { 
//                System.out.println("File not found! Please give a valid file!");
//            }
//        }
//        //close file
//        data.close();

        System.out.println("functioning");
    }
}
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
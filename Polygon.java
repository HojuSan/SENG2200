/*
Title:              Assignment1 Polygon.java
Course:             SENG2200
Author:             Juyong Kim
Student No:         c3244203
Date:               05/03/2019
Description:        Creates a Polygon 
*/
public class Polygon
{
    //variables
    private Point[] poly;
    private int size;
    private int sides;
    private double area;
    private double distance;

    //constructor
    public Polygon(int num)
    {
        this.poly = new Point[num];
        this.area = 0;
        this.sides = num;
        this.size = 0;
    }

    //adds points to an array of points saved in polygon
    public void addPoint(Point pon)
    {
        poly[size] = pon;
        size++;
    }

    //Inputs points into Polygon area calculation, saves value into private variable area
    public void calArea()
    {
        //Start of the formula
        for(int i = 0; i < sides-1; i++)
        {
//            System.out.println(i + "  iteration");                                                                //testing purpose

            area += (poly[i].getX()*poly[i+1].getY())-(poly[i].getY()*poly[i+1].getX());

//            System.out.println( (poly[i].getX()*poly[i+1].getY()) +" "+ (-(poly[i].getY()*poly[i+1].getX())));    //testing purpose
//            System.out.println(area);
        }

        //half the total calculation
        area = area/2;

        //if area is negative times by -1
        if(area <= 0)
        {
            area = area*-1;
        }
    }

    //calculates the closest point to the origin, returns the distance
    public double calDistance()
    {
        double closest = poly[0].getD();

        for(int i = 1; i < sides; i++)
        {
            if(closest > poly[i].getD())
            {
                closest = poly[i].getD();
            }
        }

        return closest;
    }

    //prints out polygon information according to specs
    public String toString()
    {
        String temp = "[";
        String areaVal = String.format("%5.2f", area);


        for(int i = 0; i < sides; i++)
        {
            temp += poly[i].toString();
        }

        temp += "]: "+ areaVal;

        return temp;
    }
}
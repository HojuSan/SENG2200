/*
Title:              Assignment1 Polygon.java
Course:             SENG2200
Author:             Juyong Kim
Student No:         c3244203
Date:               05/03/2019
Description:        Creates a Polygon 123
*/
public class Polygon
{
    //figure out how to make arrays of poly
    private ArrayList<Point> poly;
    private int size;
    private int sides;
    private double area;
    private double distance;

    public Polygon(int num)
    {
        Point[] poly = new Point[num];
        area = 0;
        sides = num;
        size = 0;
    }

    public void addPoint(Point pon)
    {
        poly[size] = pon;
        size++;
    }

    public void calculateArea()
    {
        //Start of the formula
        for(int i = 0; i < sides; i++)
        {
            area += (poly[i].getX()*poly[i+1].getY())-(poly[i].getY()*poly[i+1].getY());
        }

        //last calculation for last point to starting point
        area += (poly[size].getX()*poly[0].getY())-(poly[size].getY()*poly[0].getY());

        //half the total calculation
        area = area/2;

        //if area is negative times by -1
        if(area <= 0)
        {
            area = area*-1;
        }
    }

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
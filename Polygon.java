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
    private Point[] poly;
    private int size;
    private double area;
    private double distance;

    public Polygon()
    {
        area = 0;
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
        for(int i = 0; i < size; i++)
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

        for(int i = 1; i < size; i++)
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
        return
    }
}
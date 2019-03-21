/*
Title:              Assignment1 Polygon.java
Course:             SENG2200
Author:             Juyong Kim
Student No:         c3244203
Date:               05/03/2019
Description:        Creates a Polygon 
*/
public class Polygon implements ComparePoly
{
    //variables
    private Point[] poly;
    private int size;
    private int sides;
    private double area;
    private double distance;
    private String print;

    //constructor
    public Polygon(int num)
    {
        this.poly = new Point[num];
        this.area = 0;
        this.sides = num;
        this.size = 0;
        this.print = "";
        this.distance = 0;
    }

    //getters
    public String getPrint()
    {
        return print;
    }
    public double getArea()
    {
        return area;
    }
    public double getDistance()
    {
        return calDistance();
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

    //bigger or the same return true, if smaller return false 
    public boolean compare(Polygon poly)
    {
        //determine ratio between the area of two polygons
        double ratio = this.area / poly.getArea();

        //if no area default same
        if (this.area == 0 && poly.getArea() == 0)
        {
            ratio = 1;
        }

        //area is states as the same
        if(ratio <= 1.05 && ratio >= 0.95)
        {
            //if vertex distance is smaller then return false
            if(this.getDistance() > poly.getDistance())
            {
                System.out.println("here1");
                return true;
            }
            else if(this.getDistance() == poly.getDistance())
            {
                System.out.println("here2 "+getDistance()+"        "+poly.getDistance()+"     "+getPrint());
                return false;
            }
            else
            {
                System.out.println("here3");
                return false;
            }
        }

        //if the area is bigger return true
        if(this.area > poly.getArea())
        {
            return true;
        }
        
        //area is smaller
        return false;
    }

    //prints out polygon information according to specs
    @Override
    public String toString()
    {
        String temp = "[";
        String areaVal = String.format("%5.2f", area);


        for(int i = 0; i < sides; i++)
        {
            temp += poly[i].toString();
        }

        temp += "]: "+ areaVal;
        this.print = temp;
        return temp;
    }
}
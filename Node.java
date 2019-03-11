/*
Title:              Assignment1 Polygon.java
Course:             SENG2200
Author:             Juyong Kim
Student No:         c3244203
Date:               05/03/2019
Description:        Creates a Node 
*/
public class Node
{
    private Node next;
    private Node previous;
    private Object data;

    public Node(Object dataValue)
    {
        next = null;
        previous = null;
        data = dataValue;
    }

    //setters
    public void setData(Object dataValue)
    {
        data = dataValue;
    }
    public void setNext(Node newNext)
    {
        next = newNext;
    }
    public void setPrevious(Node newPrevious)
    {
        previous = newPrevious;
    }

    //getters
    public Object getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
    public Node getPrevious()
    {
        return previous;
    }
    
}
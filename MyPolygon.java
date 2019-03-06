/*
Title:              Assignment1 MyPolygons.java
Course:             SENG2200
Author:             Juyong Kim
Student No:         c3244203
Date:               05/03/2019
Description:        Creates a circular linked list containing polygons 123
*/
public class MyPolygons
{
    private Node head;
    private Node current;
    private Node tail;
    private int size;

    public MyPolygons()
    {
        head = null;
        tail = null;
        current = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        if(head == null) 
        {
            return true;
        }
        else
        return false;
    }

    //if head is empty list is empty hense add to head
    //if head is not empty then just keep on adding things to the tail
    public void add(Object data)
    {
        if(size == 0)                       //if size is zero set data to head, current, tail
        {
            head = new Node(data);
            tail = head;
            current = head;
            size++;
        }
        else
        addTail(data);
    }

    public void addHead(Object data)
    {
        Node headTemp = new Node(data);

        head.setPrevious(headTemp);
        headTemp.setNext(head);

        head = headTemp;
        size++;

        headTemp = null;
    }

    //essentialy both add and add tail
    public void addTail(Object data)
    {
        //left in case, all nodes were deleted and addTail function was called
        if(size == 0)                       //if size is zero set data to head, current, tail
        {
            head = new Node(data);
            tail = head;
            current = head;
            size++;
        }
        else                                //else just add to the tail of the list
        {
            Node tempTail = new Node(data);

            tail.setNext(tailTemp);
            tailTemp.setPrevious(tail);

            tail = tailTemp;
            size++;

            tailTemp = null;
        }
    }

    public void insert(){}

    public void prepend(){}

    public void append(){}

    public int getSize()
    {
        return size;
    }
    
}
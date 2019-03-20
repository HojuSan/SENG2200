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
    private int total;
    private int size;

    public MyPolygons(int num)
    {
        this.head = null;
        this.current = null;
        this.tail = null;
        this.total = num;
        this.size = 0;
    }

    public MyPolygons()
    {
        this.head = null;
        this.current = null;
        this.tail = null;
        this.total = 0;
        this.size = 0;
    }

    public boolean isEmpty()
    {
        return head == null;
    }
    public int getSize()
    {
        return size;
    }
    public Node getCurrent()
    {
        return current;
    }

    //add elements to the back
    public void prepend(Polygon poly)
    {
        Node temp = new Node(poly);
        if(head == null)
        {
            temp.setNext(temp);
            temp.setPrevious(temp);
            head = temp;
            current = head;
            tail = head;
        }
        else
        {
            temp.setPrevious(tail);
            tail.setNext(temp);
            head.setPrevious(temp);
            temp.setNext(head);
            head = temp;
            current = head;
        }
        size++;

    }

    //add elements to the front
    public void append(Polygon poly)
    {
        Node temp = new Node(poly);       
        if (head == null)
        {
            temp.setNext(temp);
            temp.setPrevious(temp);
            head = temp;
            tail = head;
            current = tail;
        }
        else
        {
            temp.setPrevious(tail);
            tail.setNext(temp);
            head.setPrevious(temp);
            temp.setNext(head);
            tail = temp;
            current = tail;
        }
        size++;        
    }

    //insert into a position designated
    public void insert(Polygon poly, int pos)
    {
        //beginning starts at 0 not 1
        //cause we are civilized human beings
        Node temp = new Node(poly);   
        if (pos == 0)
        {
            prepend(poly);
            return;
        }           
        Node tempHead = head;
        for (int i = 1; i < size; i++)
        {
            if (i == pos)
            {
                Node temp2 = tempHead.getNext();
                tempHead.setNext(temp);
                temp.setPrevious(tempHead);
                temp.setNext(temp2);
                temp2.setPrevious(temp);
                current = temp;
            }
            tempHead = tempHead.getNext();           
        }
        size++ ;        
    }

//    //compares area and distances and sorts the array
//    public void insertionSort()
//    {
//        boolean sorted = false;
//        moveToHead();
//
//        while(sorted!=true)
//        {
//            sorted = true;
//
//            for(int i = 1; i < size; i++)
//            {
//                forward();
//
//                for(int j = i; j < 0; j--)
//                {
//                    if(current.getData().compare(current.getPrevious().getData()))
//                    {
//                        insert(current, j-1);
//                    }
//                } 
//            }
//        }
//
//    }

    //remove the head of the list
    public void removeHead()
    {
        if(size == 0)													//if listLength is zero just return									
		{
			return;															
		}
		else if (size == 1)											//if listLength is 1 means only one node, set everything to null
		{													
			head = null;													
			tail = null;											
			current = null;													
			size--;													//reduce listLength to 0
			return;															
		}
		else																
		{
			Node headTemp = head;											//create new node, saves head into headTemp
			head = headTemp.getNext();										//saves the next node as the new head															
			headTemp = null;	

			size--;													//reduces listLength by 1
		}
    }

    //directional control
    public void forward()
    {
        current = current.getNext();
    }
    public void backward()
    {
        current = current.getPrevious();
    }
    public void moveToHead()
    {
        current = head;
    }
    public void moveToTail()
    {
        current = tail;
    }

    //print
    public String printList()
    {
        String list = "";
        moveToHead();

        for(int i = 0; i < size; i++)
        {
            list += current.getData().toString()+"\n";
            //System.out.println(current.getData());
            forward();
        }

        return list;
    }
    
}
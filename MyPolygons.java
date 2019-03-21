import javax.lang.model.util.ElementScanner6;

/*
Title:              Assignment1 MyPolygons.java
Course:             SENG2200
Author:             Juyong Kim
Student No:         c3244203
Date:               05/03/2019
Description:        Creates a circular doubly linked list containing polygons
*/
public class MyPolygons 
{

    private Node head;
    private Node current;
    private Node tail;
    private int size;

    public MyPolygons()
    {
        this.head = null;
        this.current = null;
        this.tail = null;
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
    //used when adding a polygon to a certain location
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

    //ascending order insertionSort;
    public MyPolygons insertionSort()
    {
        //gets mypolygons size
        int num = this.size;

        //create an array of nodes containing polygons
        Polygon[] list = new Polygon[num];
        MyPolygons sorted = new MyPolygons();

        //move to the head of the list
        moveToHead();

        for(int t = 0; t < num; t++)
        {
            list[t] = current.getData(); 
            forward();
        }

        //printing array for testing purposes
        for(int n = 0; n < list.length; n++)
        {
            System.out.println("postion "+n+" is "+list[n]);
        }

        //int n = arr.length; 
        for (int i = 1; i < list.length; ++i) 
        { 
            //selects the first unsorted element
            Polygon key = list[i]; 
            int j = i - 1; 

            //loop shifts all the elements to right to create position
            //for unsorted element
            //while (j >= 0 && list[j] > key) 
            while(j >=0 && list[j].compare(key) == true)
            { 
                list[j + 1] = list[j]; 
                j = j - 1; 
            } 
            //inserts unsorted element into the correct position
            list[j + 1] = key; 
        } 

        System.out.println("");
        //printing array for testing purposes
        for(int n = 0; n < list.length; n++)
        {
            sorted.append(list[n]);
        }


        return sorted;   //create return a mypolygon 
    }

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
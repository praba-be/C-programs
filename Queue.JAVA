import java.io.*;
import java.util.*;

class queue
{
    private int rear=0,front=0,n=5,x;
    private int[] v=new int[n];
    public void enq(int a)
    {
        if((rear+1)%(n+1)==front)
            System.out.println("Queue is full");
        else
        {
            v[rear%n]=a;
            System.out.println(rear);
            rear++;
        }
            
    }
    public void deq()
    {
       if(front==rear) 
           System.out.println("Queue is Empty ");
       else
       {
            System.out.println(v[front]);
            front++;
       }
           
    }
    public void display()
    {
        x=front;
       while(x%n!=rear)
       {
           System.out.print(" "+v[x]);
           x++;
       }
    }
}

class cq
{
   public static void main(String args[]) throws Exception
   {
       try
       {
        int e,ch;
        Scanner s=new Scanner(System.in);
           queue q=new queue();
            do
            {
               System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display");
                ch=s.nextInt();
                switch(ch)
                {
                 case 1:
                    System.out.println("Enter the Element : ");
                    e=s.nextInt();
                     q.enq(e);
                    break;
                case 2:
                     q.deq(); 
                     break;
                 case 3:
                     q.display();
                    break;
                }
        }while(ch<=3);
    }
        catch(Exception e)
        {
         System.out.println(e);
        }
   }
}

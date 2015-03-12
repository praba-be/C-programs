import java.util.*;
import java.io.*;
class ll 
{
	class node
	{	
		public int data=0;
		public node link;
	}
        private node back=null;
        private node front=null;
	public void enQ(int a,int b)
	{
		node n=new node();
		n.data=a;
                n.link=null;
		if(front==null && 

back==null)
                {front=n; back=n;}
                else if(b==1)
                {
                    back.link=n;
                    back=n;
                }
                else
                {
                    n.link=front;
                    front=n;
                }
	}
	public void display()
	{
		
               try
               {
                 node n4=front;
                 node n=front.link;
		while(n4!=null)
		{
			

System.out.print("\t"+n4.data);
			n4=n4.link;
		}
               }
               catch(NullPointerException e)
               {
                   System.out.println("Queue IS 

Empty");
               }
	}
        public void dQ(int pos)
        {
            try
            {
                if(pos==1)
                {
                    node n=front;
                    while(n.link!=back)
                    {
                        n=n.link;
                    }
                    n.link=null;
                    back=n;
                }
                else
                {
                    node n=front.link;
                    front.link=null;
                    front=n;
                    
                }
            }
            catch(NullPointerException e)
            {
                System.out.println("Queue Is 

Empty");
            }
        }
        public void clear()
        {
            front=null;
            back=null;
        }
}

class dq
{
    public static void main(String args[])
    {
        ll l=new ll();
        l.enQ(2,1);
        l.enQ(3,1);
        l.enQ(1,0);
        //l.clear();
       l.display();
        l.dQ(1);
        l.enQ(0,1);
        l.display();
    }
}

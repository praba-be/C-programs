import java.util.*;
import java.io.*;
class ll 
{
	class node
	{	
		public int data=0;
		public node link;
	}
	private node head=null;
        private node temp=null;
	public void insert(int a)
	{
		node n=new node();
		n.data=a;
		if(head==null && 

temp==null)
                {    head=n; temp=n;}
                else
                {
                    temp.link=n;
                    temp=n;
                    sort(n);
                }
	}
	public void display()
	{
		node n4=head;
		while(n4!=null)
		{
			

System.out.print("\t"+n4.data);
			n4=n4.link;
		}
	}
        private void sort(node n)
	{
		node t1=head;
                int x;
                while(t1!=null)
                {
                    if(t1.data<n.data)
                    {
                        t1=t1.link;
                    }
                    else
                    {
                        x=t1.data;
                        t1.data=n.data;
                        n.data=x;
                        t1=t1.link;
                    }
                    
                }
	}

}

class llsort
{
	public static void main(String 

args[])
	{
            ll l=new ll();
            l.insert(7);
            l.insert(3);
            l.insert(8);  
            l.insert(2);
            l.display(); 
	}
}

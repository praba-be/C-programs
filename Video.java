import java.io.*;
import java.util.*;


class sort
{
     class node
    {	
	public String name;
        public String id;
	public node link;
    }
     private node head=null;
     private node temp=null;
     private int count=0;
        public void insert(String a)
	{
                count++;
                a=a.toLowerCase();
		node n=new node();
		n.name=a;
                n.id="vid"+count;
		if(head==null && temp==null)
                {    head=n; temp=n;}
                else
                {
                    temp.link=n;
                    temp=n;
                }
                sort(n);
	}
	public void display()
	{
		node n1=head;
                System.out.println("--------\n Name & ID \n---------");
		while(n1!=null)
		{
			System.out.println(n1.name+" & "+n1.id);
			n1=n1.link;
		}
	}
        private void sort(node n)
	{
		node t1=head;
                String x,y;
                while(t1!=null)
                {
                    if(t1.name.compareTo(n.name)<0)
                    {
                        t1=t1.link;
                    }
                    else
                    {
                        x=t1.name;
                        y=t1.id;
                        t1.name=n.name;
                        n.name=x;
                        t1.id=n.id;
                        n.id=y;
                        t1=t1.link;
                    }
                    
                }
	}
        public void search(String a)
        {
            node n1=head;
            int i,y=a.length();
            System.out.println("---------\n Name/ID \n---------");
            while(n1!=null)
            {
                for(i=0;i<=n1.name.length()-y;i++)
                {
                   if(a.equals(n1.name.substring(i,i+y)))
                    {
                        System.out.println(n1.name+"/"+n1.id);
                    }
                }
                if(n1.id==a)
                     System.out.println(n1.name+"/"+n1.id);
                 n1=n1.link;
            }
        }
}

class video
{
    public static void main(String args[])
    {
        int a; String n,id;
         sort s=new sort();
       Scanner x=new Scanner(System.in);
       do
       {
            System.out.println("1.Insert\n2.Display\n3.Search");
            System.out.println("Enter Your Choice : ");
            a=x.nextInt();
            switch(a)
            {
                case 1:
                    System.out.println("Enter Name : ");
                    n=x.next();
                    s.insert(n); break;
                case 2:
                    s.display(); break;
                case 3:
                    System.out.println("Enter Name or Id : ");
                    n=x.next();
                    n=n.toLowerCase();
                    s.search(n); 
                    break;
            }      
        }while(a<=3);
    }
}

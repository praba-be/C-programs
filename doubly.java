import java.util.*;
class dl 
{
	class node
	{	
		public int data=0;
		public node prev;
                public node next;
	}
	 node temp=null;
         node head=null;
	public void insert(int a)
	{
		node n1=new node();
		n1.data=a;
		n1.next=n1.prev=null;
		if(head==null && temp==null)
                {
                    head=n1;
                    temp=n1;
                }
                else
                {
                    temp.next=n1;
                    n1.prev=temp;
                    temp=n1;
                }
	}
	public void display()
	{
		node n2=head;
		while(n2!=null)
		{
			System.out.print("\t"+n2.data);
			n2=n2.next;
		}
	}
        public void search(int a)
        {
            node n2=head;
            int f=1;
            while(n2!=null)
            {
                if(n2.data==a)
                {
                    System.out.println("The Element is present in the list");
                    f=0;
                    break;
                }
                else
                    n2=n2.next;
            }
            if(f==1)
                System.out.println("element not found");
        }
        public int retrieveAtIndex(int a)
        {
            int x=1;
            node n2=head;
            while(x!=a && n2!=null)
            {
                n2=n2.next;
                x++;
            }
            if(x!=a && n2==null)
            {
                x=a;
                System.out.print("No Such Index ");
            }
            else
                x=n2.data;
            return(x);
        }
        public void deleteAtIndex(int a)
        {
             int x=1,c=1;
            node n2=head;
            node n1=head;
            while(x!=a && n2!=null)
            {
                n2=n2.next;
                x++;
            }
            if(x==a && n2==null)
            {
                while(c!=a-1)
                    n1=n1.next;
                n1.next=null;
            }
            else if(x!=a && n2==null)
            {
                System.out.println("Wrong Index");
            }
            else if(a==1)
            {
                head=head.next;
                head.prev=null;
            }
            else
            {
                node n3=n2.prev;
                node n4=n2.next;
                n3.next=n4;
                n4.prev=n3;
            }
        }
        public void insertAtIndex(int a,int val)
        {
            if(a==1)
            {
                node n=new node();
                n.data=val;
                n.prev=null;
                n.next=head;
                head.prev=n;
                head=n;
            }
            else
            {
                int x=1;
                node n2=head;
                while(x!=a && n2!=null)
                {
                    n2=n2.next;
                    x++;
                }
                if(a==(x+1))
                {
                     insert(val);
                }
                else if(x!=a && n2==null)
                {
                    System.out.println("Wrong Index");
                }
                else
                {
                    node n=new node();
                    n.data=val;
                    n.prev=n2.prev;
                    n2.prev.next=n;
                    n.next=n2;
                    n2.prev=n;
                }
            }
        }
        public int[] getArray()
        {
            node n2=head;
            node n3=head;
            int[] a;
            int count=0;
            while(n2!=null)
            {
                n2=n2.next;
                count++;
            }
            a=new int[count];
            count=0;
            while(n3!=null)
            {
                a[count++]=n3.data;
                n3=n3.next;
            }
            return a;
        }
}

class dob
{
	public static void main(String args[])
	{
            dl d=new dl();
            d.insert(5);
            d.insert(4);
            d.insert(3);
            d.insert(2);
           d.search(1);
            System.out.println(" "+d.retrieveAtIndex(6));
            d.deleteAtIndex(4); //ERROR
            d.insertAtIndex(1,1);
            d.display();
            System.out.println("\n");
            int[] z=d.getArray();
            for(int i=0;i<z.length;i++)
                System.out.print(" "+z[i]);
            
	}
}

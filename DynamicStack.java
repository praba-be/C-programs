import java.util.*;
class ll 
{
	class node
	{	
		public int data=0;
		public node next;
	}
	private node top=null;
         //node tail=null;
	public void push(int a)
	{
		node n1=new node();
		n1.data=a;
                n1.next=null;
                if(top==null)
                {
                    top=n1;
                    //tail=n1;
                }
                else
                {
                    n1.next=top;
                    top=n1;
                }
		
	}
        public int peek()
        { if(top==null)
            {System.out.println("Stack is Empty "); return 0;}
          else
            return top.data;
        }
	public void display()
	{
		node n=top;
		while(n!=null)
		{
			System.out.print("\t"+n.data);
			n=n.next;
		}
                System.out.println();
	}
	public int pop()
	{
            int x;
            if(top==null)
            {System.out.println("Stack is Empty "); return 0;}
            else
            {
                node n=top;
		x=top.data;
                top=top.next;
            }
            return x;
	}
        public void clear()
        {
            top=null;
        }

}

class dystack
{
	public static void main(String args[])
	{
		ll l=new ll();
                /*l.push(9);
                l.push(8);
                l.push(7);
                l.push(6);
                l.push(5);
                l.display();
                System.out.println(l.peek());*/
                System.out.println(l.pop());
	}
}

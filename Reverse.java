import java.util.*;
class ll 
{
	class node
	{	
		public int data=0;
		public node link;
	}
        int i;
	 node n2=null;
	public void push(int a[])
	{
            for(i=0;i<a.length;i++)
            {
                node n1=new node();
		n1.data=a[i];
		n1.link=n2;
		n2=n1;
            }
	}
	public void display()
	{
		node n4=n2;
		while(n4!=null)
		{
			System.out.print("\t"+n4.data);
			n4=n4.link;
		}
	}
}

class rev
{
	public static void main(String args[])
	{
		int size,ch,count;
		Scanner s=new Scanner(System.in);
                System.out.println("Enter the size : ");
                size=s.nextInt();
                int[] x=new int[size];
		
		ll l=new ll();
		System.out.println("Enter the elements  :");
                for(count=0;count<size;count++)
                 {
                    x[count]=s.nextInt();
                 }
                l.push(x);
                l.display();
        }
}
					
				
			
						
			
	

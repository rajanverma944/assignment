import java.util.Scanner;
class vote
{
	

	public static void main(String args[])
	{
		int a,b,c;
  Scanner s=new Scanner(System.in);
  a=s.nextInt();
   b=s.nextInt();
    c=s.nextInt();
    if(a>b && a>c)
    {
    	System.out.println("A is the greatest");

    }
        if(b>a && b>c)
    {
    	System.out.println("B is the greatest");
    	
    }
        if(c>b && c>a)
    {
    	System.out.println("C is the greatest");
    	
    }
       }
}

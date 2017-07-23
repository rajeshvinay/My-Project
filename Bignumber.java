class Compare
{       
static private int p;
static protected int q;
static int r; 
Compare(int x,int y, int z)
	{
	p=x;
	q=y;
	r=z;
	Compare.getNum();
	Compare.findBigNumber(p,q,r);
	}
static void getNum()
	{
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
	}
static void findBigNumber(int a,int b,int c)
	{	
	if ( a>b && a>c )
         System.out.println("First number is largest.");
       if ( b>a && b>c )
         System.out.println("Second number is largest.");
       if ( c>a && c>b )
         System.out.println("Third number is largest.");
      else   
         System.out.println("The numbers are not distinct.");	
	}
}
 class Bignumber
{
	public static void main(String args[])
	{
	 Compare g = new Compare(25,65,76);
	}
}

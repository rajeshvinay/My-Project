

class arrexe
{
	public static void main(String args[])
{

	int k[]=new int[5];
	try
{
	k[6]=20;
	System.out.println("the number is"+k[3]);
}
	catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println(e);
}
}
}


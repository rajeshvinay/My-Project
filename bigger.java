 class bigger
{
public static void main(String args[])
{
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	int d=Integer.parseInt(args[3]);
	int e=Integer.parseInt(args[4]);

	if(a>b&&a>c&&a>d&&a>e)
{
	System.out.println("the biggest number is "+a);
}
	if(b>a&&b>c&&b>d&&b>e)
{
	System.out.println("the biggest number is "+b);	
}
	if(c>a&&c>b&&c>d&&c>e)
{
	System.out.println("the biggest number is "+c);
}
	if(d>a&&d>b&&d>c&&d>e)
{
	System.out.println("the biggest number is "+d);
}
	if(e>a&&e>b&&e>c&&e>d)
{
	System.out.println("the biggest number is "+e);
}
	else
{
	System.out.println("all values are distinct");
}
}
}

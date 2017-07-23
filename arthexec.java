import java.util.Scanner;
class arthexec
{
public static void main(String args[])
{
	Scanner ss=new Scanner(System.in);
	System.out.println("enter the number");
	int a=ss.nextInt();
	System.out.println("enter the number");
	int b=ss.nextInt();
	try
{
	int d=a/b;
	System.out.println("the reminder"+d);
}
	catch(ArithmeticException e)
{
	System.out.println(e);
}
}
}

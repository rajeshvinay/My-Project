import java.util.Scanner;
class Check
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
System.out.println("block is terminated");
}
double c=b/a;
System.out.println("the quotient"+c);

int k[]=new int[5];
k[3]=20;
System.out.println("the number is"+k[3]);
String s="null";
int t=s.length();
//boolean t=s.equals("null");
System.out.println(t);
}
}

import java.util.Scanner;
class Big
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the first number");
int a=s.nextInt();
System.out.println("enter the second number");
int b=s.nextInt();
System.out.println("enter the third number");
int c=s.nextInt();
System.out.println("enter the fourth number");
int d=s.nextInt();
if(a==b&&c==d)
{
System.out.println("all numbers are equal ");
}
if(a>b&&a>c&&a>d)
{
System.out.println("a is big");
}
if(b>a&&b>c&&b>d)
{
System.out.println("b is big");
}
if(c>a&&c>b&&c>d)
{
System.out.println("c is big");
}
else
{
System.out.println("d is big");
}
}
}

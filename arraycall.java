import java.util.Scanner;
class arraycall
{
public static void main(String args[])
{
	int a[][];
	int i=0,j=0;
	Scanner ss=new Scanner(System.in);
	System.out.println("enter n value");
	int n=ss.nextInt();
	a=new int[n][n];
	for(i=0;i<n;i++)
{
	System.out.println("enter the values");
	for(j=0;j<n;j++)
{
	a[i][j]=ss.nextInt();
}
}
	for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
{
	System.out.print(a[i][j]+" ");
}
	System.out.println();
}
}
}


class Array
{
public static void main(String args[])
{
/*System.out.println(args[0]);
System.out.println("the name is "+args[0]);
System.out.println("the name is "+args[1]);
System.out.println("the name is "+args[2]);
System.out.println("the name is "+args[3]);
System.out.println("the name is "+args[4]);
System.out.println();*/
int a[]={10,20,30,40,50},index,sum;
int result=0;
for(index=4;index>=0;index--)
{
System.out.println((index+1)+" element is "+a[index]);

}
result=result+a[index];

System.out.println("the sum is "+result);
//System.out.println();

//sum=(a[0]+a[1]+a[2]+a[3]+a[4]);
/*if((a[4]>a[3])&&(a[3]>a[2])&&(a[2]>a[1])&&(a[1]>a[0]))
{
System.out.println();
System.out.println("greater number in the array list is "+a[4]);
}
System.out.println();
long mul=(a[0]*a[1]*a[2]*a[3]*a[4]);
System.out.println("the multiplication is "+mul);
/*if((a[4]<a[3])&&(a[3]<a[2])&&(a[2]<a[1])&&(a[1]<a[0]))
{
System.out.println();
System.out.println("greater number in the array list is "+a[0]);
}*/
}

}


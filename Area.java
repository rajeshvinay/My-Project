class Prog
{
double radius;
int a;
int b;
int c;
double d;

public double method(double radius)
{
this.radius=radius;
double x=(3.14*radius*radius);
System.out.println("the area of circle is "+x);
return x;
}

public int method(int a)
{
this.a=a;
int y=(4*a);
System.out.println("the area of square is "+y);
return y;
}
public int method(int a,int b)
{
this.a=a;
this.b=b;
int y=a*b;
System.out.println("the area of triangle is "+y);
return y;
}
public double method(int c,double d)
{
this.c=c;
this.d=d;
double z=c*d;
System.out.println("the area of rectangle is "+z);
return z;
}
}

class Area
{
public static void main(String args[])
{
Prog aa = new Prog();
aa.method(2.35);
aa.method(43);
aa.method(23,233);
aa.method(4,5.234);
}
}

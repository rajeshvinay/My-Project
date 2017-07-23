
import java.io.*;
class big
{
public static void main(String args[]) throws Exception
	{
	int temp=Integer.parseInt(args[0]);
	for(int i=1;i<5;i++)
	{
	if(temp<Integer.parseInt(args[i]))
	{
	temp=Integer.parseInt(args[i]);
	}
	}
	System.out.println("Big number = "+temp);
        }
}


package com.stackroute.pe1;

import java.util.Scanner;

public class Loop {
	void method()
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the input");
			int r=s.nextInt();
			s.close();
			
for(int i=1;i<=r;i++)
{
	for(int j=1;j<=i;j++)
	{
	   System.out.print(i);
}
}
}
public static void main(String args[])
{
Loop ob=new Loop();
ob.method();
}
}
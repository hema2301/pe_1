package com.stackroute.pe1;
import java.util.Scanner;

public class Tomjerry {
void method()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	s.close();
	if(n>20 && n<30)
	{
	if(n%2==0)
	{
		System.out.println("Jerry");
	}
	else {
		System.out.println("Tom");
	}
}
}

public static void main(String args[])
{
	Tomjerry ob=new Tomjerry();
	ob.method();
}
}
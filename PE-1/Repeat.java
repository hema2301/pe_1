package com.stackroute.pe1;

import java.util.Scanner;

public class Repeat {
	public static void main(String args[])
	 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the word/string:");
	String str=s.next();
	System.out.println("Enter the number:");
	int n=s.nextInt();
	s.close();
	System.out.print(str);
	char c[]=str.toCharArray();
	for(int i=0;i<n;i++)
	{
		for(int j=n;j<c.length;j++)
		{
		System.out.print(c[j]);
	}
}
}
}
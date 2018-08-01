package com.stackroute.pe1;

import java.util.Scanner;

public class Reverse {
	 public static void main(String args[])
	 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the word/string:");
	String str=s.next();
	s.close();
	char c[]=str.toCharArray();
	for(int i=c.length-1;i>=0;i--)
	{
		System.out.print(c[i]);
	}
}
}
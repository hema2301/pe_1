package com.stackroute.pe1;

import java.util.Scanner;

public class Range {
	public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Guess the number from 1-100...");
        int n = s.nextInt();
        s.close();
        if(n>=1 && n<=100)
        {
        	int a=23;
        	if(a<n) {
        		System.out.println("Number guessed is more than original number");
        	}
        	if(a>n) {
        		System.out.println("Number guessed is less than original number");
        	}
        	if(a==n)
        	{
        		System.out.println("Number guessed is correct...");
        	}
        }
        	else
        	{
        		System.out.println("Number not in range");
        	}
        }
}
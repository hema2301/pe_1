package com.stackroute.pe1;

import java.util.Scanner;

public class Palindrome {
int rem,temp,sum=0;
void palindrom() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	sc.close();
	temp=n;
	while(n>0)
	{
	rem=n%10;
	sum=(sum*10)+rem;
	n=n/10;
	}
	if(temp==sum)
	{
		int s=0,r;
		while(sum>0)
		{
			r=sum%10;
			if(r%2==0)
			{
				s=s+r;
			}
				sum=sum/10;
		}
		if(s>25) {
					
		System.out.println("The number is palinddrome & sum of even no is greater than 25");
		
	}
		else {
			System.out.println("The number is palinddrome & sum of even no is not greater than 25");
		}
	}
	else {
		System.out.println("The number is not palindrome");
	}
}
public static void main(String args[])
{
	Palindrome pal= new Palindrome();
		pal.palindrom();
}
}
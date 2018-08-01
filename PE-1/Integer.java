package com.stackroute.pe1;
import java.util.Scanner;

public class Integer {
	
			 public static void main(String args[])
			    {
			        int sum=0, num;
			        Scanner s= new Scanner(System.in);
					System.out.print("Enter the no of numbers to be added...");
			        int n = s.nextInt();
					System.out.print("Enter " +n+ " numbers : ");
					
			        for(int i=0; i<n; i++)
			        {
			            num = s.nextInt();
			            sum = sum + num;
			        }
			        s.close();
			        System.out.print("Sum of all the numbers is " +sum);
			    }
			}

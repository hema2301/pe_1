package com.stackroute.pe1;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {
		 public static void main(String args[])
		    {				 
			 	Scanner s=new Scanner(System.in);
			 	System.out.println("Enter the number:");
				int a=s.nextInt();
				s.close();
				int num=a;
				char[] c = (""+num).toCharArray();
				Arrays.sort(c);
				StringBuilder sb = new StringBuilder();
				sb.append(c);
				sb.reverse();
				System.out.println(sb);
			//System.out.println(new StringBuilder().append(c).reverse());
	//append()     Appends the argument to this string builder. 
	   	   //The data is converted to a string before the append operation takes place.
	//reverse()    Reverses the sequence of characters in this string builder.
				int sum=0,n;
				while(num>0)
				{
					n=num%10;
				if(n%2==0)
				{
					sum=sum+n;
				}
					num=num/10;
				}
				System.out.println("Sum of Even nos:" +sum);

		 if(sum>15) {
	
			 System.out.println("True");

}
		 else {
			 System.out.println("False");
		 }
		    }
}


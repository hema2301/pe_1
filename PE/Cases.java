package com.stackroute.pe1;
import java.util.Scanner;
public class Cases {
    public static void main(String args[])
    {
   			Scanner s=new Scanner(System.in);
			System.out.println("Enter the alphabet/number/symbol:");
			String str=s.next();
			s.close();
		char c=str.charAt(0);	 
    	
				//ASCII values//
		
		if(c >= 97 && c <= 122)	
        {
            System.out.println("Lower Case(Small letter)");
        }
        else if(c >= 65 && c <= 90)	
        {
            System.out.println("Upper Case(Capital letter)");
        }
        else if(c >= 48 && c <= 57)	
        {
            System.out.println("Digit(Numbers)");
        }
        else if ((c>32 && c<=47)||(c>=58 && c<=64)||
                (c>=91 && c<=96)||(c>=123 && c<=127))	
        {
        	System.out.println("Symbol(Special characters)");
    }
}
}
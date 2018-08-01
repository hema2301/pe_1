package com.stackroute.pe1;
import java.util.Scanner;
public class Vowel {
	void method()
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the letter or word");
			String str=s.next();
			s.close();
			for(int i=0;i<str.length();i++) 
			{
			char c=str.charAt(i);	 
			
	if(c>='a' && c<='z' || c>='A' && c<='Z')  
{
	if(c=='a' ||c=='e' || c=='i'|| c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
	System.out.println("It is a vowel");
}
	else
{
	System.out.println("It is a consonent");	
}
}
else
{
	System.out.println("Error... It is not a letter.!!");
}
			}
	}
public static void main(String args[])
{
	Vowel ob=new Vowel();
	ob.method();
}
}
package com.globalLogic;
import java.util.Scanner;
public class StringPalli 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str,reve="";
		str=sc.nextLine();
		int length=str.length();
		for(int i=length-1;i>=0;i--)
			reve=reve+str.charAt(i);
		if(str.equals(reve))
			System.out.println("Given string is pallindrome");
		else
			System.out.println("Given string is not pallindrome");		
		

	}

}

//Write a program to check if the letter 'e' is present in the word "Umbrella"
package com.globalLogic;

public class StringUmbrella 
{

	public static void main(String[] args) 
	{
		String str="Umbrella";
		boolean stri=false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='e')
			{
				stri=true;
				System.out.println("letter 'e' is found");
				break;
			}
				
		}
		

				

	}

}

//write a program to find the first and last occurence of letter 'o' and character ',' in "Hello World"
package com.globalLogic;

public class FindCharacter {

	public static void main(String[] args) 
	{
		String str="Hello, World";
		
		char[] arr=str.toCharArray();
		for(char ch:arr)
		{
			if(ch==',')
				System.out.println("letter found="+ch);		
		}
		for(char chs:arr)
		{
			if(chs=='o')
			{
				System.out.println("letter found="+chs);
				break;
			}
				
			
		}

	}

}

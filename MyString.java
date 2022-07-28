package com.globalLogic;
public class MyString 
{
	public static void main(String[] args) 
	{
		String str="Hello World";
		String str1="Hello World";
		
		String str2=new String("hey");
		
		System.out.println(str1);
		String st3=new String("java");
		
		String str4=str2.concat(st3);
		System.out.println(str4);
		
		char[] ch=str4.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		StringBuffer stb=new StringBuffer("java");
		System.out.println(stb);
		System.out.println(stb.capacity());
	}

}

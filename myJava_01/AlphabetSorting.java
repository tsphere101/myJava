import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AlphabetSorting{

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String temp = "";
	int amount = 0;
	
	String a = ""; String b = "";
		while(true)
		{
			a = sc.nextLine();
			b = sc.nextLine();
			System.out.println("RESULT:" +whichFirst(a, b));
		}


	}
	
	public static String whichFirst(String a , String b)
	{
		return whichFirst(a,b,0);
	}
	public static String whichFirst(String a , String b, int pos)
	{
		if(a.equals(b)) // case of a and b is the same string
		return a; // return whatever 'cause they're the same.

		//Check for pos not to exceed the shortest string
		int shorter_length = 0;
		if(a.length() < b.length())
		shorter_length = a.length();
		else if (b.length() < a.length())
		shorter_length =b.length();
		else // length is equal
		{
			shorter_length = a.length();
		}
		
		System.out.println("SHORTER_LENGTH:"+shorter_length);
		System.out.println("CHECKING INDEX:"+pos);
		//if the pos exceed the limit of shorter_length // EX. AAAaa and AAA
		if(pos >= shorter_length)
		{
			System.out.println("INDEX EXCEED::ENTERING LENGTH COMPARISON");
			if (a.length() < b.length())
			return a;
			else if (b.length() < a.length())
			{
				return b;
			}
		}


		if(a.charAt(pos) < b.charAt(pos)) // if character at index "pos" has less ascii value that means that character comes first alphabetically 
		{
			return a;
		}
		else if (b.charAt(pos) < a.charAt(pos))
		{
			return b;
		}
		else // if the character is the same,at the particular pos, we have to determine which string is longer
		{
			System.out.println("SAME CHARACTER AT INDEX:" + pos + "::CHECKING NEXT INDEX...");
			return whichFirst(a,b,++pos);
		}
	}
}

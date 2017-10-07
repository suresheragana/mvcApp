package training.java;
import java.util.*;
public class VowelsArraysArrayLists
{
	public static void main(String[] args)
	{
		
		//fill your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
			s[i]=sc.next();
		UserMainCode u=new UserMainCode();
		ArrayList<String> al=u.matchCharacter(s);
		for(String s1:al)
			System.out.println(s1);
	}
}

class UserMainCode
{
	public static ArrayList<String> matchCharacter(String[] ss)
	{
		ArrayList<String> al=new ArrayList<String>();
		ArrayList<Character> a=new ArrayList<Character>();
		a.add('a');
		a.add('e');
		a.add('i');
		a.add('o');
		a.add('u');
		a.add('A');
		a.add('E');
		a.add('I');
		a.add('O');
		a.add('U');
		for(int i=0;i<ss.length;i++)
		{
			if(a.contains(ss[i].charAt(0))&&a.contains(ss[i].charAt(ss[i].length()-1)))
				al.add(ss[i]);
		}
		//fill your code here
		return al;
	}
}



/*
 * 
 * "Write a program to read an array of strings and return 
 * an arraylist which consists of words whose both first and 
 * last characters are vowels. Assume all inputs are in lowecase.
 *  In VowelsArraysArrayLists class you will find a static method
 *   matchCharacter which accepts a string array. The return type
 *    shoud be an arraylist which should contain elements as mentioned 
 *    above. In VowelsArraysArrayLists class it should accept Input
 *     array and 
 * call the static method within a main method."
 * 
 * */

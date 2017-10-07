package training.java.difference;

import java.util.Arrays;
import java.util.Scanner;

public class Differencebetweenlargestandsmallestelements {
	
	public static void main(String[] args)
	{
		//fill your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println(display(a));
		
	}

public static int display(int []a)
{	
	//fill your code here
	
	 if(a.length==1){
		 return a[0];
	 }
	 Arrays.sort(a);
	 return a[a.length-1]-a[0];
	
	
	}
}

/*

Given a method taking an int array having size more than or equal to 1 as input. 
Write code to return the difference between the largest and smallest elements in 
the array. If there is only one element in the array return the same element as output.
 
Include a class UserMainCode with a static method getBigDiff which accepts a integer 
array as input.
 
The return type of the output is an integer which is the difference between the
 largest and smallest elements in the array.
 
Create a Main class which gets integer array as an input and call the static 
method getBigDiff present in the UserMainCode.

*/
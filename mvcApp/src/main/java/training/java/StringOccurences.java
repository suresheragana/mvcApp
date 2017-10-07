package training.java;
import java.util.StringTokenizer;
import java.util.Scanner;

public class StringOccurences {

public static void main(String[] args) {

	//fill your code here
	Scanner sc = new  Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(countNoOfWords(s1, s2));
}

public static int countNoOfWords(String s1, String s2) {
	
	String[] x1  = s1.split(" ");
		String[] x2 = s2.split(" ");
		String x = x2[1];
		int count =0;
		for(String s:x1)
		{
			if(s.equals(x)){
				count++;
			}
		}
		
		return count;
}
}
/*
problem:

"Obtain two strings from user as input. Your program should count 
the number of occurences of second word of second sentence in the first sentence. 
Return the count as output. Note - Consider case. 
In StringOccurences class you will find a static method countNoOfWords which
 accepts two string variables. The return type is the modified string.
 In StringOccurences class it should accept two Input strings and
  call the static method present within the main method. "

*/
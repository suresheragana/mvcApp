package training.java;

import java.util.*;

public class ColorCode {

public static void main(String[] args) {

	
	//fill your code here
	
		System.out.println(validateColorCode(new Scanner(System.in).next())==1?"valid":"Invalid");
	
	}

public static int validateColorCode(String s1) {
	
	//String x =s1.substring(1);
	//fill your code here
	return (s1.charAt(0) == '#' && s1.length() == 7 && s1.substring(1).matches("^[A-F0-9]*$"))?1:-1;
			
	
}
}


/*
"Write a program to read a string and validate whether the given 
string is a valid color code based on the following 

rules: - Must start with ""#"" symbol 
- Must contain six characters after # 
- It may contain alphabets from A-F or digits from 0-9
 In ColorCode class you have a static method validateColorCode 
 which accepts a string. The return type (integer) 
 should return 1 if the color is as per the rules else return -1.
  In ColorCode class
 it should accept a String and call the static method with in the main method. "

*/
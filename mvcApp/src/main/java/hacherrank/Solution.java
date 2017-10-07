package hacherrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i=0;i<=k;i++){
        	int item=a[0];
        	int j;
            for(j=0;j<a.length-1;j++){
            	System.out.println(j);
                a[j]=a[j+1];
                
            }
            a[j]=item;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}

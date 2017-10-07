package hackersearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr=new PrintWriter(System.out);
		int T=Integer.parseInt(br.readLine().trim());
		for(int i=0;i<T;i++){
			int n=Integer.parseInt(br.readLine());
			System.out.println(solve(n));
		}
		
		
	}
	public static int solve(int x){
		int b=0;
		while(x>0){
			b=b+x%2;
			x=x/2;
		}
		
		return b;
	}

}

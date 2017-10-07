package skillenza;

import java.util.Scanner;

public class UniqueLatters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1");
		String str = sc.next();
		int n = sc.nextInt();
		int count[] = new int[n];
		for(int i=0;i<count.length;i++)
			count[i]=0;
		String frds[] = new String[n];
		for (int i = 0; i < n; i++) {
			frds[i] = sc.next();
		}

		for (int frd = 0; frd < n; frd++) {
			for (int i = 0; i < str.length(); i++) {

				for (int j = 0; j < frds[frd].length(); j++) {
					if (str.charAt(i) == frds[frd].charAt(j)) {
						count[frd]++;
						break;
					}
				}

			}
		}
		
		int max=0;
		
		for(int i=0;i<count.length;i++){
			for(int j=0;j<=i;j++)
				if(count[i]<count[j])
					max=count[j];
		}

		System.out.println(max);
	
		/*
		 * System.out.println("enter name"); String str1=sc.nextLine();
		 * System.out.println(str1.length()); int count=0; System.out.println(
		 * "enter another name"); String str2=sc.nextLine();
		 * System.out.println(str2.length()); if(str1.length()<str2.length()){
		 * for(int i=0;i<str1.length();i++){ for(int j=0;j<=i;j++){
		 * if(str1.charAt(i)==str2.charAt(j)){ count++;
		 * System.out.println("matched"); }
		 * 
		 * } } System.out.println((str2.length()-count)); } else
		 * System.out.println("0");
		 */
	}

}

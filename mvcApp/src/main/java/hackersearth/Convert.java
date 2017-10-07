package hackersearth;

import java.util.Scanner;
public class Convert
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length:");
        n = s.nextInt();
        String x[]=new String[n];
        
        Convert obj = new Convert();
        for(int i=0;i<x.length;i++)
        x[i] = obj.binary(s.nextInt());
	int xcount[]=new int[n];
	for(int j=0;j<x.length;j++)
	for(int i=0;i<x[j].length();i++)
	{
		if(x[j].charAt(i)=='1')
			xcount[j]++;
	}
	for(int i=0;i<xcount.length;i++)
        System.out.println("number of 1s "+xcount[i]);
	for(int i=0;i<x.length;i++)
		System.out.println("string is "+x[i]);
    }
    String binary(int y)
    {
        int a;
        if(y > 0)
        {
            a = y % 2;
            return (binary(y / 2) + "" +a);
        }
        return "";
    }
}
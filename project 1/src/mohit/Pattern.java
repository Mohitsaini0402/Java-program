package mohit;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) 
	{
		Scanner sn= new Scanner(System.in);
		System.out.println("enter no");
		int n=sn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j || i+j==n-1)
				{
					System.out.println("*");
				}
				else
				{
					System.out.println(" ");
				}
			}
		}
}
}
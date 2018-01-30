package mohit;

import java.util.Scanner;

public class Nesfor {
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("enter no");
		int n=sn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
		{
			System.out.print(" ");
		}
			for(int k=0; k<=i;k++)
			{
				System.out.print("*");
			
			}
		
			for(int z=0;z<i;z++)
			{
				System.out.print("*");
			}
			System.out.println("");
}
}
}

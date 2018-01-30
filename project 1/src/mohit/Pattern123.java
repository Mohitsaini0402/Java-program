package mohit;

import java.util.Scanner;

public class Pattern123 {
public static void main(String[] args) {
	Scanner sn= new Scanner(System.in);
	System.out.println("enter no");
	int n=sn.nextInt();
	int number=1,j,i,k;
	for( i=0;i<n;i++)
	{
		for( j=n;j>i;j--)
		{
	
				System.out.print(" ");
			}
			number=1;
			for ( k=0;k<=i;k++)
			{
				System.out.print(number+" ");
				number=number*(i-k)/(k+1);
			}
		System.out.println("");
}
}
}

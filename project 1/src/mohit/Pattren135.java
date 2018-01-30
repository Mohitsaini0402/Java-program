package mohit;

import java.util.Scanner;

public class Pattren135 {
public static void main(String[] args) {

	Scanner sn= new Scanner(System.in);
	System.out.println("enter no");
	int n=sn.nextInt();
	int number=1,j,i,k;
	for( i=0;i<n;i++)
	{
		for( j=0;j<n;j++)
		{
			
				System.out.println(" ");
			}
		number=1;
		for ( k=0;k<=i;k++)
		{
			System.out.println(number+" ");
		   number=number+2;
		}
	System.out.println("");
}
}
	
}

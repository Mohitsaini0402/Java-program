package mohit;

import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		
	Scanner sn= new Scanner(System.in);
	System.out.println("enter a number");
	int n=sn.nextInt(),temp,a;
	int c=0;
	temp=n;
	while(n>0)
	{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
	}
	if(temp==c)
	
	{
		System.out.println("number is aremstrong");
	}
	

	else
		{
		System.out.println("number is not aremstrong");
		}
	
}
}
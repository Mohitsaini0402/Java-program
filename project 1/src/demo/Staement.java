package demo;
import java.util.Scanner;
public class Staement {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	int a=scan.nextInt();
	System.out.println("enter value ");
	int b=scan.nextInt();
	System.out.println("enter value ");
	int c=scan.nextInt();
	System.out.println("enter value ");
	if (a>b) {
		
		if(a>c)  {
			System.out.println("value ia"+a);
			
		}
		
		else if (b>a)		
	{
      if(b>c)                                                                                                                                                      
		{
    	  	System.out.println("value is"+b);
		}
	}
else {
	System.out.println("value is"+c);
	}
	}

/*conditional operater
int val= a>b? a>c? a :c : b>c? b :c;
System.out.println("grater is ="+val);*/
}
}
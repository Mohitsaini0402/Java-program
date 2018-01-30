package mohit;
import java.util.Scanner;
public class atm {
public static void main(String[] args) {
	Scanner sn= new Scanner(System.in);
	System.out.println("welcome");
	System.out.println("enter your pin");
	int en=sn.nextInt();
	int pin=1234;
	System.out.println("enter user name");
	String user=sn.next();
	String us="mohit";
	int bal=20000000;
	if (en==pin && us==user)
	{
	System.out.println("press1 for balance enquiry");
	System.out.println("press2 for withdrawal");
	System.out.println("press3 for deposit");
	System.out.println("press4 for exit");
	int n=sn.nextInt();
	do
		{
		switch(n)
		
	{
		case 1:
			System.out.println(" Your balance is "+bal);
			break;
		case 2:
			System.out.println("enter money to withdrawl ");
			int wd=sn.nextInt();
			
			bal=bal-wd;
			System.out.println("Your balance after withdrowl is= "+bal);
			break;
		case3:
			System.out.println("enter money to deposit ");
			int dep=sn.nextInt();
			bal=bal+dep;
			System.out.println("new balance is"+bal);
			break;
		case 4:
			System.out.println("you are exit");
			break;
	}
	}

	}
		
		else
		{
			System.out.println("incorrect pin");
		}
}
}

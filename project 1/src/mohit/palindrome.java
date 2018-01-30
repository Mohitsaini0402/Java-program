package mohit;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		int n=sn.nextInt(),temp,a;
		int rev=0;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			rev=(rev*10)+a;
		}
		if(temp==rev)
		{
			System.out.println("number is palindrome");
		}
		else{
			System.out.println("number is no palindrome");
		}
	}

}

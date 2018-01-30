package mohit;
import java.util.Scanner;
public class fabbi {
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("enter no");
		int n=sn.nextInt();
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		for(int i=2;i<n;i++)
		{
			int x=a+b;
			a=b;
			b=x;
			System.out.println(x);
		}
}
}
package demo;
import java.util.Scanner;
public class Vovelcheck {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter character");
	char c=scan.next().charAt(0);
	switch(c)
	{	
case 'a':
		System.out.println("this is vowel:");
	break;
	
	case 'A':
		System.out.println("this is vowel:");
	break;
	
	case 'e':
		System.out.println("this is vowel:");
	break;
	
	case 'E':
		System.out.println("this is vowel:");
	break;
	

	case 'i':
		System.out.println("this is vowel:");
	break;
	
	case 'o':
		System.out.println("this is vowel:");
	break;
	

	case 'O':
		System.out.println("this is vowel:");
	break;
	
	case 'u':
		System.out.println("this is vowel:");
	break;
	
	case 'U':
		System.out.println("this is vowel:");
	break;
	default:
		System.out.println("it is constent");
	}
}
}

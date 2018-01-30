package mohit;
import java.lang.String;
public class Str1 {
	public static void main(String[] args) {
		String s= "i have a car.";
		String s1="its color is white";
		String s2=s+s1;
		System.out.println(" "+s2);
		System.out.println("index of s::"+s2);
		String s3=s.substring(3,9);
		System.out.println("substring::"+s3);
		String[] arr=s1.split(" ");
		System.out.println(" ");
		for(int i=0;i<arr.length;i++)
			
		{
			System.out.println("splite is::"+arr[i] );
			
		}
		System.out.println(" ");
		System.out.println("use of toCharArray method");
		char[] c=s2.toCharArray();
		for( int i=0;i<c.length;i++)
		{
			System.out.println("index ::"+i+"value::"+c[i]);
		}
	}
}

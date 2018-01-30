package mohit;

public class Str2 {
public static void main(String[] args) {
	String s= "i have a car.";
	String s1="its color is white";
	String s2=s+s1;
	System.out.println("String is ::"+s2);
	/*String[] arr=s1.split(" ");
	System.out.println(" ");
	for(int i=0;i<arr.length;i++)
		
	{
		System.out.println("splite is::"+arr[i] );
		
	}*/
	System.out.println(" ");
	char[] c=s2.toCharArray();
	for(int i=c.length-1;i>=0;i--)
		
	{
		System.out.println("index is ::"+i+" value is ::"+c[i]);
	}
	//String input=s+s1;

	String s3="this is a book";
	System.out.println(s3);
	char[] c1=s3.toCharArray();
	for(int i=c1.length-1;i>=0;i--)
		
	{
	
		System.out.println("index is ::"+i+" value is ::"+c1[i]);
	}//char[]s4=s3.toCharArray();

	StringBuffer s4 = new StringBuffer();

	s4.append(s3);


	s4 = s4.reverse();

	for (int i=0; i<s4.length(); i++)
		System.out.print(s4.charAt(i));
	
}
}
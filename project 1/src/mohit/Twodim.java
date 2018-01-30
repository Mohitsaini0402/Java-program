package mohit;

import java.util.Scanner;

public class Twodim {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
	int[][] arr=new int[3][3];
	System.out.println("enter element in array");
	for (int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
	     arr[i][j]=sn.nextInt();
	
		}
	
	}
	for (int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
	 
		System.out.print(arr[i][j]+"\t");
		}
		System.out.println("");
	}
/*	int small=arr[][];
	for (int i=0;i<n;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(small=arr[i][j])
		}
*/
}
}






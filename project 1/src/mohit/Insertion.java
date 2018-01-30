package mohit;

import java.util.Scanner;

public class Insertion {
	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("enter no");
		int n=sn.nextInt();
		int[] arr= new int[n];
		int a,sort=0;
		System.out.println("element in array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sn.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(arr[j]>arr[j+1])
			{
				sort=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=sort;
			
			//System.out.println(arr[i]);
			}
		/*else
			{
				sort=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=sort;
			}*/
		System.out.println(arr[i]);
		}
}
}
}
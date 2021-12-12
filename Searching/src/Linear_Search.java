import java.io.*;
import java.lang.*;
import java.util.Scanner;


public class Linear_Search
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,key;
		int arr[]=new int[10];
		System.out.println("Enter the number of elements in array");
		n=sc.nextInt();
		
		System.out.println("Enter the element to be search");
		key=sc.nextInt();
		
		System.out.println("Enter the elements in array");
		
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
		
	System.out.println("The elements of the array are ");
	for(int i=0;i<n;i++)
	{
	System.out.println(arr[i]);
	}
	
	}
}
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
			
		System.out.println("Enter the elements in array");
		
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enter the element to be search");
	key=sc.nextInt();
		
	for(int i=0;i<n;i++)
	{
		
		if(arr[i] == key)
		{
			System.out.println("Woho ! element is found in the array");
			break;
		}
		else
		{
			System.out.println("Sorry element is not found in array");
			break;
		}
	}
	
	
	}
}
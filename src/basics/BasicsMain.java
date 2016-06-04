package basics;

import java.util.Arrays;

public class BasicsMain
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		// Variables are given a data type on declaration
		int myInt;
		myInt = 25;
		System.out.println(myInt);
		boolean myBool = false;
		if (myBool)
		{
			System.out.println("Woo!");
		}
		else
		{
			System.out.println("Boo!");
		}
		int[] myArray = new int[7];
		for (int i = 0; i < myArray.length; i++)
		{
			myArray[i] = i; 
		}
		System.out.println(Arrays.toString(myArray));
		int sumOfMyArray = getSumOfArray(myArray); 
		System.out.println(sumOfMyArray);
	}
	
	public static int getSumOfArray(int[] arrayArg )
	{
		int sum = 0;
		for (int i = 0; i < arrayArg.length; i++)
		{
			sum += arrayArg[i];
		}
		return sum;
	}
	
}

package bubblesort;

import java.util.Arrays;
import java.util.Random;

public class BubblesortMain {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int size = 100;
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = rand.nextInt(size*10);
		System.out.println( Arrays.toString(numbers) );
		bubbleSort(numbers);
		System.out.println( Arrays.toString(numbers) ) ;
	}
	
	public static int lowestIndex( int[] data, int start)
	{
		int low_i = start;
		for ( int i = start + 1; i < data.length; i++)
		{
			if (data[i] < data[low_i])
				low_i = i;
		}
		return low_i;
	}
	
	public static void bubbleSort(int[] dataset)
	{
		int temp, low_i;
		for ( int i = 0; i < dataset.length - 1; i++)
		{
			low_i = lowestIndex( dataset, i);
			if (low_i != i)
			{
				temp = dataset[low_i];
				dataset[low_i] = dataset[i];
				dataset[i] = temp;
			}
		}
	}

}

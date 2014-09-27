package com.sukanya.Sorting;

public class MergeSort 
{
	int[] numbers;
	int[] helpers;
	int number;
	
	void Sort(int[] input)
	{
		this.numbers = input;
		number = input.length;
		helpers = new int[number];
		mergerSort(0,number-1);
	}
	
	void mergerSort(int lowerIndex,int higherIndex)
	{
		if(lowerIndex < higherIndex)
		{
		int middle = lowerIndex + (higherIndex-lowerIndex)/2;
		mergerSort(lowerIndex,middle);
		mergerSort(middle+1,higherIndex);
		merge(lowerIndex,middle,higherIndex);
		}
	}
	
	void merge(int low,int mid,int high)
	{
		for(int i=low;i<=high;i++)
		{
			helpers[i] = numbers[i];
		}
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i <= mid && j <= high)
		{
			if(helpers[i] <= helpers[j])
			{
				numbers[k] = helpers[i];
				i++;
			}
			else
			{
				numbers[k] = helpers[j];
				j++;
			}
			
			k++;
		}
		
		while(i <= mid)
		{
			numbers[k] = helpers[i];
			i++;
			k++;
		}
	}
}

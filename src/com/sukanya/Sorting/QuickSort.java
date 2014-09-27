package com.sukanya.Sorting;

public class QuickSort 
{
	
	void quickSort(int a[])
	{
		sort_quick_function(a,0,a.length-1);
	}
	
	void sort_quick_function(int a[],int low,int high)
	{
		int i =  low;
		int j = high;
		int pivot = a[low + (high - low)/2];
		
		while(i <= j)
		{
			while(a[i] < pivot)
			{
				i++;
			}
			while(a[j] > pivot)
			{
				j--;
			}
			
			if(i <= j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] =  temp;
				i++;
				j--;
			}
		}
		
		if(low < j)
		{
			sort_quick_function(a,low,j);
		}
		
		if(i < high)
		{
			sort_quick_function(a,i,high);
		}
		
	}

}

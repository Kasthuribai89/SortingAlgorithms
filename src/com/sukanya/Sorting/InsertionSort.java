package com.sukanya.Sorting;

public class InsertionSort 
{
	
	void insertionSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(a[j] < a[j-1])
				{
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}


}


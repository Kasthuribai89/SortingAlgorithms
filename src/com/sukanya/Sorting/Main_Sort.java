package com.sukanya.Sorting;

public class Main_Sort
{
	
	public static void main(String args[])
	{
		
		int arr[] = {7,2,5,9,3};
		/*
		 BubbleSort bs = new BubbleSort();
		 bs.bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}*/
		
		/*SelectionSort ss = new SelectionSort();
		ss.selectionSort(arr);*/
		
		/*InsertionSort is = new InsertionSort();
		is.insertionSort(arr);*/
		
		/*QuickSort qs = new QuickSort();
		qs.quickSort(arr);*/
		
		MergeSort ms = new MergeSort();
		ms.Sort(arr);
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
		
	}

}

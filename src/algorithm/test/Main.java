package algorithm.test;

import java.util.Random;

import algorithm.sort.BubbleSort;
import algorithm.sort.MergeSort;
import algorithm.sort.QuickSort;
import algorithm.sort.SelectSort;

public class Main {
	public static void main(String[] args) {
		int listSize = 50000;
		
		int[] list = new int[listSize];
		Random random = new Random();
		for (int i = 0; i < listSize; i++) {
			list[i] = random.nextInt(5000);
		}
		
		long start = System.currentTimeMillis();
		
		QuickSort qs = new QuickSort();
		qs.sort(list, 0, list.length-1);
		
//		MergeSort ms = new MergeSort();
//		ms.sort(list, 0, list.length-1);
		
//		SelectSort ss = new SelectSort();
//		ss.sort(list);
		
//		BubbleSort bubbleSort = new BubbleSort();
//		bubbleSort.sort(list);
		
//		for(int e : list) {
//			System.out.println(e);
//		}
		
		
		long end = System.currentTimeMillis();
		System.out.println("Total time: "+ (end-start) + "ms");
	}
}

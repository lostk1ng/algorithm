package algorithm.test;

import algorithm.sort.QuickSort;

public class Main {
	public static void main(String[] args) {
		int[] list = new int[]{1,24,5,465,765,53,43,53,5,53,5,4,5,5,3,3,3,5,5,657,6,88,34,543,5345};
		
		QuickSort q = new QuickSort();
		q.sort(list, 0, list.length-1);
		for(int e : list){
			System.out.println(e);
		}
	}
}

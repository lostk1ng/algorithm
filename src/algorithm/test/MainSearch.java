package algorithm.test;

import algorithm.search.BinarySearch;

public class MainSearch {

	public static void main(String[] args) {
		int[] list = new int[]{1,2,3,5,6,8,9,10,15,47,79,100,333,5654};
		int index = BinarySearch.search(list, 45);
		System.out.println(index);
	}

}

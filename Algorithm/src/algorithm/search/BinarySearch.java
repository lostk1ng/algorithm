package algorithm.search;

public class BinarySearch {
	/**
	 * 
	 * @param list 从小到大的有序序列
	 * @param key 要查找的关键字
	 * @return 关键字在数组中的索引，找不到返回-1
	 */
	public static int search(int[] list, int key) {
		int low = 0;
		int high = list.length-1;
		while(low <= high) {
			int mid = (low + high) / 2;
			if(key == list[mid]) return mid;
			else if(key < list[mid]) high = mid - 1;
			else low = mid + 1;
		}
		return -1;
	}
}

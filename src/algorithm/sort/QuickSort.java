package algorithm.sort;

public class QuickSort {
	private int partition(int[] list, int low, int high) {
		int key = list[low];
		while(low < high) {
			while(low < high && list[high] >= key)
				high--;
			list[low] = list[high];
			while(low < high && list[low] <= key)
				low++;
			list[high] = list[low];
		}
		list[low] = key;
		return low;
	}
	
	public void sort(int[] list, int low, int high) {
		if(low < high) {
			int key = partition(list, low, high);
			sort(list, low, key-1);
			sort(list, key+1, high);
		}
	}
}

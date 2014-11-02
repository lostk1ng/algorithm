package algorithm.sort;

public class BubbleSort {
	public void sort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			for (int j = 0; j < list.length-i; j++) {
				if(list[j] > list[j+1]) {
					int temp = list[j+1];
					list[j+1] = list[j];
					list[j] = temp;
				}
			}
		}
	}
}

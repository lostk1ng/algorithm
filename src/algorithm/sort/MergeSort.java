package algorithm.sort;

public class MergeSort {
	private void merge(int[] list, int first, int mid, int last) {
		int i = first;
		int m = mid;
		int j = mid + 1;
		int n = last;
		int[] temp = new int[last - first + 1];
		int count = 0;
		while(i <= m && j <= n) {
			if(list[i] <= list[j])
				temp[count++] = list[i++];
			else
				temp[count++] = list[j++];
		}
		while(i <= m)
			temp[count++] = list[i++];
		while(j <= n)
			temp[count++] = list[j++];
		
		for(i = 0; i < count; i++)
			list[first+i] = temp[i];
	}
	
	public void sort(int[] list, int first, int last) {
		if(first < last) {
			int mid = (first + last) / 2;
			sort(list, first, mid);
			sort(list, mid+1, last);
			merge(list, first, mid, last);
		}
	}
}

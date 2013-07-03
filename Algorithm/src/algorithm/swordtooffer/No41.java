package algorithm.swordtooffer;

public class No41 {

	public static void find(int sum) {
		if(sum < 3)
			return;
		int start = 1;
		int end = 2;
		int edge = (sum+1)/2;
		int curSum = start + end;
		while(start < edge) {
			if(curSum == sum) {
				printList(start, end);
				end++;
				curSum += end;
			} else if(curSum > sum) {
				curSum -= start;
				start++;
			} else {
				end++;
				curSum += end;
			}
		}
	}
	
	private static void printList(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		No41.find(15);

	}

}

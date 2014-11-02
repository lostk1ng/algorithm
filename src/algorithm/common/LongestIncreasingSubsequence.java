package algorithm.common;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static int[] getLongestSub(int[] list) {
		if(list == null || list.length == 0)
			return null;
		
		int[] maxLength = new int[list.length];//记录以i结尾的最长递增子序列
		int[] pre = new int[list.length];//记录i的前驱节点
		
		int maxLengthIndex = 0;
		for (int i = 0; i < list.length; i++) {
			maxLength[i] = 1;
			for (int j = 0; j < i; j++) {
				if(list[j] < list[i] && maxLength[i] < maxLength[j]+1) {
					maxLength[i] = maxLength[j]+1;
					pre[i] = j;
				}
			}
			if(maxLength[i] > maxLength[maxLengthIndex])
				maxLengthIndex = i;
		}
		
		int[] result = new int[maxLength[maxLengthIndex]];
		int index = maxLengthIndex;
		int resultIndex = maxLength[maxLengthIndex] - 1;
		while(index >= 0 && resultIndex >=0) {
			result[resultIndex--] = list[index];
			index = pre[index];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] list = new int[]{1, -3, 2, -1, 4, -5, 6, 0};
		System.out.println(Arrays.toString(LongestIncreasingSubsequence.getLongestSub(list)));
	}

}

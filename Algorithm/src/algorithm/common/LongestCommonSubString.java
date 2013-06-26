package algorithm.common;

public class LongestCommonSubString {
	
	public static void getLongestSub(String str1, String str2) {
		int[][] matrix = new int[str1.length()][str2.length()];
		
		int max = 0;
		int maxX = 0;
		int maxY = 0;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					if(i == 0 || j == 0)
						matrix[i][j] = 1;
					else
						matrix[i][j] = matrix[i-1][j-1] + 1;
				} else {
					matrix[i][j] = 0;
				}
				if(matrix[i][j] > max) {
					max = matrix[i][j];
					maxX = i;
					maxY = j;
				}
			}
		}
		
		//output
		if(max == 0) {
			System.out.println("no result!");
		}
		for (int i = maxX-max+1; i <= maxX; i++) {
			System.out.print(str1.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		String str1 = "cabbaghcabafgd";
		String str2 = "dacabada";
		LongestCommonSubString.getLongestSub(str1, str2);
	}

}

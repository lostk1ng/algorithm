package algorithm.common;

public class LongestCommonSubsequence {
	private static final int LEFT = 1;
	private static final int UP = 2;
	private static final int LEFTUP = 3;
	
	private static int[][] matrix;
	private static int[][] track;
	
	public static int getLongestSub(String str1, String str2) {
		matrix = new int[str1.length()+1][str2.length()+1];
		track = new int[str1.length()+1][str2.length()+1];
		
		for (int i = 0; i <= str2.length(); i++) {
			matrix[0][i] = 0;
		}
		for (int i = 0; i <= str1.length(); i++) {
			matrix[i][0] = 0;
		}
		for (int i = 1; i <= str1.length(); i++) {
			for (int j = 1; j <= str2.length(); j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)){
					matrix[i][j] = matrix[i-1][j-1] + 1;
					track[i][j] = LEFTUP;
				} else {
					if(matrix[i][j-1] >= matrix[i-1][j]) {
						matrix[i][j] = matrix[i][j-1];
						track[i][j] = LEFT;
					}
					else {
						matrix[i][j] = matrix[i-1][j];
						track[i][j] = UP;
					}
				}
			}
		}
		return matrix[str1.length()][str2.length()];
	}
	
	public static void outputLongestSub(int i, int j, String str1, String str2) {
		if(i==0 || j==0)
			return;
		if(track[i][j] == LEFTUP) {
			outputLongestSub(i-1, j-1, str1, str2);
			System.out.print(str1.charAt(i-1));
		}
		else if(track[i][j] == LEFT)
			outputLongestSub(i, j-1, str1, str2);
		else if(track[i][j] == UP)
			outputLongestSub(i-1, j, str1, str2);
	}
	
	public static void main(String[] args) {
		String str1 = "cnblogs";
		String str2 = "belong";
		System.out.println(LongestCommonSubsequence.getLongestSub(str1, str2));
		LongestCommonSubsequence.outputLongestSub(str1.length(), str2.length(), str1, str2);
	}

}

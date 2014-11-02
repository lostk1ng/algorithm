package algorithm.swordtooffer;

public class No42 {

	private static void reverse(char[] list, int start, int end) {
		if(list == null || list.length == 0 ||
				start > end)
			return;
		while(start < end) {
			char temp = list[start];
			list[start] = list[end];
			list[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void reverseSentence(char[] list) {
		if(list == null || list.length == 0)
			return;
		reverse(list, 0, list.length-1);
		int start = 0;
		int end = 0;
		while(start < list.length) {
			if(list[start] == ' ') {
				start++;
				end++;
			} else if(list[end] == ' ') {
				reverse(list, start, end-1);
				start = ++end;
			} else if(end == list.length-1) {
				reverse(list, start, end);
				start = ++end;
			} else {
				end++;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = " hello  world.";
		char[] ch = str.toCharArray();
		No42.reverseSentence(ch);
		System.out.println(ch);
	}

}

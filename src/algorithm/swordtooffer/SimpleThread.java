package algorithm.swordtooffer;


public class SimpleThread extends Thread {
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public SimpleThread(int value) {
		this.value = value;
	}
	
	public void run() {
		while(true) {
			synchronized(this) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(value + " ");
			}
		}
	}
}

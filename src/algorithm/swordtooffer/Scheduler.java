package algorithm.swordtooffer;


public class Scheduler {

	public static void main(String[] args) {
		SimpleThread[] threads = new SimpleThread[3];
		for(int i=0; i<3; i++) {
			threads[i] = new SimpleThread(i+1);
			threads[i].start();
		}
		
		int index = 0;
		while(true) {
			synchronized(threads[index]) {
				threads[index].notify();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index = (index+1)%3;
		}	
	}

}

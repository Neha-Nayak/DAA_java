package program3b;

public class MultiThreaded {
	 public static void main(String[] args) {
	 FirstThreadIsRandom firstThread = new FirstThreadIsRandom();
	 Thread t1 = new Thread(firstThread);
	 t1.start();
	 }
	}


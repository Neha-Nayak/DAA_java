package program3b;
import java.util.Random;
class FirstThreadIsRandom extends Thread {
	 public void run() {
	 int num = 0;
	 Random r = new Random();
	 try {
	 for (int i = 0; i < 3; i++) {
	 num = r.nextInt(100);
	 System.out.println("Main Thread Started and Generated Number is " + num);
	 Thread t2 = new Thread(new Square(num));
	 t2.start();
	 Thread t3 = new Thread(new Cube(num));
	 t3.start();
	 Thread.sleep(1000);
	 System.out.println("-------------------------------------------------");
	 }
	 } catch (Exception ex) {
	 System.out.println(ex.getMessage());
	 }
	 }
	}
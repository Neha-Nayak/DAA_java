package program6b;
import java.util.Scanner;
public class KpGreedy {
	 public static void main(String[] args) {
	 int n;
	 double c;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter number of objects");
	 n = input.nextInt();
	 double[] p = new double[n + 1];
	 double[] w = new double[n + 1];
	 int i;
	 System.out.println("Enter capacity of Knapsack");
	 c = input.nextDouble();
	 System.out.println("Enter profit for each " + n + " objects");
	 for (i = 0; i < n; i++)
	 p[i] = input.nextDouble();
	 System.out.println("Enter weight for each " + n + " objects");
	 for (i = 0; i < n; i++)
	 w[i] = input.nextDouble();
	 GKnapsack gk = new GKnapsack(n, c, p, w);
	 gk.compute();
	 }
	}



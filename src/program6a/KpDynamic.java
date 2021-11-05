package program6a;
import java.util.Scanner;
public class KpDynamic {
	 public static void main(String[] args) {
	 int n;
	 int c;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter number of objects");
	 n = input.nextInt();
	 int[] p = new int[n + 1];
	 int[] w = new int[n + 1];
	 int i;
	 System.out.println("Enter capacity of Knapsack");
	 c = input.nextInt();
	 System.out.println("Enter profit for each " + n + " objects");
	 for (i = 1; i <= n; i++)
	 p[i] = input.nextInt();
	 System.out.println("Enter weight for each " + n + " objects");
	 for (i = 1; i <= n; i++)
	 w[i] = input.nextInt();
	 DKnapsack dk = new DKnapsack(n, c, p, w);
	 dk.compute();
	 }
	}

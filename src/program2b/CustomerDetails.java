package program2b;
import java.util.Scanner;
public class CustomerDetails {
	 public static void main(String[] args) {
		 String customerName;
		 String date;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter customer name");
		 customerName = scanner.next();
		 System.out.println("Enter Date (dd/mm/yyy)");
		 date = scanner.next();
		 Customer customer = new Customer(customerName, date);
		 System.out.println(customer.toString());
		 }
		}
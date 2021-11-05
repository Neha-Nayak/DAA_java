package program2b;

import java.util.Scanner;
import java.util.StringTokenizer;
class Customer {
 private String customerName, date;
 public Customer(String customerName, String date) {
 super();
 this.customerName = customerName;
 this.date = date;
 }
 @Override
 public String toString() {
 String returnValue = customerName + ",";
 StringTokenizer tokenizer = new StringTokenizer(date, "/");
 System.out.println("The Customer details are ");
 while (tokenizer.hasMoreTokens()) {
 returnValue = returnValue + tokenizer.nextToken();
 if (tokenizer.hasMoreElements()) {
 returnValue = returnValue + ",";
 }
 }
 return returnValue;
 }
}


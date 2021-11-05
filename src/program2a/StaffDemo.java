package program2a;

import java.util.Scanner;
public class StaffDemo {
 public static void main(String[] args) {
 int i, choice;
 String staffId, name, ph, domain, publication, skills, period;
 float salary;
 int teachingCount = 0, technicalCount = 0, contractCount = 0;
 Teaching[] teachingStaff = new Teaching[10];
 Contract[] contractStaff = new Contract[10];
 Technical[] technicalStaff = new Technical[10];
 Scanner s = new Scanner(System.in);
 System.out.println("1 Teaching Staff Entry");
 System.out.println("2 Technical Staff Entry");
 System.out.println("3 Contract Staff Entry");
 System.out.println("4 Teaching Staff Details");
 System.out.println("5 Technical Staff Details");
 System.out.println("6 Contract Staff Details");
 System.out.println("7.Exit");
 for (;;) {
 System.out.println("enter your choice");
 choice = s.nextInt();
 switch (choice) {
 	case 1:
		 System.out.println("Enter Teaching Details(StaffId,Name,Salary,PhoneNumber,Domain,Publication)");
		 staffId = s.next();
		 name = s.next();
		 salary = s.nextFloat();
		 ph = s.next();
		 domain = s.next();
		 publication = s.next();
		 teachingStaff[teachingCount] = new Teaching(staffId, name, salary, ph, domain, publication);
		 teachingCount++;
		 break;
 	case 2:
		 System.out.println("Enter TechnicalstaffDetails(StaffId, Name, Salary, PhoneNumber, Skills)");
		 staffId = s.next();
		 name = s.next();
		 salary = s.nextFloat();
		 ph = s.next();
		 skills = s.next();
		 domain = s.next();
		 publication = s.next();
		 technicalStaff[technicalCount] = new Technical(staffId, name, salary, ph, skills, domain, publication);
		 technicalCount++;
		 break;
 	case 3:
		 System.out.println("enter Contract staffdetails(StaffId, Name, Salary, PhoneNumber, Period)");
		 staffId = s.next();
		 name = s.next();
		 salary = s.nextFloat();
		 ph = s.next();
		 period = s.next();
		 contractStaff[contractCount] = new Contract(staffId, name, salary, ph, period);
		 contractCount++;
		 break;
 	case 4:
		 System.out.println("Teaching Staff Details");
		 if (teachingCount == 0) {
			 System.out.println("No teaching staff details available ");
		 } else {
			 for (i = 0; i < teachingCount; i++) {
				 	System.out.println(teachingStaff[i]);
		 }
		 }
		 break;
 	case 5:
		 System.out.println("Technical Staff Details:");
		 if (technicalCount == 0) {
			 System.out.println("No technical staff details available");
		 } else {
			 for (i = 0; i < technicalCount; i++) {
				 System.out.println(technicalStaff[i]);
			 }
		 }
		 break;
 	case 6:
		 System.out.println("contract Staff Details:");
		 if (contractCount == 0) {
			 System.out.println("No contract staff details available");
		 } else {
			 for (i = 0; i < contractCount; i++) {
				 System.out.println(contractStaff[i]);
		 }
		 }
		 break;
 	case 7:
 		 System.exit(0);
 		}
 	}
 }
}

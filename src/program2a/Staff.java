package program2a;

import java.util.Scanner;
class Staff {
 protected String staffId, name, ph;
 protected float salary;
 public Staff(String staffId, String name, float salary2, String ph) {
 super();
 this.staffId = staffId;
 this.name = name;
 this.salary = salary2;
 this.ph = ph;
 }
 @Override
 public String toString() {
 return "Staff [staffId=" + staffId + ", name=" + name + ", salary=" +
 salary + ", ph=" + ph + "]";
 }
}

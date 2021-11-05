package program2a;

class Teaching extends Staff {
	 private String domian, publication;
	 public Teaching(String staffId, String name, float salary, String ph, String domian, String publication) {
	 super(staffId, name, salary, ph);
	 this.domian = domian;
	 this.publication = publication;
	 }
	 @Override
	 public String toString() {
	 return "Teaching [domian=" + domian + ", publication=" + publication + ", staffId=" + staffId + ", name=" + name + ", ph=" + ph + ", salary=" + salary + "]";
	 }
	}

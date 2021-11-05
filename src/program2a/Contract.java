package program2a;

class Contract extends Staff {
	 private String period;
	 public Contract(String staffId, String name, float salary, String ph, String period) {
	 super(staffId, name, salary, ph);
	 this.period = period;
	 }
	 @Override
	 public String toString() {
	 return "Contract [period=" + period + ", staffId=" + staffId + ", name=" + name + ", ph=" + ph + ", salary=" + salary + "]";
	 }
	}

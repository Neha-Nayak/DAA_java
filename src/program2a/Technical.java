package program2a;

class Technical extends Staff {
	 private String domian, publication, skills;
	 public Technical(String staffId, String name, float salary, String ph, String skills, String domian, String publication) {
	 super(staffId, name, salary, ph);
	 this.domian = domian;
	 this.publication = publication;
	 this.skills = skills;
	 }
	 @Override
	 public String toString() {
	 return "Technical [domian=" + domian + ", publication=" + publication + ", staffId=" + staffId + ", name=" + name + ", ph=" + ph + ", salary=" + salary + ", skills=" + skills + "]";
	 }
	}



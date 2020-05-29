public class Employee extends Person {
        double annualSalary;
	int year;
	String InsuranceNo;	
	public Employee(String name, double annualSalary, int year, String InsuranceNo) {
		super(name);
		this.annualSalary=annualSalary;
		this.year= year;
		this.InsuranceNo =InsuranceNo;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public int getYear() {
		return year;
	}
	public String getInsuranceNo() {
		return InsuranceNo;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", year=" + year+ ", InsuranceNo="
				+ InsuranceNo + ", name=" + name + "]";
	}
	
	
}
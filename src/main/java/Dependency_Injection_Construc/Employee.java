package Dependency_Injection_Construc;

public class Employee {
	private int Emp_id;
	private String Emp_name;
	private String Emp_Bloodgroup;
	public Employee(int emp_id, String emp_name, String emp_Bloodgroup) {
		//super();
		this.Emp_id = emp_id;
		Emp_name = emp_name;
		Emp_Bloodgroup = emp_Bloodgroup;
	}
	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", Emp_name=" + Emp_name + ", Emp_Bloodgroup=" + Emp_Bloodgroup + "]";
	}
	
	

}

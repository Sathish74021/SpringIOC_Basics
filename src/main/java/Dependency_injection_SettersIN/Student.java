package Dependency_injection_SettersIN;

public class Student {
  
	private int Std_id;
	private String Std_name;
	public int getStd_id() {
		return Std_id;
	}
	public void setStd_id(int std_id) {
		Std_id = std_id;
	}
	public String getStd_name() {
		return Std_name;
	}
	public void setStd_name(String std_name) {
		Std_name = std_name;
	}
	@Override
	public String toString() {
		return "Student [Std_id=" + Std_id + ", Std_name=" + Std_name + "]";
	}
	
	
}

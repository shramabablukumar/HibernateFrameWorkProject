package h.w.p;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id @GeneratedValue
	private int empId;
	private String EmpName;
	private String EmpPass;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpPass() {
		return EmpPass;
	}
	public void setEmpPass(String empPass) {
		EmpPass = empPass;
	}
	
	

}

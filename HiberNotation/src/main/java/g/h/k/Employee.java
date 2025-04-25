package g.h.k;

import javax.persistence.*;

@Entity

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name = "Emp_Name")
    private String empName;

    @Column(name = "User_Name")
    private String userName;

    @Column(name = "Password")
    private String password;
    
    @Embedded
    private Address a;
    

    public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	// Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

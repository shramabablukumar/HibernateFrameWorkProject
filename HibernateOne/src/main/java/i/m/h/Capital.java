package i.m.h;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Capital {
	@Id
	private int C_id;
	private String C_Name;
	@OneToOne
	private State S1;
	
	public State getS1() {
		return S1;
	}
	public void setS1(State s1) {
		S1 = s1;
	}
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public String getC_Name() {
		return C_Name;
	}
	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}
	
	
	
	

}

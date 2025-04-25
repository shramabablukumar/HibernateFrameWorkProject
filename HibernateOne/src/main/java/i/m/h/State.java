package i.m.h;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
	@Id
	private int S_id;
	private String S_Name;
	@OneToOne
	private Capital C1;
	
	public Capital getC1() {
		return C1;
	}
	public void setC1(Capital c1) {
		C1 = c1;
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getS_Name() {
		return S_Name;
	}
	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}
	
	

}

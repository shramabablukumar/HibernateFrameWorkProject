package u.l.m;

import javax.persistence.*;

@Entity
public class Laptop {
    @Id
    private int lapId;

    private String laptopName;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;

    // Getters and Setters
    public int getLapId() { return lapId; }
    public void setLapId(int lapId) { this.lapId = lapId; }

    public String getLaptopName() { return laptopName; }
    public void setLaptopName(String laptopName) { this.laptopName = laptopName; }

    public Employee getEmployee() { return employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }
}

package u.l.m;

import java.util.List;
import javax.persistence.*;

@Entity
public class Employee {
    @Id
    private int empId;

    private String name;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Laptop> lpts;

    // Getters and Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Laptop> getLpts() { return lpts; }
    public void setLpts(List<Laptop> lpts) { this.lpts = lpts; }
}

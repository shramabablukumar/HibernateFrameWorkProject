package m.n.y;

import java.util.List;
import javax.persistence.*;

@Entity
public class Employee {

    @Id
    private int empid;

    private String emplName;

   
//    @JoinTable(
//        name = "Employee_Project",
//        joinColumns = @JoinColumn(name = "emp_id"),
//        inverseJoinColumns = @JoinColumn(name = "proj_id")
//    )
    @ManyToMany
    private List<Project> pj;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public List<Project> getPj() {
        return pj;
    }

    public void setPj(List<Project> pj) {
        this.pj = pj;
    }
}

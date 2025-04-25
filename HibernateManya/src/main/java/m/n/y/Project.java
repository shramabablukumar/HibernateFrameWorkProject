package m.n.y;

import java.util.List;
import javax.persistence.*;

@Entity
public class Project {

    @Id
    private int projId;

    private String projName;

    @ManyToMany
    private List<Employee> e;

    public int getProjId() {
        return projId;
    }

    public void setProjId(int projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }

    public List<Employee> getE() {
        return e;
    }

    public void setE(List<Employee> e) {
        this.e = e;
    }
}

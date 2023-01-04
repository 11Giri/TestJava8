package java8;

import java.util.Comparator;

public class Department implements Comparable <Department>{
    private Integer depId;
    private String deptName;
    private String employeeName;

    public Department(Integer depId, String deptName,String employeeName) {
        this.depId = depId;
        this.deptName = deptName;
        this.employeeName=employeeName;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "depId=" + depId +
                ", deptName='" + deptName + '\'' +
                '}';
    }


    @Override
    public int compareTo(Department o) {
        /*if(this.depId==o.getDepId()){
            return 0;
        } else if (this.depId<o.getDepId()) {
            return 1;

        }
        else {
            return -1;
        }*/
        //ascendeing order
return this.getDeptName().compareTo(o.getDeptName());
//decending order
        //return o.getDeptName().compareTo(this.deptName);
    }
}


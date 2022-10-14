package java8;

import java.util.Comparator;

public class Department implements Comparable <Department>{
    private int depId;
    private String deptName;

    public Department(int depId, String deptName) {
        this.depId = depId;
        this.deptName = deptName;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
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
        if(this.depId==o.getDepId()){
            return 0;
        } else if (this.depId>o.getDepId()) {
            return 1;

        }
        else {
            return -1;
        }

    }
}


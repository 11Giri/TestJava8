package java8;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    private Integer empId;
    private String empName;
    private Double salary;
    private int leaveBal;

    public Employee(Integer empId, String empName, Double salary, int leaveBal) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.leaveBal = leaveBal;
    }

    public Integer getEmpId() {
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getLeaveBal() {
        return leaveBal;
    }

    public void setLeaveBal(int leaveBal) {
        this.leaveBal = leaveBal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", leaveBal=" + leaveBal +
                '}';
    }





    @Override
    public int compareTo(Employee o) {
        return o.getEmpId().compareTo(this.getEmpId());
      // return o.empName.compareTo(this.getEmpName());
       // return this.salary.compareTo(o.getSalary());
    }
}


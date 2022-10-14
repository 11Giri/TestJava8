package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpDepMain {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3, "Jhon khon", 3437d, 5));
        employeeList.add(new Employee(6, "Jack Jhon", 2467d, 45));
        employeeList.add(new Employee(2, "Test check", 1467d, 24));
        employeeList.add(new Employee(1, "Gary Morlock", 8467d, 54));
        employeeList.add(new Employee(8, "Philip Joe", 2097d, 74));
        employeeList.add(new Employee(5, "Joe Jordon", 1000d, 41));
        System.out.println(employeeList);
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(50, "Science"));
        departments.add(new Department(2, "Finance"));
        departments.add(new Department(42, "Banking"));
        departments.add(new Department(15, "Hardwear"));
        departments.add(new Department(28, "Software"));
        departments.add(new Department(3, "IT"));
        System.out.println(departments);

       /* i. Filter out the employeeList where empName whose last name starts with "J".
                ii. Filter out Department when deptId more than 20.
        iii. Filter out and print set of record where emp salary is more than 2400.

        iv. Perform sorting of Employee based on the empName and Salary on decending order whereas employees will be sorted by default with empId as descending order.
                v. Perform Sorting of Department based on the deptId as decending order whereas deptName sorting will be default sorting by ascending order.
                List<E
}*/
        List<Employee>modEmployee=new ArrayList<>();
        employeeList.stream().toList().stream().filter(emp->emp.getEmpName().startsWith("J"));
        System.out.println("EmpName start With J::"+employeeList);
            departments.stream().filter(dep->dep.getDepId()>20).forEach(dep->{
                System.out.println("deptId greater Than 20 is :: "+ dep.getDepId()+" DepartName:"+dep.getDeptName());
        });
employeeList.stream().filter(emp->emp.getSalary()>2400).forEach(emp->{
    System.out.println("Name"+emp.getEmpName()+"Salary:: "+emp.getSalary());
});
        /*iv. Perform sorting of Employee based on the empName and Salary on decending order whereas employees will be sorted by default with empId as descending order.
                v. Perform Sorting of Department based on the deptId as decending order whereas deptName sorting will be default sorting by ascending order.
        List<E*/
        //iv
        Collections.sort(employeeList);
        System.out.println("sorting  Employee based on the empName and salary"+employeeList);
       // v
        Collections.sort(departments);
        System.out.println("Sorting based on departmentId ascending order"+departments);
        }

}
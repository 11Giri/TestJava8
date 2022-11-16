package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmpDepMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3, "Rosan khon", 3437d, 5));
        employeeList.add(new Employee(6, "Jack Rosan", 2467d, 45));
        employeeList.add(new Employee(2, "Test check", 1467d, 24));
        employeeList.add(new Employee(1, "Gary Morlock", 8467d, 54));
        employeeList.add(new Employee(8, "Philip Joe", 2097d, 74));
        employeeList.add(new Employee(5, "Joe Jordon", 1000d, 41));
        System.out.println("Before  adjustment" + employeeList);
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(50, "Science"));
        departments.add(new Department(2, "Finance"));
        departments.add(new Department(42, "Banking"));
        departments.add(new Department(15, "Hardwear"));
        departments.add(new Department(28, "Software"));
        departments.add(new Department(3, "IT"));
        System.out.println("Before adjustment ::" + departments);

       /* i. Filter out the employeeList where empName whose last name starts with "J".



        iv. Perform sorting of Employee based on the empName and Salary on decending order whereas employees will be sorted by default with empId as descending order.
                v. Perform Sorting of Department based on the deptId as decending order whereas deptName sorting will be default sorting by ascending order.
                List<E
}*//* i. Filter out the employeeList where empName whose last name starts with "J".*/

       employeeList= employeeList.stream().filter(emp -> {
            String[] modEmpName = emp.getEmpName().split(" ");
            String last_name = modEmpName[1];
            if (last_name.startsWith("J")) {
                return true;
            }
            return false;

        }).collect(Collectors.toList());
        System.out.println(" after modification EmpName start With J::" + employeeList);
        // ii. Filter out Department when deptId more than 20.
       departments= departments.stream().filter(dep -> dep.getDepId() > 20).collect(Collectors.toList());
        System.out.println(" after mod deptId greater Than 20 is :: " + departments);
        //  iii. Filter out and print set of record where emp salary is more than 2400.
        employeeList.stream().filter(emp -> emp.getSalary() > 2400).forEach(emp ->
                System.out.println("Name" + emp.getEmpName() + "Salary:: " + emp.getSalary()));

        /*iv. Perform sorting of Employee based on the empName and Salary on decending order whereas employees will be sorted by default with empId as descending order.
               .
        List<E*/
        //iv
       /* Collections.sort(employeeList);
       System.out.println("sorting  Employee based on the empName and salary Descending order"+employeeList);*/
      /* Collections.sort(employeeList, new SorttedSalaryComparator());
        System.out.println("sorting  Employee based on the  salary Descending order"+employeeList);*/
        Collections.sort(employeeList, new SortedByNameCampartor());
        System.out.println("sortete employee based on EmpName descending order" + employeeList);
        // v  Perform Sorting of Department based on the deptId as decending order whereas deptName sorting will be default sorting by ascending order
        Collections.sort(departments, new SortedByDepartmentIdComparator());
        System.out.println("after sorting descending order bu depId ::  " + departments);
        Collections.sort(departments);
        System.out.println("Sorting based on dept name By default  order" + departments);

        //lamda expression appliy
        departments.sort((Department d1,Department d2)->d1.getDepId().compareTo(d2.getDepId()));
        System.out.println("After us e Lamda  Modification the department List:"+departments);
    }
}
package java8;

import java.util.Comparator;

public class SortedByNameCampartor implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getEmpName().compareTo(o1.getEmpName());
    }
}

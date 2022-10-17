package java8;

import java.util.Comparator;

public class SortedByDepartmentIdComparator implements Comparator<Department> {
    @Override
    public int compare(Department o1, Department o2) {
        return o2.getDepId()- o1.getDepId();

    }
}

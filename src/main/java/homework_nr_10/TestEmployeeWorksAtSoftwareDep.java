package homework_nr_10;

import java.util.Objects;

public class TestEmployeeWorksAtSoftwareDep implements PredicateEmployee{
    @Override
    public boolean test(Employee testEmployee) {
        if(Objects.equals(testEmployee.Department, "Software Department")) return true;
        return false;
    }
}

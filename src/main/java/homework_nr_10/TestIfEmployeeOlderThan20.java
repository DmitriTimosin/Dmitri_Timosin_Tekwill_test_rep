package homework_nr_10;

import java.util.Objects;

public class TestIfEmployeeOlderThan20 implements PredicateEmployee{
    public boolean test(Employee testEmployee) {
        if(testEmployee.age > 20) return true;
        return false;
    }
}

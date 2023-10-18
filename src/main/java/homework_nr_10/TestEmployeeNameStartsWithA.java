package homework_nr_10;

public class TestEmployeeNameStartsWithA implements PredicateEmployee{
    public boolean test(Employee testEmployee) {
        if(testEmployee.Name.charAt(0) == 'A') return true;
        return false;
    }
}

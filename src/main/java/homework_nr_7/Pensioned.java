package homework_nr_7;

public abstract class Pensioned extends Person{
    int retireDateAge;

    public Pensioned(String name, String surname, int retireDateAge) {
        super(name, surname);
        this.retireDateAge = retireDateAge;
    }
}

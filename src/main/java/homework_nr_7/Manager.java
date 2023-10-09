package homework_nr_7;

public class Manager extends Employee{

    int teamSize;
    String teamName;

    @Override
    public void Work() {
        System.out.println("Manager " + Name + " " + Surname + " is working");
    }

    public Manager(String name, String surname, String companyName, int teamSize, String teamName) {
        super(name, surname, companyName);
        this.teamSize = teamSize;
        this.teamName = teamName;
    }
}

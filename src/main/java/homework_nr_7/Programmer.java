package homework_nr_7;

public class Programmer extends Employee{

    String programmingLanguage;
    int yearsOfExperience;
    @Override
    public void Work() {
        System.out.println("Programmer " + Name + " " + Surname + " is working");
    }

    public Programmer(String name, String surname, String companyName, String programmingLanguage, int yearsOfExperience) {
        super(name, surname, companyName);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }
}

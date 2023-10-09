package homework_nr_7;

public abstract class Person {

    String Name;
    String Surname;

    public void printMyName(){
        System.out.println("Person name is: " + Name + " " + Surname);
    }

    public Person(String name, String surname) {
        Name = name;
        Surname = surname;
    }
}

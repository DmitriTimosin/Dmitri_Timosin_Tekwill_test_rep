package homework_nr_7;

public class homeworkNr7 {

    public static void main(String[] args) {
        Programmer Pr1 = new Programmer("Ivan", "Petrov", "Megasoft", "C#", 5);
        Programmer Pr2 = new Programmer("Vasily", "Sokolov", "Gigasoft", "Java", 6);
        Manager Man1 = new Manager("Oleg", "Bobrov", "Google", 5, "Alpha");
        Manager Man2 = new Manager("Nikita", "Ovechkin", "Samsung", 10, "Beta");

        Pr1.Work();
        Man2.Work();

        //--------------------

        Person[] Employees = new Person[]{
                Pr1, Pr2, Man1, Man2
        };

        for(int i=0; i != Employees.length; i++) {

            if (Employees[i] instanceof Manager) ((Manager) Employees[i]).Work(); //System.out.println(Employees[i].Name);
        }
    }
}

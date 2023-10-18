package homework_nr_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class homeworkNr10 {
    public static void main(String[] args) {
        Predicate isEven = (number) -> number % 2 == 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check if it's even:");
        int num1 = input.nextInt();

        if(isEven.test(num1)) System.out.println("Number is even");
        else System.out.println("Number is odd");

        //Next part of task

        Consumer printString = (inputString) -> System.out.println(inputString);

        String Str1 = "Test string";
        printString.inputStr(Str1);

        //Next part of task

        Function makeNumSquare = (num) -> num * num;

        System.out.println("Enter number to be squared:");

        int testNum = input.nextInt();

        System.out.println("Squared number = " + makeNumSquare.inputNumber(testNum));

        //Next part of task

        Supplier getRandomNumber = () -> {
            Random randomNum = new Random();
            return randomNum.nextInt(1000);
        };

        int randomNumber1 = getRandomNumber.someNumber();

        System.out.println("Random number between 0 and 1000 is " + randomNumber1);

        //Next part of task

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Ivan", "Ivanov", 23, "Sales Department"));
        employeeList.add(new Employee("Anton", "Petrov", 26, "Marketing Department"));
        employeeList.add(new Employee("Sidor", "Sidorov", 19, "Software Department"));
        employeeList.add(new Employee("Ion", "Ionescu", 30, "Software Department"));
        employeeList.add(new Employee("Karl", "Aratunyan", 18, "Marketing Department"));
        employeeList.add(new Employee("Anna", "Antonova", 24, "Sales Department"));

        System.out.println("Printing employees that work at software department:");
        for (Employee element : employeeList) {
            testEmployee(element, new TestEmployeeWorksAtSoftwareDep());
        }

        System.out.println("Printing employees that are older than 20:");
        for (Employee element : employeeList) {
            testEmployee(element, new TestIfEmployeeOlderThan20());
        }

        System.out.println("Printing employees with names starting with 'A':");
        for (Employee element : employeeList) {
            testEmployee(element, new TestEmployeeNameStartsWithA());
        }

    }

    public static void testEmployee (Employee thisEmployee, PredicateEmployee testMethod){
        if(testMethod.test(thisEmployee) == true)
            System.out.println(thisEmployee.Name + " " + thisEmployee.Surname);
    }
}

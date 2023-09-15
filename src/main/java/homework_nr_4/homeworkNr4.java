package homework_nr_4;
import java.util.Scanner;

public class homeworkNr4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle radius:");
        float inputRadius = input.nextFloat();
        Circle C1 = new Circle(inputRadius);
        C1.calculateArea();

        System.out.print("Enter Celsius value:");
        float inputCelsius = input.nextFloat();
        //float Cgrad1 = inputCelsius;
        float Fgrad1 = TemperatureConverter.toFahrenheit(inputCelsius);
        System.out.println(inputCelsius + " Celsius = " + Fgrad1 + " Fahrenheit");
        System.out.print("Enter Fahrenheit value:");
        float inputFahrenheit = input.nextFloat();
        //float Fgrad2 = 100F;
        float Cgrad2 = TemperatureConverter.toCelsius(inputFahrenheit);
        System.out.println(inputFahrenheit + " Fahrenheit = " + Cgrad2 + " Celsius");
    }
}

package homework_nr_4;

public class TemperatureConverter {
    public static float toCelsius(float grad){
        return ((grad-32)*5/9);
    }

    public static float toFahrenheit(float grad){
        return (grad*9/5+32);
    }
    public static void main(String[] args) {

    }
}

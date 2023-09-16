package homework_nr_5;

import java.math.BigInteger;


public class HomeworkNr5 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++){
            array[i] = 100 - i;
        }
        for (int i = 0; i < 100; i++){
            System.out.print(array[i] + " ");
            if ((i % 10) == 0) System.out.println();
            if (array[i] < 10) System.out.print(" ");
        }
        int sum = 0;
        /*long multiply = 1;
        for (int i = 0; i < array.length; i++){
            if ((i % 2) == 0) sum += array[i];
            if ((i % 2) != 0) multiply *= array[i];
        }*/

        BigInteger mult = new BigInteger("1");

        for (int i = 0; i < array.length; i++){
            if ((i % 2) == 0) sum += array[i];
            if ((i % 2) != 0) mult = mult.multiply(BigInteger.valueOf(array[i]));
        }
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Sum of even array values is " + sum);
        System.out.println("Multiply of odd array values is " + mult);
        System.out.println();
        System.out.println("------------------------------");

        int[] copyNumbers = new int[array.length];
        for (int i = 0; i < array.length; i++){
            copyNumbers[i] = array[i];
        }

        for (int i = 0; i < copyNumbers.length; i++){
            System.out.print(copyNumbers[i] + " ");
            if ((i % 10) == 0) System.out.println();
            if (array[i] < 10) System.out.print(" ");
        }
    }
}

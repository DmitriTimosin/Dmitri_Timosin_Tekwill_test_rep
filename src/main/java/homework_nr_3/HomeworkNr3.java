package homework_nr_3;


public class HomeworkNr3 {
    public static void main(String[] args) {
        int Month = 30;
        switch (Month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("No such a month");
                break;
        }

    for(int i = 100; i <= 1000; i++) {
        if ((i % 5) == 0) {
            System.out.print(i + " ");
        }
        if (((i % 100) == 0) && (i != 100)) {
            System.out.println();
        }
    }

    double SumOfDevides = 0;
    for (int j = 3; j <= 99; j += 2) {
        /*if (j % 2 != 0) {*/
            SumOfDevides += (double) (j - 2) / j;
        /*    }*/
        }
    System.out.println("Sum of devides = " + SumOfDevides);

    /*double test = 1D / 3D;
        System.out.println(test);*/

}
}
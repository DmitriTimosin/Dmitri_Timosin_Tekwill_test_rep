package homework_nr_6;

public class Date {

    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        if ((day < 1) || (day > 31)) System.out.println("Wrong day number");
        else this.day = day;
    }

    public void setMonth(int month) {
        if ((month < 1) || (month > 12)) System.out.println("Wrong month number");
        else this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        if ((day < 1) || (day > 31)) return -1;
        else return day;
    }

    public int getMonth() {
        if ((month < 1) || (month > 12)) return -1;
        return month;
    }

    public int getYear() {
        return year;
    }

    public void displayDate(){
        //String wrongDay = "Wrong day";
        String currentMonth = " ";
        switch (month) {
            case 1:
                currentMonth = "JAN";
                break;
            case 2:
                currentMonth = "FEB";
                break;
            case 3:
                currentMonth = "MAR";
                break;
            case 4:
                currentMonth = "APR";
                break;
            case 5:
                currentMonth = "MAY";
                break;
            case 6:
                currentMonth = "JUN";
                break;
            case 7:
                currentMonth = "JUL";
                break;
            case 8:
                currentMonth = "AUG";
                break;
            case 9:
                currentMonth = "SEP";
                break;
            case 10:
                currentMonth = "OCT";
                break;
            case 11:
                currentMonth = "NOV";
                break;
            case 12:
                currentMonth = "DEC";
                break;
        }

        if ((day < 1) || (day > 31) || (month < 1) || (month > 12)) System.out.println("Wrong date");
        else System.out.println(day + " " + currentMonth + " " + year);

        //System.out.println(day + " " + month + " " + year);
    }

}

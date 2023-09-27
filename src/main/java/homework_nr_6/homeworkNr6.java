package homework_nr_6;

public class homeworkNr6 {
    public static void main(String[] args) {

        //Employee part

        Employee employee1 = new Employee("Johnson", 32, "Security");
        System.out.println("Employee 1 name is " + employee1.getName());
        employee1.setName("Nixon");
        System.out.println("Employee 1 name is " + employee1.getName());

        //Invoice part

        System.out.println("--------------------------");
        Invoice ikeaChairInvoice1 = new Invoice("Strudel", "Basic chair", 4, 23.56);
        System.out.println("Price for " + ikeaChairInvoice1.getQuantity() + " Ikea chairs is " + ikeaChairInvoice1.getAmount() + "$");
        ikeaChairInvoice1.setPrice(-23.4);
        System.out.println("Price for " + ikeaChairInvoice1.getQuantity() + " Ikea chairs is " + ikeaChairInvoice1.getAmount() + "$");
        ikeaChairInvoice1.setPrice(16.4);
        System.out.println("Price for " + ikeaChairInvoice1.getQuantity() + " Ikea chairs is " + ikeaChairInvoice1.getAmount() + "$");
        ikeaChairInvoice1.setQuantity(-3);
        System.out.println("Price for " + ikeaChairInvoice1.getQuantity() + " Ikea chairs is " + ikeaChairInvoice1.getAmount() + "$");

        //Date part

        System.out.println("--------------------------");
        Date date1 = new Date(45,5,1983);
        date1.displayDate();
        date1.setMonth(14);
        date1.displayDate();
        date1.setMonth(6);
        date1.setDay(24);
        date1.displayDate();
    }
}

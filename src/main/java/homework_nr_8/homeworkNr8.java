package homework_nr_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class homeworkNr8 {

    public static void main(String[] args) {

        //----First task--------------

        ArrayList<String> DaySchedule = new ArrayList<>();

        DaySchedule.add("Awakening");
        DaySchedule.add("Breakfast");
        DaySchedule.add("Way to work");
        DaySchedule.add("Work");
        DaySchedule.add("Lunch");
        DaySchedule.add("Work");
        DaySchedule.add("Way home");
        DaySchedule.add("Dinner");
        DaySchedule.add("Sleep");

        for(int i=0; i < DaySchedule.size(); i++) System.out.println(DaySchedule.get(i));

        //-----Second task-----------------------------------

        System.out.println("---------------------------");

        ArrayList<String> notUniqueItems = new ArrayList<>();
        ArrayList<String> uniqueItems = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String Item;
        boolean flag;

        System.out.println("Start entering items. Enter 'exit' to finish entering");
        while (true){
            Item = input.nextLine();
            if (Objects.equals(Item, "exit")) break;
            else notUniqueItems.add(Item);
        }

        System.out.println("You have entered the list:");
        System.out.println(notUniqueItems);

        for (int i=0; i < (notUniqueItems.size() - 1); i++){
            flag = false;
            for (int j=1; j < notUniqueItems.size(); j++)
                if ((Objects.equals(notUniqueItems.get(i), notUniqueItems.get(j))) && i != j) flag = true;
            if (flag == false) uniqueItems.add(notUniqueItems.get(i));
        }

        System.out.println("Unique items of the list are:");
        System.out.println(uniqueItems);

        //---------Third task------------------------------------------------

        System.out.println("---------------------------");

        /*ArrayList<String> englishWords = new ArrayList<>();
        ArrayList<String> romanianWords = new ArrayList<>();

        englishWords.add("Apple");
        englishWords.add("Apricot");
        englishWords.add("Grape");
        englishWords.add("Orange");
        englishWords.add("Strawberry");
        englishWords.add("Melon");
        englishWords.add("Watermelon");
        englishWords.add("Pear");
        englishWords.add("Plum");
        englishWords.add("Blueberry");

        romanianWords.add("Măr");
        romanianWords.add("Caisă");
        romanianWords.add("Struguri");
        romanianWords.add("Portocale");
        romanianWords.add("Căpșună");
        romanianWords.add("Pepeni verzi");
        romanianWords.add("Pepeni");
        romanianWords.add("Pară");
        romanianWords.add("Prună");
        romanianWords.add("Coacăze");

        for (int i=0; i < englishWords.size(); i++)
            System.out.println(englishWords.get(i) + " - " + romanianWords.get(i));
        */

        HashMap<String, String> EnRoDictionary = new HashMap<>();

        EnRoDictionary.put("Apple","Măr");
        EnRoDictionary.put("Apricot","Caisă");
        EnRoDictionary.put("Grape","Struguri");
        EnRoDictionary.put("Orange","Portocale");
        EnRoDictionary.put("Strawberry","Căpșună");
        EnRoDictionary.put("Melon","Pepeni");
        EnRoDictionary.put("Watermelon","Pepeni verzi");
        EnRoDictionary.put("Pear","Pară");
        EnRoDictionary.put("Plum","Prună");
        EnRoDictionary.put("Blueberry","Coacăze");

        System.out.println(EnRoDictionary);
    }
}

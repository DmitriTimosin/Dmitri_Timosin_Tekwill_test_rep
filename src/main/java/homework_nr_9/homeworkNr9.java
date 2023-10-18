package homework_nr_9;

public class homeworkNr9 {
    public static void main(String[] args) {

        Elephant Elephant1 = new Elephant("Banana Tree", 600);

        Elephant1.AnimalIsEating();
        Elephant1.LookOutForEnemies();
        Elephant1.Poop();
        Elephant1.BigOrSmall();

        Herbivore Elephant2 = new Elephant("Aloe", 50);

        Elephant2.BigOrSmall();
        Elephant1.SwingEars();

        Elephant2 = Elephant1;

        Elephant2.BigOrSmall();

    }
}

class Elephant extends Herbivore implements Animal{

    int Weight;
    /*public Elephant(String favoritePlant) {
        super(favoritePlant);
    }*/

    public Elephant(String favoritePlant, int weight) {
        super(favoritePlant);
        super.Weight = weight;
    }

    @Override
    void LookOutForEnemies() {
        //super.LookOutForEnemies();
        System.out.println("Elephant is looking out for enemies");
    }

    @Override
    public void AnimalIsEating() {
        System.out.println("Elephant is eating " + super.FavoritePlant);
    }

    @Override
    void BigOrSmall() {
        super.BigOrSmall();
    }

    /*public void ElephantIsEating(){
        System.out.println("Food - " + super.FavoritePlant);
    }*/

    void SwingEars(){
        System.out.println("Elephant is swinging ears");
    }


}
interface Animal{


    void AnimalIsEating();

}

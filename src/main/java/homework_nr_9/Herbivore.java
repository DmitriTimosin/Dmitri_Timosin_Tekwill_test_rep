package homework_nr_9;

public abstract class Herbivore {
    String FavoritePlant;
    int Weight;

    void LookOutForEnemies() {
        System.out.println("Herbivore is looking out for enemies");
    }

    public Herbivore(String favoritePlant) {
        FavoritePlant = favoritePlant;
    }

    void Poop(){
        System.out.println("Herbivore is pooping plant poop");
    }

    void BigOrSmall(){
        if (Weight<200) System.out.println("Herbivore is small");
        else System.out.println("Herbivore is big");
    }
}

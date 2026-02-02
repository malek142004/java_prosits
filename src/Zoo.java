public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Instruction 6 : Constructeur [cite: 30]
    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25]; // Max 25 animaux [cite: 19]
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Instruction 8 : Méthode displayZoo() [cite: 37]
    public void displayZoo() {
        System.out.println("Zoo: " + name + " | Ville: " + city + " | Cages: " + nbrCages);
    }

    // Instruction 9 : Redéfinition de toString() [cite: 47]
    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + nbrCages + "]";
    }
}
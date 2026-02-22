

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Zoo Esprit", "Tunis");

        Animal lion = new Animal("Simba", "Felin", 5, true);
        Animal eagle = new Animal("Aquila", "Bird", 3, false);

        zoo.addAnimal(lion);
        zoo.addAnimal(eagle);
    }
}
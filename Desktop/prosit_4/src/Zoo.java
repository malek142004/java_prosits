

public class Zoo {

    private String name;
    private String city;
    private Animal[] animals;
    private int animalCount;

    public static final int MAX_ANIMALS = 25;

    // Constructeur
    public Zoo(String name, String city) {
        setName(name); // validation du nom
        this.city = city;
        animals = new Animal[MAX_ANIMALS];
        animalCount = 0;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter avec contrainte
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("❌ Le nom du zoo ne doit pas être vide !");
        } else {
            this.name = name;
        }
    }

    // Vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }

    // Instruction 17 : utilisation de isZooFull()
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("❌ Le zoo est plein !");
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        return true;
    }
}


public class Animal {

    private String name;
    private String family;
    private int age;
    private boolean isMammal;

    // Constructeur
    public Animal(String name, String family, int age, boolean isMammal) {
        this.name = name;
        this.family = family;
        setAge(age); // utilisation du setter
        this.isMammal = isMammal;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    // Setter avec contrainte
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("❌ L'âge ne peut pas être négatif !");
        } else {
            this.age = age;
        }
    }
}
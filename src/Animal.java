public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Instruction 6 : Constructeur paramétré [cite: 30]
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Instruction 9 : Redéfinition de toString() [cite: 48]
    @Override
    public String toString() {
        return "Animal : " + name + " (" + family + "), Age: " + age + ", Mammifère: " + isMammal;
    }
}
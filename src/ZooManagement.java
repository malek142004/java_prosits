public class ZooManagement {
    public static void main(String[] args) {
        // Instruction 7 : Création via constructeurs [cite: 35]
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Zoo myZoo = new Zoo("Esprit Tech Park", "Tunis", 30);

        // Instruction 8 : Test de displayZoo() [cite: 41]
        System.out.println("--- Affichage via displayZoo ---");
        myZoo.displayZoo();

        // Instruction 8.3 & 9 : Test de toString() [cite: 44, 47]
        System.out.println("--- Affichage direct (toString) ---");
        System.out.println(myZoo);
        System.out.println(lion);
    }
}
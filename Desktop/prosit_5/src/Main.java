
public class Main {

    public static void main(String[] args) {

        // Instruction 21 : constructeurs par défaut
        Aquatic aquatic = new Aquatic();
        Terrestrial terrestrial = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        // Instruction 22 : constructeurs paramétrés
        Aquatic fish = new Aquatic("Nemo", "Fish", 2, false, "Ocean");
        Dolphin dol = new Dolphin("Flipper", "Mammal", 5, true, "Sea", 25.5f);
        Penguin pen = new Penguin("Pingu", "Bird", 3, false, "Ice", 100f);

        // Instruction 23 : toString()
        System.out.println(fish);
        System.out.println(dol);
        System.out.println(pen);

        // Instruction 24 : comportement swim
        fish.swim();
        dol.swim();
        pen.swim(); // hérite de Aquatic
    }
}
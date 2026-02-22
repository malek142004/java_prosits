

public class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String name, String family, int age, boolean isMammal, String habitat) {
        super(name, family, age, isMammal);
        this.habitat = habitat;
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", habitat='" + habitat + '\'';
    }
}
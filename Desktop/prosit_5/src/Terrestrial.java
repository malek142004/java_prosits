

public class Terrestrial extends Animal {

    protected int nbrLegs;

    public Terrestrial() {
        super();
    }

    public Terrestrial(String name, String family, int age, boolean isMammal, int nbrLegs) {
        super(name, family, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nbrLegs=" + nbrLegs;
    }
}
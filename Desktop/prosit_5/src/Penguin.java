

public class Penguin extends Aquatic {

    protected float swimmingDepth;

    public Penguin() {
        super();
    }

    public Penguin(String name, String family, int age, boolean isMammal,
                   String habitat, float swimmingDepth) {
        super(name, family, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", swimmingDepth=" + swimmingDepth;
    }
}
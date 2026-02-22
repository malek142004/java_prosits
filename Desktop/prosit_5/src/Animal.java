public class Animal {

    protected String name;
    protected String family;
    protected int age;
    protected boolean isMammal;

    public Animal() {
    }

    public Animal(String name, String family, int age, boolean isMammal) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
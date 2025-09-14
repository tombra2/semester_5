public class FemalePerson extends Person {


    public FemalePerson(String name, int height, double weight, char gender) {
        super(name, height, weight, gender);
    }

    public boolean hasOverweight() {
        return this.calcBMI() > 30;
    }
}

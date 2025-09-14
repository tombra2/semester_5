abstract public class Person {
    private String name;
    private int height;
    private double weight;
    private char gender;


    public Person(String name, int height, double weight, char gender) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public double calcBMI() {
        return this.weight / Math.pow((double) this.height / 100, 2);
    }
    abstract public boolean hasOverweight();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

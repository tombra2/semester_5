public class MalePerson extends Person {


    public MalePerson(String name, int height, double weight, char gender) {
        super(name, height, weight, gender);
    }


    public boolean hasOverweight(){
        return calcBMI() > 29;
    }
}

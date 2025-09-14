public class TestPerson {
    static void main() {

        MalePerson m = new MalePerson("Markus",192,110, 'm');
        MalePerson t = new MalePerson("Thomas",182,100, 'm');
        FemalePerson l = new FemalePerson("Lisa",192, 110, 'f');


        m.hasOverweight();
        System.out.printf("%s ist Overweight %b", m.getName(), m.hasOverweight());
        System.out.println();
        System.out.printf("%s ist Overweight %b", t.getName(), t.hasOverweight());
        System.out.println();
        System.out.printf("%s ist Overweight %b", l.getName(), l.hasOverweight());

    }
}

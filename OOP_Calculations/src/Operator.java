abstract public class Operator {

    private  String sign;

    public Operator(String sign) {
        this.sign = sign;
    }

    abstract public Number perform(Number one, Number two);

    @Override
    public String toString() {
        return this.sign;

    }

}

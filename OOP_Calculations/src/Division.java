public class Division extends Operator {
    public Division() {
        super("/");
    }

    @Override
    public Number perform(Number one, Number two) {
        return new Number(one.getValue() / two.getValue());
    }

    @Override
    public String toString() {
        return "/";
    }
}

public class Calculation {

    Number num1;
    Number num2;
    Operator sign;

    public Calculation(Number num1, Number num2, Operator sign) {
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
    }

    public Calculation(double num1, double num2, Operator sign) {
        this.sign = sign;
    }

    public Number getResult() {
        return sign.perform(this.num1, this.num2);
    }
}

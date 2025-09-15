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

    public Number getCalculationFromString(String str){
        double num1;
        String sign;
        double num2;
        String prep =str.trim();

        for (int i = 0; i < str.length(); i++) {


        }

        return null;
    }

    @Override
    public String toString() {
        return String.format("%s %s  %s = %s",this.num1,this.sign, this.num2,this.getResult());
    }
}

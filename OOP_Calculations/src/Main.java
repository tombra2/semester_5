public class Main {
    static void main() {


        Number num1 = new Number(4);
        Number num2 = new Number(3);
        Calculation c1 = new Calculation(num1, num2, new Division());
        System.out.println(c1);


    }
}

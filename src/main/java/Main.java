public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(100, 50));
        System.out.println(intsCalc.sub(100, 50));
        System.out.println(intsCalc.div(100, 50));
        System.out.println(intsCalc.pow(2, 10));

    }
}
public class Operators extends Calculator{
    @Override
    public void add() {
        double result = a + b;
        System.out.println(result);
    }

    @Override
    public void subtract() {
        double result = a - b;
        System.out.println(result);
    }

    @Override
    public void multiply() {
        double result = a * b;
        System.out.println(result);

    }

    @Override
    public void divide() {
        double result = a / b;
        System.out.println(result);


    }
}

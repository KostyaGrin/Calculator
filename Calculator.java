public abstract class Calculator {
    double a;
    double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public abstract void add();
    public abstract void subtract();
    public abstract void multiply();
    public abstract void divide();


}

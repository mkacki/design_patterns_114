package pl.sda.java.designPatterns.creational.factoryMethod;

public abstract class AbstractPlan {

    abstract double getRate();

    public double calculateBill(int unit) {
        double sum = unit * getRate();
        return sum;
    }
}

package toma_example;

public class Elephant implements Visitor {
    @Override
    public void visitElement(Cab element) {
        System.out.println("cab is small");
    }

    @Override
    public void visitElement(Truck element) {
        System.out.println("this is perfect for me");
    }
}

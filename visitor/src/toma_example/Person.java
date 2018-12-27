package toma_example;

public class Person implements Visitor {
    @Override
    public void visitElement(Cab element) {
        System.out.println("going by cab");

    }

    @Override
    public void visitElement(Truck elemenet) {
        System.out.println("this is a little spacious for me");

    }
}

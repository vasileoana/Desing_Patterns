package toma_example;

public class Cab implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElement(this);
    }
}

import entity.Child;

public class ChildNameSpecification  extends AbstractSpecification<Child> {

    private String name;

    public ChildNameSpecification(String name) {
        this.name=name;
    }

    @Override
    public boolean isSatisfiedBy(Child t) {
        return t.getName().equals(name);
    }
}

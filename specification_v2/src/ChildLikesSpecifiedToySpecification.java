import entity.Child;
import entity.Toy;

public class ChildLikesSpecifiedToySpecification implements Specification<Child> {

    private Specification<Toy> spec;

    public ChildLikesSpecifiedToySpecification(Specification<Toy> s) {
        super();
        this.spec = s;
    }

    @Override
    public boolean isSatisfiedBy(Child child) {
        for( Toy t : child.getFavouriteToys()) {
            if( spec.isSatisfiedBy(t) )
                return true;
        }
        return false;
    }
}

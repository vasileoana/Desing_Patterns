import java.util.HashSet;
import java.util.Set;

public class OrSpecification<T> extends AbstractSpecification<T> {


    private Set<Specification<T>> set = new HashSet<Specification<T>>();


    public OrSpecification(Specification<T> a, Specification<T> b) {
        set.add(a);
        set.add(b);
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        for (Specification<T> specification : set) {
            if (specification.isSatisfiedBy(t)){
                return true;
            }
        }
        return false;
    }

    @Override
    public AbstractSpecification<T> or(Specification<T> s) {
        set.add(s);
        return this;
    }
}

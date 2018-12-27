public class NotSpecification extends CompositeSpecification{

    private ISpecification wrapped;

    public NotSpecification(ISpecification wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return wrapped.isSatisfiedBy(candidate);
    }


}

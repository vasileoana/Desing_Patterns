public abstract class CompositeSpecification implements ISpecification {

    public abstract boolean isSatisfiedBy(Object candidate);

    @Override
    public ISpecification And(ISpecification other) {
        return new AndSpecification(this, other);
    }

    @Override
    public ISpecification AndNot(ISpecification other) {
        return new AndNotSpecification(this, other);
    }

    @Override
    public ISpecification Or(ISpecification other) {
        return new OrSpecification(this, other);
    }

    @Override
    public ISpecification OrNot(ISpecification other) {
        return new OrNotSpecification(this,other);
    }

    @Override
    public ISpecification Not() {
        return new NotSpecification(this);
    }
}

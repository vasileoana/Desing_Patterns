public class AndSpecification extends CompositeSpecification {

    private ISpecification leftCondition;
    private ISpecification rightCondition;

    public AndSpecification(ISpecification leftCondition, ISpecification rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return leftCondition.isSatisfiedBy(candidate) && rightCondition.isSatisfiedBy(candidate);
    }
}

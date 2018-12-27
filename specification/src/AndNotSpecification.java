public class AndNotSpecification extends CompositeSpecification {

    private ISpecification leftCondition;
    private ISpecification rightConditin;

    public AndNotSpecification(ISpecification leftCondition, ISpecification rightConditin) {
        this.leftCondition = leftCondition;
        this.rightConditin = rightConditin;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return !(leftCondition.isSatisfiedBy(candidate) && rightConditin.isSatisfiedBy(candidate));
    }
}

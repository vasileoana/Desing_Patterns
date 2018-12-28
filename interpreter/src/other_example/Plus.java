package other_example;

import java.util.Map;

public class Plus extends CompositeExpression {

    public Plus(Expression leftOperand, Expression rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return leftOperand.interpret(context) + rightOperand.interpret(context);
    }
}

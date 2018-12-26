// Interpreter pattern provides a way to evaluate language grammar or expression.
// This pattern involves implementing an expression interface which tells to interpret a particular context.
// This pattern is used in SQL parsing, symbol processing engine etc.
public class Main {
    public static void main(String[] args) {
        Expression isMale = Interpreter.getMaleExpression();
        Expression isMarriedWoman = Interpreter.getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}

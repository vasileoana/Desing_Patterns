package other_example;

import java.util.Map;

public class Variable extends TerminalExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> context) {
       if(null == context.get(name)){
           return 0;
       }
       else {
           return context.get(name).interpret(context);
       }
    }
}

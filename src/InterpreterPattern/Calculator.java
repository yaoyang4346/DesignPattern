package InterpreterPattern;

import java.util.Stack;

/**
 * Created by cheny on 2018/5/9.
 */
public class Calculator {
    private Stack<Expression> stack = new Stack<>();
    private String expression;

    public Calculator(String expression){
        this.expression = expression;
    }

    public int calculate(){
        Expression exp1,exp2;

        String[] elements = expression.split(" ");
        for (int i = 0;i<elements.length;i++){
            switch (elements[i].charAt(0)){
                case '+':
                    exp1 = stack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(new AdditionExpression(exp1,exp2));
                    break;
                case '-':
                    exp1 = stack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(new SubtractionExpression(exp1,exp2));
                    break;
                default:
                    stack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }

        return stack.pop().interpret();
    }
}

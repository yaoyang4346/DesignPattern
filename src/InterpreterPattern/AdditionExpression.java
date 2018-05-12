package InterpreterPattern;

/**
 * Created by cheny on 2018/5/9.
 */
public class AdditionExpression extends OperatorExpression{
    public AdditionExpression(Expression exp1, Expression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}

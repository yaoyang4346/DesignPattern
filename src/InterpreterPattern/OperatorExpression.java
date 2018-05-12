package InterpreterPattern;

/**
 * Created by cheny on 2018/5/9.
 */
public abstract class OperatorExpression implements Expression{
    protected Expression exp1,exp2;

    public OperatorExpression(Expression exp1,Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

}

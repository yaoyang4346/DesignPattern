package InterpreterPattern;

/**
 * Created by cheny on 2018/5/9.
 */
public class NumExpression implements Expression{
    private int num;
    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}

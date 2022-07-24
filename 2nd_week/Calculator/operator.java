package cn.Ytangxk.Calculator;

public enum operator {
    ADD('+', 1),
    MINUS('-', 1),
    TIMES('*', 2),
    OBELUS('/', 2),
    LEFT_PARENTHESES('(', 3),
    RIGHT_PARENTHESES(')', 3);

    char op;
    int flag;

    operator(){

    }
    operator(char op, int flag) {
        this.op = op;
        this.flag = flag;
    }

    public static int opCompare(char op1, char op2) {
        int f1 = 0, f2 = 0;
        for (operator o : operator.values()) {
            if (o.op == op1) {
                f1 = o.flag;
            }
            if (o.op == op2) {
                f2 = o.flag;
            }
        }
        return f1-f2;
    }


    public static boolean isOperator(char c){
        for(operator o : operator.values()){
            if(o.op==c){
                return true;
            }
        }
        return false;
    }
}

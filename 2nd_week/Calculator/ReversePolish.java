package cn.Ytangxk.Calculator;

import java.util.Stack;

public class ReversePolish {
    private Stack<Character> op = new Stack<>();
    private String Str;

    public ReversePolish() {
    }

    public ReversePolish(String Str) {
        this.Str = Str;
    }

    public Stack getExpress(String Str) {
        Stack express = new Stack();
        Stack<Character> op = new Stack<>();
        char[] chars = Str.toCharArray();
        int left_bracket = 0;
        boolean isNum;
        for (int i = 0; i < chars.length; i++) {
            if (!operator.isOperator(chars[i])) {
                express.push(chars[i]);
            } else {
                if (op.isEmpty()) {
                    op.push(chars[i]);
                } else if (chars[i] == '(') {
                    left_bracket++;
                    op.push(chars[i]);
                } else if (chars[i] == ')') {
                    while (op.peek() != '(') {
                        express.push(op.pop());
                    }
                    op.pop();
                    left_bracket--;
//                    int l = op.lastIndexOf('(');
//                    int tmp = op.size() - 1 - l;
//                    while (tmp != 0) {
//                        express.push(op.pop());
//                        tmp--;
//                    }
//                      op.pop();
//                    left_bracket--;
                } else if (chars[i] == '*' || chars[i] == '/') {
                    if (operator.opCompare(chars[i], op.peek()) == 0) {
                        express.push(op.pop());
                        op.push(chars[i]);
                    } else op.push(chars[i]);//&&&
                } else if (chars[i] == '+' || chars[i] == '-') {
                    if (operator.opCompare(chars[i], op.peek()) == 0) {
                        express.push(op.pop());
                        op.push(chars[i]);
                    } else if (operator.opCompare(chars[i], op.peek()) < 0) {
                        while (op.peek() != '(' || operator.opCompare(chars[i], op.peek()) < 0 || operator.opCompare(chars[i], op.peek()) == 0) {
                            express.push(op.pop());
                            if (op.isEmpty()) {
                                break;
                            }
                        }
                        op.push(chars[i]);
                    }
                }
            }
        }
        while (!op.isEmpty()) {
            express.push(op.pop());
        }
        return express;
    }

    public String getStr() {
        return Str;
    }

    public void setStr(String str) {
        Str = str;
    }

}


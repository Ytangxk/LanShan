package cn.Ytangxk.Calculator;

public class myException extends Exception {

    public myException() {
    }

    @Override
    public String toString() {
        return "请检查表达式，被除数不能为0。";
    }

    @Override
    public String getMessage() {
        return "请检查表达式，被除数不能为0。";
    }
}

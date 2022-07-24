package cn.Ytangxk.Calculator;
//能抛出并捕获除0错误

//带括号代码实现了，但不知道为什么空栈错误，代码推下来没有问题
//没有实现小数....

import java.util.Iterator;
import java.util.Stack;

public class test {
    public static void main(String[] args) {

        ReversePolish t = new ReversePolish();
        Calculate c = new Calculate();
        try{
            stringAnalysis.exception("1+2/0-3");
        } catch (myException e) {
            e.printStackTrace();
        }
        t.setStr("1+9*4+7-9-3");
        Stack kk = t.getExpress(t.getStr());
        Iterator it = kk.iterator();
        StringBuffer stringBuffer = new StringBuffer();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        String s = new String(stringBuffer);
        String[] arr = s.split("");
        System.out.println(c.resule(arr));
    }
}

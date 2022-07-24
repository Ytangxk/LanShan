package cn.Ytangxk.Calculator;

public class stringAnalysis {

     String str;

    public stringAnalysis(String s) {
        this.str = s;
    }

    public static void exception(String str) throws myException {
        char[] cc = str.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            if (cc[i] == '/') {
                if (cc[i + 1] == '0') {
                    throw new myException();
                } else {
                    continue;
                }

            }
        }
    }

}
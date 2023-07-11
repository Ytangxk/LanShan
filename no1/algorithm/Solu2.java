package no1.algorithm;

/**
 * @ClassName Solu2
 * @Description TODO
 * @Author Tang
 * @Date 2023/7/10 19:43
 * @Version 1.0
 **/
public class Solu2 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuilder rs = new StringBuilder(s);
        rs.reverse();
        return rs.toString().equals(s);
    }

    public static void main(String[] args) {
        int x = 12321;
        int y = -12321;
        Solu2 solu2 = new Solu2();
        System.out.println(solu2.isPalindrome(x));
        System.out.println(solu2.isPalindrome(y));
    }
}

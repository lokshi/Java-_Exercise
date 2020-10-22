package cn.tx.demo;

public class Test {
    public static void main(String[] args) {
        int a =5;
        boolean result = (a++>5) && (++a >4);
        System.out.println(result);
        System.out.println(a);
    }
}

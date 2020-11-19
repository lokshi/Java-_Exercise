package src.cn.tx.demo.Chapter5;

class Number {
    private int n1;
    private int n2;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }


    public void addition() {
        int add = n1 + n2;
        System.out.printf("%s + %s = %s \n", n1, n2, add);
    }

    public void subtration() {
        int sub = n1 - n2;
        System.out.printf("%s - %s = %s \n", n1, n2, sub);
    }

    public void multiplication() {
        int mul = n1 * n2;
        System.out.printf("%s * %s = %s \n", n1, n2, mul);
    }

    public void division() {
        int div = n1 / n2;
        System.out.printf("%s / %s = %s \n", n1, n2, div);
    }

}


public class Ex06 {
    public static void main(String[] args) {
        Number match = new Number(30,21);
        match.addition();
        match.subtration();
        match.multiplication();
        match.division();

    }

}

package cn.tx.demo.chapter4;

public class Jiechen {
    public static void main(String[] args) {
        /**
         * 求阶乘 1!+2!+3!....+10！
         */

        int total=0;
        for (int i = 1; i <=10; i++) {
            total +=chen(i);
        }

        System.out.println(total);

    }

    public static int chen(int number) {
        int sum = 1;
        if (number > 1) {

            sum = number*chen(number-1);
            }


        return sum;
    }
}

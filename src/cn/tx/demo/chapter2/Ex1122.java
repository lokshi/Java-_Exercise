package cn.tx.demo.chapter2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Ex1122 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        float r = 4, h = 7;
        double s = r * r * Math.PI;
        double v = s * h;

        System.out.println("半径：% " + r + ", 高： " + h);
        System.out.println("底面积： " + df.format(s));
        System.out.println("体积： " + df.format(v));
        System.out.printf("%.2f \n", s);

    }


}

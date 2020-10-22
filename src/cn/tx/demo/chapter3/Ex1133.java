package cn.tx.demo.chapter3;

public class Ex1133 {
    public static void main(String[] args) {
        int num1=7,num2=3,num3=9;

        if(num1<num2 && num1 < num3) {
            System.out.print(num1+"  ");
            if(num2<num3){
                System.out.print(num2+"  "+num3);
            }else{
                System.out.print(num3+"  "+num2);
            }
        }else if(num2<num1 && num2 < num3) {
            System.out.print(num2+"  ");
            if(num1<num3){
                System.out.print(num1+"  "+num3);
            }else{
                System.out.print(num3+"  "+num1);
            }
        }else {
            System.out.println(num3+"  ");
            if(num1<num2){
                System.out.print(num1+"  "+num2);
            }else{
                System.out.print(num2+"  "+num1);
            }
        }
    }
}

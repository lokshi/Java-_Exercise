package cn.tx.demo.chapter3;

public class Ex1111 {
    public static void main(String[] args) {
        int time =161;
        int price=30;
        double sum=0;
        if(time>160){
            sum=price*1.5*time;
        }else{
            sum=price*time;
        }
        System.out.printf("%.2f",sum);
    }

}

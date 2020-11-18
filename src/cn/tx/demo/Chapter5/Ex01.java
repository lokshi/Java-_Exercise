package cn.tx.demo.Chapter5;

import java.util.Random;

class A {
    int v=9;
}

class Guess{
    int a;

    public void setA(int a) {
        this.a = a;
    }

    public Guess(int a){
        this.a=a;
    }
    public  Guess(){

    }
    public boolean  dd(){
        boolean flag=false;
        Random d = new Random();
//        System.out.println(d.nextInt(10));

        A guess = new A();
        if (a ==guess.v){
            //System.out.println("Yes");
            flag=true;
        }else{
            //System.out.println("Worng");
            flag=false;
        }
        return flag;
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Guess guess = new Guess();
        guess.setA(8);
        boolean flag =guess.dd();
        if(flag){
            System.out.println("yes");
        }else {
            System.out.println("fail");
        }
    }
}

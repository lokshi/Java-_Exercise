package cn.tx.demo.chapter4;

public class Chenji {
    public static void main(String[] args) {
        System.out.println(duibi(90));


    }
    public static int duibi(int num){
        int level=0;
        if(num>=90){
            level=1;
        }else if(num>=60){
            level=2;
        }else{
            level=3;
        }
        //System.out.println(level);
        return level;
    }



}


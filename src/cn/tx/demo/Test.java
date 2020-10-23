package cn.tx.demo;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=(5-i) ; j++) {
                System.out.print(" ");
                }
            for (int a = 1; a <=2*i-1 ; a++) {
                //打印空心菱形
                if(a==1 || a ==(2*i-1)){
                    System.out.print("*");
                }else{
                    System.out.print (" ");
                }

            }
        System.out.println();
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <=(5-i) ; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <=2*i-1 ; a++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }

}


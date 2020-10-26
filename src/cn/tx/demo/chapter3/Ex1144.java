package cn.tx.demo.chapter3;

public class Ex1144 {
    public static void main(String[] args) {
        int k = 0;

        for (int i = 2; i < 100; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.print(i+"\t");
                k++;
//                if (k>999){
//                    System.out.print(k+"\t");
//                    k=0;
            }

        }
        System.out.println(k);

    }
}


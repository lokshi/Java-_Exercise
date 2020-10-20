package cn.tx.demo;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Java");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        String[] arrs = {"aaa","bbb", "ccc"};
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }

        System.out.println("---------");


        for(String str:arrs) {
            System.out.println(str);
        }

        System.out.println("---------");
        try {
            System.out.println("aaa");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}


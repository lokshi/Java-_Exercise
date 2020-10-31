package cn.tx.demo.chapter4;

public class Ex1111 {
    public static void main(String[] args) {
        /**
         * 求数组最小值
         */

        int[] arr = {22, 13, 37, 99, 123, 4,2};

        int result = min(arr);
        System.out.println("最小数： " + result);

    }


    public static int min(int[] arr) {
        int minValue = arr[0];
        if (arr != null && arr.length != 0) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < minValue) {
                    minValue = arr[i];
                }
            }
        }
        return minValue;
    }

}

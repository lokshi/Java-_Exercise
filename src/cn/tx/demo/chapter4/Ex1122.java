package cn.tx.demo.chapter4;

import java.util.Arrays;

public class Ex1122 {
    public static void main(String[] args) {
        int[] arrA={1, 	7, 	9,	 11, 	13, 	15, 	17, 19};
        int[] arrB={2, 	4, 	6,	 8,     10};

        int[] arrC = combineArr(arrA,arrB);
        sortArr(arrC);

        for (int i = 0; i < arrC.length; i++) {
            System.out.print(arrC[i]+"\t");

        }
    }

    public static int [] combineArr(int[] arr1,int[] arr2) {
        int[] arrCombine=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrCombine[i]=arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arrCombine[j+arr1.length]=arr2[j];

        }
        return arrCombine;

    }

    public static void sortArr(int[] arr){
        int max=0;
        for (int i = 0; i < (arr.length-1); i++) {
            for (int j = 0; j < (arr.length-i-1); j++) {
                if(arr[j]>arr[j+1]){
                    max=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=max;
                }

            }

        }
    }
}

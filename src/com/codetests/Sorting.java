package com.codetests;

import java.util.Arrays;

public class Sorting {

    public static void bubbleSort(int[] arr){
        int temp;
        boolean checkSwap;
        for(int i = arr.length; i > 0; i--){
            checkSwap = false;
            for(int j = 0; j < i-1; j++){
                if(arr[j] > arr[j+1]){
                   temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
                   checkSwap= true;
                }
            }
            if(!checkSwap) {
                System.out.println("Number of passes: " + (arr.length - i));
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        bubbleSort(new int[]{8,1,2,3,4,5,6,7});
//        selectionSort(new int[]{2,1,4,5,76,78,8,3,4,56,0,4,3,5,6,7});
    }
}

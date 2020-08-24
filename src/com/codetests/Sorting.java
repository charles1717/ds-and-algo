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

    public static void selectionSort(int[] arr){
        System.out.println("Initial Array: " + Arrays.toString(arr));
        int min, temp, swapCounter = 0;
        for(int i = 0; i < arr.length; i++) {
            min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i) {
                swapCounter++;
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr) + " swapped " + swapCounter + " times");
    }

    public static void main(String[] args) {
//        bubbleSort(new int[]{8,1,2,3,4,5,6,7});
        selectionSort(new int[]{2,1,4,5,76,78,8,3,4,56,0,4,3,5,6,7});
    }
}

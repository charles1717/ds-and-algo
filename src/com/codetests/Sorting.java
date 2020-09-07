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

    public static void insertionSort(int[] arr){
        int temp;
        for(int i = 1, j; i < arr.length; i++){
            temp = arr[i];
            for(j = i - 1; j >= 0 && temp < arr[j]; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arr, mid, arr.length);

        leftArray = mergeSort(leftArray);
        rightArray = mergeSort(rightArray);

        return merge(leftArray, rightArray);
    }

    public static int[] merge(int[] a, int[] b){
        int i = 0, j = 0, counter = 0;
        int[] result = new int[a.length+b.length];

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                result[counter] = a[i];
                i++;
            }
            else {
                result[counter] = b[j];
                j++;
            }
            counter++;
        }
        while(i < a.length){
            result[counter] = a[i];
            i++;
            counter++;
        }
        while(j < b.length){
            result[counter] = b[j];
            j++;
            counter++;
        }

        return result;
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot-1);
            quickSort(arr, pivot+1, right);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivotIndex = start - 1;
        int temp;
        int pivot = arr[0];

        for(int i = start; i < end; i++){
            if(pivot > arr[i]){
                pivotIndex++;

                temp = arr[pivotIndex];
                arr[pivotIndex] = arr[i];
                arr[i] = temp;
            }
        }
        arr[0] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

//        System.out.println(Arrays.toString(arr));
        return pivotIndex;
    }

    public static void main(String[] args) {
//        bubbleSort(new int[]{8,1,2,3,4,5,6,7});
//        selectionSort(new int[]{2,1,4,5,76,78,8,3,4,56,0,4,3,5,6,7});
//        insertionSort(new int[]{2,1,4,5,76,78,8,3,4,56,0,4,3,5,6,7});
//        int[] result = mergeSort(new int[]{2,1,4,5,76,78,8,3,4,56,0,4,3,5,6,7});
//        System.out.println(Arrays.toString(result));


        System.out.println(partition(new int[]{5,9,8,1,4,7,6,3}, 1, 8));

        quickSort(new int[]{2,1,4,5,76,78,8,3,4,56,0,4,3,5,6,7},0,16);
//        System.out.println(Arrays.toString(result));
    }
}

package com.codetests;

public class Searching {

    public static int binarySearch(int[] arr, int key){
        int result = -1;
        int left = 0, right = arr.length-1;
        int pivot = (left+right)/2;

        while(left <= right){
            if(arr[pivot] == key){
                result = pivot;
                return result;
            }
            else if(key < arr[pivot]){
                right = pivot - 1;
            }
            else if (key > arr[pivot]){
                left = pivot + 1;
            }
            pivot = (left+right)/2;
        }

        return result;
    }

    public static void main(String[] args){
        System.out.println(binarySearch(new int[]{1,2,5,6,8,10}, 5));
    }
}

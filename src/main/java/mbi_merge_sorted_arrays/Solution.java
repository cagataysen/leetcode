package mbi_merge_sorted_arrays;

//Write a method that will merge two given sorted arrays of integers into one sorted array.
// 1 5 7 8 9
// 2 4 6 10
// 1 2 4 5 6 7 8 9 10

import java.util.Arrays;

public class Solution {
    public static int[] mergeTwoSortedArraysOfIntegers(int[] array1, int[] array2){

        int size = array1.length + array2.length;
        int[] result = new int[size];

        int index = 0;
        int left = 0;
        int right = 0;
        int totalIteration = size;

        while(totalIteration >= 0){
            totalIteration--;
            if(right != array2.length && left != array1.length && array1[left] >= array2[right]){
                result[index] = array1[left];
                left++;
            }
            else
            {
                if(right != array2.length && left != array1.length){
                    result[index] = array1[right];
                    right++;
                }
            }
            index++;
        }

        return result;

        }

    private int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int arr2_index = 0;
        for (int arr1_index = 0; arr1_index < arr1.length; arr1_index++) {
            while(arr2_index < arr2.length && arr2[arr2_index] <= arr1[arr1_index]) {
                mergedArray[arr1_index + arr2_index] = arr2[arr2_index];
                arr2_index++;
            }
            mergedArray[arr1_index + arr2_index] = arr1[arr1_index];
        }
        // More human solution...
        // for (int i = arr2_index; i < arr2.length; i++) {
        //     mergedArray[arr1.length + i] = arr2[i];
        // }
        System.arraycopy(arr2, arr2_index, mergedArray, arr1.length + arr2_index, arr2.length - arr2_index);
        return mergedArray;
    }


    public static void main(String[] args) {
        int [] firstArr= {1, 5, 7, 8, 9};
        int [] secondArr= {2, 4, 6, 10};

        System.out.println(Arrays.toString(mergeTwoSortedArraysOfIntegers(firstArr, secondArr)));

    }

}

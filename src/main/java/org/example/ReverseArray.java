package org.example;


import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        for(int i : arr)
            System.out.println(i);

        reverseArray(arr);
        System.out.println("Reversed Array:");
        for(int i : arr)
            System.out.println(i);
    }


    public static void reverseArray(int[] arr)
    {
        int l =0,r=arr.length-1;

        while(l<r)
        {
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }

    }
}

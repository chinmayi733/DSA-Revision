package org.example;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 8;
        int result = binarySearchrecursive(arr, target,0,arr.length-1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    //O(N)
    public static int linearSearch(int[] arr , int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                    return i;
        }

        return -1;
    }


    //O(logN)
    public static int binarySearch(int[] arr , int target)
    {
        //iterative
        int l = 0;
        int r = arr.length-1;
        while(l<=r)
        {
            int mid = (l+r)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                l = mid+1;
            else
                r = mid-1;
        }

        return -1;
    }

    public static int binarySearchrecursive(int[] arr , int target, int l ,int r)
    {
        int mid = (l+r)/2;

        if(l>r)
            return -1; // base case for recursion

        if(arr[mid]==target)
            return mid;

        else if(arr[mid]<target)
            return binarySearchrecursive(arr,target,mid+1,r);
        else
            return binarySearchrecursive(arr,target,l,mid-1);
    }

}

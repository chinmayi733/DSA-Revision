package org.example;

public class ArrayRev {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int index=1;

        //removing
        for(int i=index+1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=-1; // Assuming we want to set the last element to 0 after shifting

        for(int i: arr)
        {
            System.out.print(i + " ");
        }

        for(int i=arr.length-1;i>=index;i--)
        {
            arr[i]=arr[i-1];
        }

        arr[index]=2;
        System.out.println();
        for(int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}

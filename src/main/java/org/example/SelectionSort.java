package org.example;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);
        //Sort(arr);
        System.out.println("Sorted array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    //swap
                    int t = arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int t = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
}


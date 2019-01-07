package com.wdssdream.arithmetic.sort;

/**
 * 排序排序Java实现
 */
public class QuickSort {

    /**
     * 打印数组信息
     *
     * @param arr
     */
    public static void printArr(int[] arr) {
        for (int item : arr) {
            System.out.println(item);
        }
    }

    /**
     * 排序过程
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int partition(int[] arr, int left, int right) {
        int temp = arr[left];
        while (left < right) {
            while (temp <= arr[right] && left < right) {
                --right;
            }
            if (left < right) {
                arr[left] = arr[right];
                ++left;
            }
            while (temp > arr[left] && left < right) {
                ++left;
            }
            if (left < right) {
                arr[right] = arr[left];
                --right;
            }
        }
        arr[left] = temp;
        return left;
    }

    /**
     * 排序方法
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null || left >= right || arr.length <= 1) {
            return;
        }

        int mid = partition(arr, left, right);
        quickSort(arr, left, mid);
        quickSort(arr, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {61, 18, 53, 4, 90, 1, 99, 52, 14, 32, 26, 45};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}


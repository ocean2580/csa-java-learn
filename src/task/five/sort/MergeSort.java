package task.five.sort;

import java.util.Arrays;

/*
    归并排序，分而治之的思想
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,4,5,7,1,3,6,2};
        int[] temp = new int[8];
        mergeSort(arr,0,arr.length - 1,temp);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if(left < right){
            int mid = (left + right) / 2;
            //向左递归
            mergeSort(arr,left,mid,temp);
            //向右递归
            mergeSort(arr,mid + 1,right,temp);
            //合并
            merge(arr,left,right,mid,temp);
        }
    }

    /**
     *两个有序序列的合并为一个新的有序序列
     * @param arr 原始数组经过分后的数组
     * @param left 数组有序序列的初始索引
     * @param right 数组有序序列的右边的索引
     * @param mid 数组有序序列的中间索引
     * @param temp 临时数组,用作中转
     */
    public static void merge(int[] arr,int left,int right,int mid,int[] temp){
        //左边有序徐列的初始索引
        int i = left;
        //右边有序序列的初始索引
        int j = mid + 1;
        //指向temp数组的当前索引
        int t = 0;

        //1、先把左右两边有序序列的数据按照规则填到temp数组中，直到其中一个序列填充满为止
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){//把小的先放在临时数组中去
                temp[t] = arr[i];
                i++;
                t++;
            }else {
                temp[t] = arr[j];
                j++;
                t++;
            }
        }
        //2、把没有填充完的序列季旭填充
        while (i <= mid){
            temp[t] = arr[i];
            i++;
            t++;
        }
        while (j <= right){
            temp[t] = arr[j];
            j++;
            t++;
        }

        //3、把临时数组中的填充好的有序序列再次拷贝到原始的数组中去
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right){
            arr[tempLeft] = temp[t];
            tempLeft ++;
            t++;
        }
    }
}

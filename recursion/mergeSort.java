package recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        merge(nums, 0, 4);
        System.out.println(Arrays.toString(nums));
    }


    static void merge(int[] arr, int s, int e){
        if(s == e) return;

        int mid = (s + e) / 2;
        merge(arr, s, mid);
        merge(arr, mid + 1, e);
        combine(arr, s, e);

    }

    static void combine(int[] arr, int s, int e){
        int mid = (s + e) / 2;
        int[] store = new int[(e-s) + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= e){
            if(arr[i] > arr[j])
                store[k] = arr[j++];
            else
                store[k] = arr[i++];
            k++;
        }

        while(i <= mid)
            store[k++] = arr[i++];

        while(j <= e)
            store[k++] = arr[j++];
        
        for (int p = s,m = 0; p <= e; p++, m++)
            arr[p] = store[m];
        
    }
}

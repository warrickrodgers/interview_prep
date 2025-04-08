package algorithms.mergeSort;

import java.util.ArrayList;

public class RecursiveMergeSort {

    /**
     *
     * @param arr
     * @param low
     * @param high
     */
    public void mergeSort(ArrayList<Integer> arr, int low, int high) {

        if(low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    /**
     *
     * @param arr
     * @param low
     * @param mid
     * @param high
     */
    public void merge(ArrayList<Integer> arr, int low, int mid, int high) {
        //size of the arrays
        int left_arr_size = mid - low + 1;
        int right_arr_size = high - mid;

        //temp arrays
        ArrayList<Integer> left = new ArrayList<>(left_arr_size);
        ArrayList<Integer> right = new ArrayList<>(right_arr_size);

        //copy data to arrays
        for(int i = 0; i < left_arr_size; i++) {
            left.add(arr.get(low + i));
        }
        for(int j = 0; j < right_arr_size; j++) {
            right.add(arr.get(mid + 1 + j));
        }

        //Merge the temp arrays
        int i = 0, j = 0;

        //initial index of merged subarray
        int sub_index_k = low;
        while(i < left_arr_size && j < right_arr_size) {
            if(left.get(i) <= right.get(j)) {
                arr.set(sub_index_k, left.get(i));
                i++;
            } else {
                arr.set(sub_index_k, right.get(j));
                j++;
            }
            sub_index_k++;
        }

        //put remaining elements of left into arr
        while(i < left_arr_size) {
            arr.set(sub_index_k, left.get(i));
            i++;
            sub_index_k++;
        }

        //put remaining elements of right into arr
        while(j < right_arr_size) {
            arr.set(sub_index_k, right.get(j));
            j++;
            sub_index_k++;
        }
    }
}

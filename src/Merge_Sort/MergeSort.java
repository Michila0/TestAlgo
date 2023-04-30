package Merge_Sort;

public class MergeSort {
    static void rangeSort(int[] values, int first, int last){ //helper function that creates the sub cases for sorting
        if (first < last){//sort only if the left index is lesser than the right index (meaning that sorting is done)
            int mid = (first+last) /2;
            rangeSort(values, first,mid);//left subarray
            rangeSort(values, mid+1, last);//right subarray
            merge(values,first, mid, last);
        }
    }

    private static void merge(int []values,int first, int mid, int last){
        int n1 = mid - first+1;//"first+1"//Size of left suba-array
        int n2 = last - mid;//Size of right sub-array
        int[] L = new int[n1];//Creating the left and right sub-array
        int[] R = new int[n2];
        int i, j, k = 0;
        for (i=0; i<n1; ++i) {//Copy element into left sub-array
            L[i] = values[first+i];
        }
        for (j = 0; j <n2 ; j++) {//Copy element into right sub-array
            R[j] = values[mid+1+j];
        }
        while (i<n1 && j<n2){ //merge the left and right sub-arrays
            if (L[i] <= R[j]){
                values[k] = L[i];
                i = i +1;
            }else {
                values[k] = R[j];
                j = j+1;
            }
            k = k+1;
        }
        while (i<n1){ //merge the remaining elements from the left sub-array
            values[k] = L[i];
            i = i+1;
            k = k+1;
        }
        while (j<n2){//merge the remaining elements from the right sub-array
            values[k] = R[j];
            j = j+1;
            k = k+1;
        }


    }

    void display(int values[])                 //display the array
    {
        for (int i=0; i<values.length; ++i)
        {
            System.out.print(values[i]+" ");
        }
    }
}

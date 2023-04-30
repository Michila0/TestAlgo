package Merge_Sort;

public class Main {
    public static void main(String[] args) {
        int[] values = {9, 3, 1, 5, 13, 12};
        MergeSort merge = new MergeSort();
        merge.rangeSort(values, 0, values.length-1);
        merge.display(values);
    }
}

package Linear_Search;

public class LinearSearch {
    public static int linearSearch(int[] arr, int data){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7,8,15,10};
        int data = 18;
        System.out.println(data+" is found at index: "+linearSearch(arr,data));
    }
}

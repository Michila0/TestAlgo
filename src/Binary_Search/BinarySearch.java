//package Binary_Search;
//
//public class BinarySearch {
//    public  static  void binarySearch(int[] arr, int first, int last,int key){
//        int mid = (first+last)/2;
//        while (first <= last){
//            if (arr[mid] <= key){
//                first = mid+1;
//            } else if (arr[mid] == key) {
//                System.out.println("Element is found at index: "+mid);
//                break;
//            }else {
//                last = mid -1;
//            }
//            mid = (first+last)/2;
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr= {2,5,8,12,16,23,38,56,72,91};//Binary Search array has sorted array
//        int key = 56;
//        binarySearch(arr,0, arr.length-1,key );
//    }
//}
//
package Binary_Search;
class BinarySearch{
    public static void binarySearch(int arr[], int first, int last, int key){
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
    public static void main(String args[]){
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last=arr.length-1;
        binarySearch(arr,0,last,key);
    }
}
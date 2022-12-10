public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {-18, -12, 0, 2, 4, 9, 10, 16, 19, 20};
        int target = 9;
        System.out.println(binary_search(arr,target));
        System.out.println(orderAgnosticBS(arr,target));
    }

    // returning the index
    public static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;     // there might be a possibility that  (start + end) might
                                                     // exceed the range of integer, therefore use s+(e-s)/2
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return -1;                     // -1 indicates that element does not exists

    }

    // order agnostic binary search (array is sorted by we don't know whether it is sorted in ascending or descending order )
   public static int orderAgnosticBS(int[] arr, int target) {

       int start = 0;
       int end = arr.length - 1;

       boolean isAsc = arr[start] < arr[end];

       while(start <= end){
           int mid = start + (end - start) / 2;

           if(target == arr[mid]){
               return mid;
           }

           if(isAsc){
               if(target < arr[mid]){
                   end = mid - 1;
               }
               else  {
                   start = mid + 1;
               }
           }

           else {
               if(target > arr[mid]){
                   end = mid - 1;
               }
               else  {
                   start = mid + 1;
               }
           }
       }
       return -1;
   }


}

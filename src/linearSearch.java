import java.util.Arrays;

public class linearSearch {

    public static void main(String[] args) {

        int[] num = {23, 45, 19, 6, 5, 9, 12};
        int target = 5;
        int ans = linear_Search(num, target);
        System.out.println(ans);

        String str = "farhan";
        char cTarget = 'h';
        System.out.println(stringSearch(str,cTarget));


        int[] num1 = {23, 45, 19, 6, 5, 9, 12};
        int target1 = 5;
        int start = 1;
        int end = 3;
        int ans1 = rangeSearch(num1, target1,1,3);
        System.out.println(ans);

        int[][] array = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 56},
        };
        int target2 = 34;
        int[] answer = search2D(array,target2);
        System.out.println(Arrays.toString(answer));
    }

    public static int linear_Search(int[] arr, int key){
        if(arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == key)
                return i;
        }

        return -1;
    }

    //  To search target element in a String
    public static boolean stringSearch(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }


    // Searches element in a given range
    public static int rangeSearch(int[] arr, int key, int start, int end){
        if(arr.length == 0)
            return -1;

        for (int i = start; i <= end ; i++) {
            if(arr[i] == key)
                return i;
        }

        return -1;
    }

    // linear search in 2d array
    public static int[] search2D(int[][] array, int target2){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                 if(array[i][j] == target2){
                      return new int[]{i,j};
                 }
            }
        }
        return new int[]{-1,-1};
    }

}

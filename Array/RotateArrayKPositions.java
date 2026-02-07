import java.util.Arrays;

public class RotateArrayKPositions {

    //Time complexity of this code is O(N^2)
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        roateArray(arr, k);
    }

    public static void roateArray(int[] arr, int k){
        for (int i = 0; i < k; i++) {
            int lastKey = arr[arr.length -1];
            for (int j = arr.length-1; j > 0; j--) {
                arr[j] = arr[j-1];
            }   
            arr[0] = lastKey;
        }
        System.out.println(Arrays.toString(arr));
    }
}

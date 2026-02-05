public class FindingSecondLargestNumber {

    //time complexity of this code is O(N) and Space Complexity of this Code is O(N)

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int large = arr[0];
        int secondLarge = arr[0];
        if (arr.length < 2) {
            System.out.println("we can't find the second larget number");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            }else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        System.out.println(secondLarge);
    }
}
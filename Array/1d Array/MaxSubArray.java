public class MaxSubArray {
    public static void Max(int arr[]){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int curr = 0;  // new subarray ke liye reset
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                    curr += arr[k];  // subarray sum nikal rahe

                }
                if (curr > max) {
                    max = curr;   // max update
                }
                System.out.print("sum ="+curr+" ");
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum Subarray Sum: " + max);
    }

    public static void main(String args[]){
        int arr[] = {3, 4, 6, 8, 9};
        Max(arr);
    }
}

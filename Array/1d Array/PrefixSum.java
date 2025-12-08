public class PrefixSum {
    public static void Sum(int arr[]) {
        int n = arr.length;
        int prefix[] = new int[n];
        
        // Step 1: prefix array banate hain
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int max = Integer.MIN_VALUE;

        // Step 2: all subarrays check karte hain
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray sum from i to j
                int curr;
                if (i == 0) {
                    curr = prefix[j];
                } else {
                    curr = prefix[j] - prefix[i - 1];
                }

                if (curr > max) {
                    max = curr;
                }
            }
        }
        System.out.println("Maximum Subarray Sum = " + max);
    }

    public static void main(String args[]) {
        int arr[] = {5, 6, 7, 8, 9, 3};
        Sum(arr);
    }
}

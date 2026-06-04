import java.util.*;

public class nextGreater {
   
public static void main(String args[]){
    int arr[]={6,8,0,1,3};
    Stack<Integer> s =new Stack<>();
    int n=arr.length-1;
            int nextGreater[]=new int[arr.length];
        for(int i=n;i>=0;i--){
            while(!s.isEmpty()&&arr[i]>=s.peek()){
            s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }
            else{
                nextGreater[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for(int i=0;i<nextGreater.length;i++){
    System.out.print(nextGreater[i]+" ");
        }



}
}





/* brute force approach*/
//     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int[] ans = new int[n];

//         for (int i = 0; i < n; i++) {
//             ans[i] = -1;

//             for (int j = 0; j < nums2.length; j++) {
//                 if (nums1[i] == nums2[j]) {

//                     for (int k = j + 1; k < nums2.length; k++) {
//                         if (nums2[k] > nums2[j]) {
//                             ans[i] = nums2[k];
//                             break;
//                         }
//                     }

//                     break;
//                 }
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {

//         int[] nums1 = {4, 1, 2};
//         int[] nums2 = {1, 3, 4, 2};

//         int[] result = nextGreaterElement(nums1, nums2);

//         System.out.println(Arrays.toString(result));
//     }
// }
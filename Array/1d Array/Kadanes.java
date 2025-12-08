import java.util.*;
public class Kadanes {
    public static void MaxSum(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            curr=curr+arr[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(curr, max);
        }
        System.out.println("maximum sum of sub array is :"+max);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elemnets of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
        MaxSum(arr);   
     }
    
}

import java.util.*;
public class Binary {
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=(arr.length-1);
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid] < key){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]={10,20,30,40,50,60};
    System.out.print("Enter which element you want to find:");
    int key=sc.nextInt();
    System.out.println("element fpund at index at"+binarySearch(arr, key));
    sc.close();

   }
}

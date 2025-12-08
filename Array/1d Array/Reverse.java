public class Reverse {
    public static void reverse(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
        first++;
        last--;
       
        }
     
        
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        System.out.println("Array before reversing:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array after reversing:");
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
       
    

    }
}

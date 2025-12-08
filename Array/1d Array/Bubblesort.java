public class Bubblesort {
    public static void Sort(int arr[]){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap (passing the value to next index)
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                   
                }
            

            }
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={7,9,3,6,20,45};
        Sort(arr);
       
        
    }
    
}

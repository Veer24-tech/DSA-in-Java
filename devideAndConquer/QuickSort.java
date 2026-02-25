public class QuickSort{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void quickSort(int arr[],int si ,int ei){
    //base case
        if(si>=ei){
            return;
        }
        //partation
        int pidx=partation(arr ,si ,ei);
        quickSort(arr, si,pidx-1);
        quickSort(arr,pidx+1,ei);

    }


    public static int partation(int arr[],int si,int ei){
        int pivot=arr[ei];//last element as pivot
        int i=si-1;//to find the correct index of pivot element
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //swap pivot element to correct index
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;//returning the correct index of pivot element

    }
    public static void main(String args[]){
        int arr[]={10,7,9,3,2,5,-8,0};
        quickSort(arr,0,arr.length-1);
        printArr(arr);

    }
}
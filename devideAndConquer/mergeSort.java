public class mergeSort{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void mergeS(int arr[],int si,int ei){
if(si>=ei){
    return;
}
int mid=si+(ei-si)/2;
mergeS(arr,si,mid);//left part sort hoga 
mergeS(arr,mid+1,ei);//right part sort hoga
merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        //merge karana hai to temperary arry banana padega vo bhi same size ka ;
        int temp[]=new int[ei-si+1];
        int i=si;//left part ka iteretor
        int j=mid+1;//right part ka iteretor
        int k=0;//temep array ka iteretor
        while(i<=mid&& j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            } else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
           
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy to origional array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }    
    public static void main(String args[]){
        int arr[]={5,1,1,2,0,0};
        mergeS(arr,0,arr.length-1);
        printArr(arr);
}
}
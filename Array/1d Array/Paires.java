public class Paires {

    public static void paires(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
            
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        paires(arr);
        //printing paires---
        // for(int i=0;i<arr.length;i++){
        //     System.out.println();
        }
        

            }
    


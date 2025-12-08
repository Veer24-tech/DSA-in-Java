import java.util.*;
public class LinearSsearch{

    

    public static int Search( int marks[],int key){
    for(int i = 0; i < marks.length; i++){
        if (marks[i]==key){
            return i;
        }
    }
        
            return -1;
        

    }

     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of your Array :");
        int a=sc.nextInt();
                int marks[]=new int[a];
                for(int i=0;i<a;i++){
                 System.out.print("Enter "+(i+1)+"element of array:");
                    marks[i]=sc.nextInt();

                }
                for(int j=0;j<a;j++){
                    System.out.print(marks[j]+" ");
                }
                System.out.print("Enter which elemnt you want to find/search:");
                int key=sc.nextInt();
                int result=Search(marks,key);
                if(result==-1){
                    System.out.print("Element Not Found");
                }
                else{
                    System.out.print("Element Found at index:"+result);
                }
    }
}
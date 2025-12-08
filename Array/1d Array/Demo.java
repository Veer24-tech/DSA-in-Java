import java.util.*;
public class Demo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of your array:");
        int a=sc.nextInt();
        int marks[]=new int[a];
        for(int i=0;i<a;i++){
        System.out.print("Enter "+(i+1)+" element of array:");
        marks[i]=sc.nextInt();
    }
    
    for (int j=0;j<a;j++){
        System.out.print("element at index "+j+" is:"+marks[j]);
    }
}
}
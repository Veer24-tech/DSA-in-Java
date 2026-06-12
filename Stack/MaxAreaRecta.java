import java.util.*;
public class MaxAreaRecta{
    public static void maxArea(int heights[]){
         Stack<Integer> s=new Stack<>();
       
        int n=heights.length;
       
        int nsl[]=new int[n];  //next smaller left
        int nsr[]=new int [n];// hr elemnt ke liye riht side me smaller element;  nest samller right


        //step 1--- calculte right smaller (next samller which is similer to next greater )
        for(int i=n-1;i>=0 ;i--){
          while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
            s.pop();

          }
          if(s.isEmpty()){
            nsr[i]=n;
          }

          else{
            nsr[i]=s.peek();
          }
          
            s.push(i); 
          }

            


            //  pahle stack ko kahli kro abhi uper ki valu se bhatra hoga 
            s=new Stack<>();

              //  step 2 find next samler at left side ---of exah element----
              for(int i=0;i<n ;i++){
                while(!s.isEmpty()&& heights[s.peek()]>=heights[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nsl[i]=-1;

                }
                else{
                    nsl[i]=s.peek();
                }
               s.push(i);

              }
              //step 3  calculate area and find max area ---

              int area=0;
              for(int j=0;j<n;j++){
                int width=(nsr[j]-nsl[j]-1);// j-i-1
                 int  currArea=(heights[j]*width);
                  area= Math.max(currArea,area);
              }
              System.out.println("Maximum rectangular area in hitogram is "+ area);
    }
    public static void  main(String args[]){
        int heights[]={2,4};
        maxArea(heights);
    }
}
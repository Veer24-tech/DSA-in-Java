public class Gridways{
    public static int gridWays(int n,int m,int i ,int j){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }

        int w1=gridWays(n,m,i+1,j);// haar baar down jane ke liye 
        int w2=gridWays(n,m,i,j+1);//har baarright jane ke liyr
        return w1+w2;
    }
    public static void main(String args[]){
        int n=4;
        int m=4;
        System.out.print("Total ways to reach destinatation is:"+gridWays(n,m,0,0));

    }
}
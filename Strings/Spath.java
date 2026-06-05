// given a route conatining 4 directions (E,W,N,S ) Find the shortest path to reach the destination :::\\
// code:- 
public class Spath{
    public static void Dist(String Path){
        float x=0;
        float y=0;
        for (int i=0; i< Path.length();i++){   //loop runs till the size of String length;
            char ch=Path.charAt(i);             // ch variable for storing words of String from starting to end//
        
        if(ch=='E'|| ch=='e'){
            x++;

        }
        else if(ch=='w'||ch=='w'){
            x--;
        }
        else if(ch=='N'|| ch=='n'){
            y++;
        }
        else if (ch=='S'|| ch=='s'){
            y--;
        }
        }
        float X2=x*x;                 
        float Y2=y*y;
        double dis=Math.sqrt(X2+Y2);   
    System.out.print("Shortest path is:"+dis);

    }
    public static void main(String args[]){
      
        String Path= "WNEENESENNN";
     Dist(Path);

    }
}

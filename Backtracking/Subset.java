public class Subset{
    public static void findSubset(String str, String ans,int i){
        //base case-
        if(i==str.length()){
            if(ans.length()==0){
            System.out.print("null");
            }
            else{
            
            System.out.print(ans+" ");
            }
            return;
        }

        //recursion-
        //step jab har word subset me aane ke liye yes choose kare-
        findSubset(str,ans+str.charAt(i),i+1);

        //word subset me aane ke liye no bole -
        findSubset(str,ans,i+1);

    }
    public static void main(String args[]){
        String str ="abc";
        findSubset(str,"",0);
    }
}
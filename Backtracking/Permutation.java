public class Permutation{
    public static void findPermutation(String str,String ans){

        //base case---> when str empty yiur permutationn is ready print it-
        if(str.length()==0){
            System.out.print(ans+" ");
            return;
        }
//recursion-
for(int i=0;i<str.length();i++){
    char currChar=str.charAt(i);
    String newStr=str.substring(0,i)+str.substring(i+1);
    findPermutation(newStr,ans+currChar);
}
    }
    public static void main(String args[]){
        String str="abc";
        findPermutation(str,"");
    }
}
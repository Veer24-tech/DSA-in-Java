public class Palindrome{
    public static boolean isPalindrome(String str){
        int n=str.length(); // length of String =7
        for(int i=0;i<str.length()/2;i++){      
            if(str.charAt(i)!=str.charAt(n-i-1)){   
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="RACECAR";
        System.out.println(isPalindrome(str));

    }
}

/// time complexity = linearcomplexity O(n)------>
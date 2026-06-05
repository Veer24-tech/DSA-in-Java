// ques---  for a given String convert each the first letter of each to UPPERCASE \\
// "hey i am a computer science student"//

public class UpperCase{
    public static String Uppercase(String str){
         StringBuilder sb=new StringBuilder(""); // empty stringbuilder for storing  the new values//
         char ch=Character.toUpperCase(str.charAt(0)) ; //making only  first alphabet  capita of first word//
         sb.append(ch); // storing first chacter at sb (empty string builder)
         for (int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1) {  ///  2nd word to last word  tak sapce check karega 
            // str.length()yaha last ke sapce tak aa jaat pr hame last word tak cahiaiye last ka sapce hame nahi chaiye 
           sb.append(' ');// sapce ko add kr do same jagah pr new stringbuilder pr
           i++; // space ho to agle word pr jao aur usko capital kro 
           sb.append(Character.toUpperCase(str.charAt(i)));// space ke baad wale alphabet ko capital kar diya
           //  aur new string builder pr add bhi kar diya 
        
            }
            else{
                sb.append(str.charAt(i));// bache hue alphabet ko as it is stringbuilder me add kr diya 
            }
            }
            return sb.toString();  // char ch ko string me convert kr diya   aur return karva diya 

         }

   
    public static void main(String args[]){
        String str="hey i am a computer science student";
        System.out.print(Uppercase(str));

       

    }
}
public class SubString{
    public static String SuvString(String str, int si ,int ei){   // si=starting index   ; ei=endimg index 
        String subst="";     /// balnk string for concatination
        for(int i=si;i<ei;i++){
            subst+=str.charAt(i); //concatination 
        }
        return subst;

    }
    public static void main(String args[]){
        String str="Cricket";
        int si=0, ei=4;
        System.out.print("Sub string is : "+SuvString(str,si,ei));


    }
} 
                      ///--- java's inbuilt method for creating substring ====\\\\   |
                     /// ---let ----                                                 |     
                                                                                       
                   ///     String name="veer";                                       |
                  ///      System.out.print(name.substring(0,2));

                 ///       output: ve
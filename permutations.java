import java.util.Scanner;
public class permutations {
    public static void permu(String str,String ans){
        //basecase
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
           String Newstr = str.substring(0,i) + str.substring(i+1);
            permu(Newstr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        permu(str,"");

    }
}

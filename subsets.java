import java.util.Scanner;
public class subsets {
    public static void sub(String str,String ans,int i){
        //basecase
        if(i == str.length()){
           if(ans.length() == 0){
               System.out.println("null");
           }else{
               System.out.println(ans);
           }
           return;
        }
        //yes choice
        sub(str,ans + str.charAt(i),i+ 1);
        //no choice
        sub(str,ans,i +1);

    }
    public static void main(String[] args) {
        String str = "abc";
        sub(str,"",0);
    }
}

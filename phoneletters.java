import java.util.Scanner;
public class phoneletters {
    public static char letters[][] = {{},{},{'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'}
            ,{'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
    };
    public static void letterComb(String D){
        int len = D.length();
        if(len == 0){
            System.out.println(" ");
            return;
        }
        bfs(0,len,new StringBuilder(), D);
    }
    public static void bfs(int pos,int len,StringBuilder sb,String D){
        if(pos == len){
            System.out.println(sb.toString());
        }
        else{
            char[] phone = letters[Character.getNumericValue(D.charAt(pos))];
            for(int  i= 0;i<phone.length;i++)
                bfs(pos+ 1,len,new StringBuilder(sb).append(phone[i]),D);
        }
    }

    public static void main(String[] args) {
        letterComb("0");
    }
}

import java.util.Scanner;
public class gridways {
    public static int grid(int i,int j,int n,int m){
        if(i == n- 1&& j == m - 1){ //condition for last cell
            return 1;
        } else if (i == n || j == m) { //boundary cross condition
            return 0;
        }
        int way1 = grid(i+1,j,n,m);
        int way2 = grid(i,j+1,n,m);
        int total = way1 + way2;
        return total;
    }
    public static void main(String[] args) {
        int n = 6;
        int m = 4;
        System.out.println(grid(0,0,n,m));
    }
}

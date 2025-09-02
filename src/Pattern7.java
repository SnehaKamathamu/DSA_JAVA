// Pattern:
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row = 0 ; row < n ; row++){
            for(int col = 1 ; col <= n-row ; col++){
                System.out.print("* ");
            }
            for(int space = 0 ; space < n ; space++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

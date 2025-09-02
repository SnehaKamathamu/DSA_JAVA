// Pattern 4 :
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for( int row = 1 ; row <= n ; row++){
            for(int col = 1 ; col <= row ; col++){
                System.out.print(col + " ");
            }
            for(int space = 0 ; space < n ; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

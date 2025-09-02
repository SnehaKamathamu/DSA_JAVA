// Pattern 6 :
//        *
//      * *
//    * * *
//  * * * *
public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for( int row = 0 ; row < n ; row++){
            for(int col = 1 ; col <= n ; col++) {
                if (col > n - row) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

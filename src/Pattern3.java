// Pattern
//& & & & &
//& & & &
//& & &
//& &
//&

//sneha solution
//public class Pattern3 {
//    public static void main(String[] args) {
//        pattern(5);
//    }
//    static void pattern(int n){
//        for(int row = 0 ; row < n ; row++){
//            for(int col = n - row; col>=1 ; col--){
//                System.out.print("& ");
//            }
//            System.out.println();
//        }
//    }
//}

// rishabh solution
public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for(int row = n ; row > 0 ; row--){
            for(int col = 1; col<=row; col++){
                System.out.print("& ");
            }
            System.out.println();
        }
    }
}

//  Pattern 5:
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
public class Pattern5 {
    public static void main(String[] args) {
        pattern(9);
    }
    public static void pattern(int n){
//                n/2 = 4
//                4 forst logic
//                4+1 complete straight
//                4 second logic
        int num = n/2;
        for(int row = 1 ; row <= num ; row++){
            for(int col  = 1 ; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1 ; i<= (n/2)+1; i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int r = 0 ; r <= num ; r++){
            for(int c = num - r ; c > 0 ; c--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

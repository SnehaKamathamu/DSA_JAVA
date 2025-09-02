// Pattern 2 :
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
public class Pattern6 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= n; col++) {
                if (col > n - row) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

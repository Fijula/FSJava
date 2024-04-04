package JavaAssingment2;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 4;
        upperHalf(n);
        lowerHalf(n);
    }

    public static void upperHalf(int n) {
        // Loop for the upper rows
        for (int i = 1; i <= n; i++) {
            // Left part
            for (int j = 1; j <= n; j++) {
                int minimumNum = checkMinimum(i, j);
                System.out.print(n - minimumNum + 1 + " ");
            }
            // Right part
            for (int j = n - 1; j >= 1; j--) {
                int minimumNum = checkMinimum(i, j);
                System.out.print(n - minimumNum + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void lowerHalf(int n) {
        // Loop for second half - lower rows
        for (int i = n - 1; i >= 1; i--) {
            // Left part
            for (int j = 1; j <= n; j++) {
                int minimumNum = checkMinimum(i, j);
                System.out.print(n - minimumNum + 1 + " ");
            }
            // Right part
            for (int j = n - 1; j >= 1; j--) {
                int minimumNum = checkMinimum(i, j);
                System.out.print(n - minimumNum + 1 + " ");
            }
            System.out.println();
        }
    }

    // Method to calculate minimum number
    public static int checkMinimum(int i, int j) {
        return i < j ? i : j;
    }
}

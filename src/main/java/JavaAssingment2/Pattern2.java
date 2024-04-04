//Half Diamond Pattern
package JavaAssingment2;

public class Pattern2 {
    public static void main(String[] args) {
        int num=5;
        halfDiamondPattern(num);
    }
    public static void halfDiamondPattern(int n){
        for(int i=1;i<= n*2 -1;i++)
        {
            if(i<n){
                for(int j=1;j<=i;j++)
                    System.out.print("*");
                System.out.println();
            }
            else {
                for(int j=2*n-i;j>=1;j--)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}

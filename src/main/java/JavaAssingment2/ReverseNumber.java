package JavaAssingment2;

public class ReverseNumber {
    public static void main(String[] args) {
        int originalNumber = 12345;
        int reverseNumber = reverseNumber(originalNumber);
        System.out.println("Original Number : "+originalNumber);
        System.out.println("Reverse Number : "+reverseNumber);
    }
    public static int reverseNumber(int num)
    {
        int reverseNum  = 0;
        int remainder;
        while(num !=0)
        {
            remainder =num %10;
            reverseNum = reverseNum *10 +remainder;
            num=num/10;
        }
        return reverseNum;
    }
}
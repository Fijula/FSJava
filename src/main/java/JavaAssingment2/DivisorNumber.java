package JavaAssingment2;

public class DivisorNumber {
    public static void main(String[] args) {
        int originalNumber = 36;
        divisorNumber(originalNumber);

    }
    public static void divisorNumber(int num)
    {
        System.out.println("Divisor of Number "+num+ " : ");

        for(int i=1;i<=num;i++)
        {
            if(num % i==0)
                System.out.print(i+" ");
        }
    }
    }

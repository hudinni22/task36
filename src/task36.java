import java.util.Scanner;

public class task36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Prove me with a number: ");
        int GivenNumber = in.nextInt();

        System.out.println(LargestPrime(GivenNumber));

    }

    public static int LargestPrime(int number)
    {
        int maxPrime = -1;
        if (number <= 1)
        {
            return maxPrime;
        }

        for(maxPrime = 2; maxPrime <= number; maxPrime++)
        {
            if (number % maxPrime == 0) {
                number /=maxPrime;
                maxPrime--;
            }
        }
        return maxPrime;

    }
}

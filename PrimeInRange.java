import java.util.Scanner;

public class PrimeInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        if (range >= 2)
            System.out.print(2 + " ");

        boolean prime;
        for (int i = 3; i <= range; i += 2) {
            prime = true;
            for (int j = 3; j * 2 < i; j++)
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            if (prime)
                System.out.print(i + " ");
        }
    }
}

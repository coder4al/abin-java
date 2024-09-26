import java.util.Scanner;

public class StrongNumber {

    private static int factorial(int x) {
        if (x <= 1)
            return 1;
        else
            return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0, tmp = n;

        do {
            sum += factorial(n % 10);
        } while ((n /= 10) > 0);

        if (sum == tmp)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

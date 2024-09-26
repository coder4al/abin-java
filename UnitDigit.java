import java.util.Scanner;

public class UnitDigit {

    private static int sum(int n) {
        int sum = 0;

        do {
            sum += n % 10;
        } while ((n /= 10) > 0);

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n / 10 != 0)
            n = sum(n);

        System.out.println(n);
    }
}

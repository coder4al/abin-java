import java.util.Scanner;

public class TrapeziumPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = 1, max = n * n + n, rev;

        for (int i = 0; i < n; i++) {
            rev = max - (n - i - 1);
            for (int j = 0; j < i * 2; j++)
                System.out.print("-");

            for (int j = i * 2; j < n + n; j++) {
                if (j < n + i) {
                    System.out.print(min++);
                } else {
                    System.out.print(rev++);
                    max--;
                }
                if (j < n + n - 1)
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Collatz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        while (n > 1) {
            System.out.println(n);
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
            count++;
        }

        System.out.println(n);
        System.out.println(count);

    }
}
import java.util.Scanner;

public class BessyPosition {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int i = 1, j = n;

                while (i < j) {
                    i += k;
                    j -= k;
                }

                if (i - j > k) {
                    System.out.println(j + k);
                } else
                    System.out.println(i);
            }
        }

    }
}

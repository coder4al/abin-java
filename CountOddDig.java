import java.util.Scanner;

public class CountOddDig {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0, digit, tmp;

        for (int i = 1; i <= n; i++) {
            digit = 0;
            tmp = i;
            while (tmp != 0) {
                tmp /= 10;
            }
        }
    }
}

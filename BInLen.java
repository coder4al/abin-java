import java.util.Scanner;

public class BInLen {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        for (int n = 0; n < 9; n++) {
            int count = 1;
            int x = n;
            while (x > 1) {
                x /= 2;
                count++;
            }
            System.out.println(n + " : " + count);
        }
    }
}

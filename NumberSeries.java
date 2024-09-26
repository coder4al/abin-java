import java.util.Scanner;

public class NumberSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val = -2, cd = -2;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                cd += 4;
            }
            System.out.print((val += cd) + " ");
        }
    }
}

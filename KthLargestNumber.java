import java.util.Arrays;
import java.util.Scanner;

public class KthLargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sales = new int[n];

        while (--n >= 0)
            sales[n] = sc.nextInt();

        Arrays.sort(sales);

        System.out.println(sales[sales.length - k]);
    }
}

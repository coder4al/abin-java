import java.util.Scanner;

public class CostOfChain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum, min1 = 0, min2 = 1, cost = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                 if (arr[j] <= arr[min1] && j != min1) {
                    min2 = min1;
                    min1 = j;
                } else if (arr[j] <= arr[min2] && j != min1) {
                    min2 = j;
                }
            }

            sum = arr[min1] + arr[min2];
            cost += sum;
            arr[min1] = 1000;
            arr[min2] = sum;
        }

        System.out.println(cost);
    }
}

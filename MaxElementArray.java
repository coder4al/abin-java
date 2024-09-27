
import java.util.Scanner;

public class MaxElementArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int max = nums[0];
        int maxIndex = 0;

        for (int i = 0; i < n; i++)
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }

        System.out.println(max);
        System.out.println(maxIndex);

        sc.close();
    }
}

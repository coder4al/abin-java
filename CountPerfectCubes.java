import java.util.Arrays;
import java.util.Scanner;

public class CountPerfectCubes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int count = 0;

        while (--n >= 0)
            nums[n] = sc.nextInt();

        while (++n < nums.length)
            for (int i = 1; i * i * i <= nums[n]; i++)
                if (i * i * i == nums[n])
                    count++;

        System.out.println(count);

        sc.close();
    }
}

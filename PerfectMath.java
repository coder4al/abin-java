import java.util.Scanner;

public class PerfectMath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        int sum = 0;

        while (--n >= 0)
            nums[n] = sc.nextInt();

        while (++n < nums.length)
            sum += nums[n] % k;

        System.out.println(sum);
    }
}

import java.util.Arrays;
import java.util.Scanner;

// 2, 9, 16, 17, 26, 28, 35, 36, 45, 50, 54, 65, 72, 73, 82, 90, 91, 100, 107, 108, 135

public class GoodNumbers {

    private static boolean goodNum(long z) {
        for (int i = 1; Math.pow(i, 3) <= z; i++)
            for (int j = 1; j <= z; j++)
                if (Math.pow(i, 3) + Math.pow(j, 3) == z) {
                    System.out.println(z);
                    return true;
                }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] nums = Arrays.stream(sc.nextLine().trim().split(" ")).mapToLong(Long::parseLong).toArray();
        int count = 0;

        for (int i = 0; i < nums.length; i++)
            if (goodNum(nums[i]))
                count++;

        System.out.println("Number of good numbers : " + count);
    }
}

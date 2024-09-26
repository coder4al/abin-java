import java.util.Arrays;
import java.util.Scanner;

public class GoodNumbers {

    private static boolean goodNum(long z) {
        for (int i = 1; Math.pow(i, 3) <= z; i++)
            for (int j = i; j <= z; j++)
                if (Math.pow(i, 3) + Math.pow(j, 3) == z)
                    return true;

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

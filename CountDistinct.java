import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountDistinct {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> list = new HashSet();
        
        while (n-- > 0) {
            list.add(sc.nextInt());
        }
        
        /*   
        int[] nums = new int[n];
        while (--n >= 0)
            nums[n] = sc.nextInt();
        int count = 0;
        Arrays.sort(nums);
        int val = nums[++n];
        count++;
        while (++n < nums.length) {
            if (val != nums[n]) {
                count++;
                val = nums[n];
            }
        }
        */

        System.out.printf("There are %d distinct element in the array.", list.size());

        sc.close();
    }
}

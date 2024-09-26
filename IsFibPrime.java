import java.util.Scanner;

public class IsFibPrime {

    public static void main(String[] args) {
        int n = 50, prev = 1, curr = 2;

        while (curr <= n) {
            if (curr == 2 || curr == 3 || (curr * curr - 1) % 24 == 0)  // check prime
                System.out.print(curr + " ");
            curr = prev + (prev = curr);
        }
    }
}

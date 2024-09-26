import java.util.Scanner;

public class AmoebaMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        int prev = -1, current = 1;

        while (month-- > 0)
            current = prev + (prev = current);

        System.out.println(current);
    }
}

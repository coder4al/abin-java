import java.util.Scanner;

public class CardsForPyramid {
    
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        System.out.println((n * 3 * (n + 1) / 2) - n);
    }
}

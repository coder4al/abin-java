import java.util.Scanner;

public class BalloonBalloon {
    static int fibonacci(int x) {
        if (x <= 1) {
            return x;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score = 0;
        for (int i = 0; i < n; i++) {
            score += fibonacci(i);
        }
        System.out.println(score);
    }
}

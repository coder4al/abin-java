import java.util.Scanner;

public class TreasureFinding {

    private static int gcd(int n1, int n2, int n3) {
        int div = (n1 < n2 && n1 < n3) ? n1 : (n2 < n1 && n2 < n3) ? n2 : n3;

        do {
            if (n1 % div == 0 && n2 % div == 0 && n3 % div == 0)
                break;
        } while (--div > 1);

        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int sl = (n1 > n2 && n1 < n3 || n1 > n3 && n1 < n2) ? n1 : (n2 > n1 && n2 < n3 || n2 > n3 && n2 < n1) ? n2 : n3;
        System.out.println("The treasure is in the box which has the number " + sl);
        System.out.println("The code to open the box is " + gcd(n1, n2, n3));
    }
}

import java.util.Scanner;

public class SpecialBetweenRange {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            if (i == (i/10 + i%10) + ((i/10) * (i%10))) {
                System.out.println(i);
            }
        }
    }
}

import java.util.Scanner;

public class AverageOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();

        if (str.isEmpty())
            return;

        int sum = 0;

        for (int n : str.toCharArray())
            sum += n;

        System.out.printf("%.2f", (float) sum / str.length());

        sc.close();
    }
}

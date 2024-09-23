import java.util.Scanner;

public class SumSmallLarge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int len = str.length();
        int min = str.charAt(0), max = str.charAt(0);

        while (--len >= 0) {
            if (str.charAt(len) < min)
                min = str.charAt(len);
            if (str.charAt(len) > max)
                max = str.charAt(len);
        }

        System.out.println(min + max);
    }
}

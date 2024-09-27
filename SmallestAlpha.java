import java.util.Scanner;;

public class SmallestAlpha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();

        char min = 'a';
        boolean found = true;

        while (found && (min - 97) < 26) {
            found = false;
            for (int i = 0; i < str.length(); i++) {
                if (min == str.charAt(i)) {
                    min++;
                    found = true;
                    break;
                }
            }
        }

        System.out.println("Smallest Alpha Not Found : " + min);

        sc.close();
    }
}

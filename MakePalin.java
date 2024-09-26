import java.util.Scanner;

public class MakePalin {

    private static boolean palindrome(String str) {
        boolean res = true;
        for (int i = 0; i * 2 <= str.length(); i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                res = false;

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer str = new StringBuffer(sc.next());
        int i = 0, len = str.length();

        if (palindrome(str.toString()))
            return;

        while (!palindrome(str.substring(i, len) + str.charAt(i)) && i < len - 1)
            i++;

        System.out.println(i + " chars need, " + str.reverse().substring(len - i));
    }
}

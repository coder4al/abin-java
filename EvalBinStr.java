import java.util.Scanner;

public class EvalBinStr {

    public static int eval(int l, char o, int r) {
        switch (Character.toUpperCase(o)) {
            case 'A':
                return l & r;
            case 'B':
                return l | r;
            case 'C':
                return l ^ r;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        // int res = arr[0] - '0';

        for (int i = 1; i < arr.length; i += 2)
            arr[i + 1] = (char) eval(arr[i - 1] - '0', arr[i], arr[i + 1] - '0');

        System.out.println(arr[arr.length - 1]);
    }
}

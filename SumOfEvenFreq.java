import java.util.Scanner;

public class SumOfEvenFreq {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 0, sum = 0, index = 0;
        char c = str.charAt(index);
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i))
                count++;
            else {
                if (count % 2 == 0)
                    sum += count;
                c = str.charAt(index += count);
                count = 1;
            }
        }
        System.out.println(sum);
    }
}

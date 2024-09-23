import java.util.Scanner;

public class KaprekarNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int div = (int) Math.pow(10, Integer.toString(num).length());
        int sqr = num * num;

        if (num == (sqr / div + sqr % div))
            System.out.println("Kaprekar Number");
        else
            System.out.println("Not a Kaprekar Number");

        sc.close();
    }
}

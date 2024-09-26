import java.util.PriorityQueue;
import java.util.Scanner;

public class SortWithoutSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }
}
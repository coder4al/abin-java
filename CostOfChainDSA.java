import java.util.Arrays;
import java.util.PriorityQueue;

public class CostOfChainDSA {
    public static void main(String[] args) {
        int n = 5;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(2, 6, 11, 3, 5));
        int sum, cost = 0;

        while (n-- > 1) {
            pq.add(sum = (pq.poll() + pq.poll()));
            cost += sum;
        }
        System.out.println(cost);
    }
}
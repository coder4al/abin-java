import java.util.*;

public class ReverseK extends LinkedList<Integer> {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseK list = new ReverseK();
        int val;

        while (true) {
            val = sc.nextInt();
            if (val == -1)
                break;
            else
                list.add(val);
        }

        int k = sc.nextInt();
        int i = list.size() / k + (list.size() % k > 0 ? 1 : 0) + 1;

        while (--i > 0) {
            List<Integer> sub = new ArrayList<>();
            if (i == 1 && list.size() % k > 0) {
                sub.addAll(list.subList(0, list.size() % k).reversed());
                list.removeRange(0, list.size() % k);
            } else {
                sub.addAll(list.subList(0, k).reversed());
                list.removeRange(0, k);
            }
            list.addAll(sub);
        }

        System.out.println(list);
    }
}

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
        int i = list.size() / k + 1;

        while (--i > 0) {
            List<Integer> sub = new ArrayList<>(list.subList(0, k));
            list.removeRange(0, k);
            Collections.reverse(sub);
            list.addAll(sub);
        }

        if (list.size() % k > 0) {
            List<Integer> sub = new ArrayList<>(list.subList(0, list.size() % k));
            list.removeRange(0, list.size() % k);
            Collections.reverse(sub);
            list.addAll(sub);
        }

        System.out.println(list);
    }
}

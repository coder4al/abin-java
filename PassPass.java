import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PassPass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players : ");
        int k, index = 0, player_count = sc.nextInt();
        Map<Integer, String> player = new HashMap<>();
        List<Integer> player_id = new ArrayList<>();

        for (int i = 1; i <= player_count; i++) {
            System.out.print("Enter player " + i + " name : ");
            player.put(i, sc.next());
            player_id.add(i);
        }

        while (player_count-- > 1) {
            System.out.print("Enter stop count : ");
            k = sc.nextInt();
            index = (index - 1 + k) % player_id.size();
            System.out.println(player.get(player_id.get(index)) + " eliminated");
            player_id.remove(index);
        }

        System.out.println("Congratulations " + player.get(player_id.get(0)));
    }
}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PassPass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players : ");
        int player_count = sc.nextInt();
        Map<Integer,String> player = new HashMap<>();

        for (int i = 1; i <= player_count; i++) {
            System.out.print("Enter player " + i + " name : ");
            player.put(i, sc.next());
        }

        
    }
}
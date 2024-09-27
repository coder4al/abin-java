import java.util.Scanner;
import java.util.Arrays;;

public class PlayLists {
    // // O(n^2), 
    // private static int countList(int airTime, int[] songs, int n) {
    // int count = 0, exec = 0, val;
    // int[] tmp = new int[songs.length - 1];

    // for (int i = 0; i < songs.length-1; i++) {
    // exec++;
    // val = songs[i] + songs[i+1];
    // if (val < airTime) {
    // tmp[i] = val;
    // }
    // }

    // System.out.println(Arrays.toString(songs));
    // System.out.println(Arrays.toString(tmp));

    // int k;
    // for (int i = 0; i < tmp.length; i++)
    // for (int j = 0; j < songs.length; j++) {
    // exec++;
    // if (tmp[i] != 0 && j != i && j != i+1 && tmp[i] + songs[j] == airTime) {
    // count++;
    // System.out.printf("%d %d\n", tmp[i], songs[j]);
    // }
    // }

    // System.out.println("Iterations : " + exec);
    // return count;
    // }

    // O(n^3), O(1)
    private static int countList(int airTime, int[] songs, int n) {
        int count = 0, exec = 0;
        for (int i = 0; i < songs.length; i++)
            for (int j = i + 1; j < songs.length; j++)
                for (int k = j + 1; k < songs.length; k++) {
                    exec++;
                    if (songs[i] + songs[j] + songs[k] == airTime) {
                        count++;
                        System.out.printf("%d %d %d\n", songs[i], songs[j], songs[k]);
                    }
                }

        System.out.println("Iterations : " + exec);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] songs = { 7, 14, 21, 19, 17, 2, 29, 5 };

        System.out.println("Count : " + countList(40, songs, songs.length));
    }
}

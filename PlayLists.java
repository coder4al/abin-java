import java.util.Scanner;

public class PlayLists {

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

        System.out.println(exec);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] songs = { 7, 14, 21, 19, 17, 2, 29, 5 };

        System.out.println(countList(40, songs, songs.length));
    }
}

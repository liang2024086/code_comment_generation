package methodEmbedding.Standing_Ovation.S.LYD839;

import java.io.*;
import java.util.Scanner;

public class StandingOvation {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("A-small-attempt0.in");
        Scanner scanner = new Scanner(fileInputStream);
        int tests = scanner.nextInt();
        BufferedWriter writer = new BufferedWriter(new FileWriter("output1.txt"));
        for (int i = 1; i <= tests; i++) {
            int shyMax = scanner.nextInt();
            char[] audience = scanner.next().toCharArray();
            int friendsNumber = 0;
            int alreadyUp = 0;
            for (int j = 0; j <= shyMax; j++) {
                int nextUp = audience[j] - '0';
                if (j > alreadyUp) {
                    int newFriends = j - alreadyUp;
                    friendsNumber += newFriends;
                    alreadyUp += newFriends;
                }
                alreadyUp += nextUp;
            }
            writer.write(String.format("Case #%d: %d", i, friendsNumber));
            writer.newLine();
        }
        writer.flush();
        writer.close();
        fileInputStream.close();
        scanner.close();
    }
}

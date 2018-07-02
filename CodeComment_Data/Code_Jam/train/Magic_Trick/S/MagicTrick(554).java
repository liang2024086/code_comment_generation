package methodEmbedding.Magic_Trick.S.LYD220;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MagicTrick {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            int testCases = Integer.parseInt(br.readLine());
            for (int i = 1; i <= testCases; i++) {
                int firstAnswer = Integer.parseInt(br.readLine());
                Set<String> firstSet = new HashSet<>();
                for (int j = 1; j <= 4; j++) {
                    if (firstAnswer == j) {
                        String[] numbers = br.readLine().split(" ");
                        firstSet.addAll(Arrays.asList(numbers));
                    } else {
                        br.readLine();
                    }
                }
                int secondAnswer = Integer.parseInt(br.readLine());
                Set<String> secondSet = new HashSet<>();
                for (int j = 1; j <= 4; j++) {
                    if (secondAnswer == j) {
                        String[] numbers = br.readLine().split(" ");
                        secondSet.addAll(Arrays.asList(numbers));
                    } else {
                        br.readLine();
                    }
                }
                
                int count = 0;
                String number = null;
                for (String s1 : firstSet) {
                    if (secondSet.contains(s1)) {
                        count++;
                        number = s1;
                        if (count > 1) {
                            System.out.println("Case #" + i + ": Bad magician!");
                            break;
                        }
                    }
                }
                if (count == 1) {
                    System.out.println("Case #" + i + ": " + number);
                } else if (count == 0) {
                    System.out.println("Case #" + i + ": Volunteer cheated!");
                }
            }
        }
    }
}

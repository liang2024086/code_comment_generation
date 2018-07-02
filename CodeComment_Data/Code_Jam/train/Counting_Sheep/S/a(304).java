package methodEmbedding.Counting_Sheep.S.LYD941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class a {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int caseCount = Integer.parseInt(br.readLine());
            for (int caseNum = 1; caseNum <= caseCount; caseNum++) {
                long lastNum = -1;
                int n = Integer.parseInt(br.readLine());
                ArrayList<Character> unseen = new ArrayList<Character>() {{
                    add('0');
                    add('1');
                    add('2');
                    add('3');
                    add('4');
                    add('5');
                    add('6');
                    add('7');
                    add('8');
                    add('9');
                }};
                for (int i = 1; i * n > 0; i++) {
                    long num = i * n;
                    char[] arr = String.valueOf(num).toCharArray();
                    for (char ch : arr) {
                        unseen.remove((Character) ch);
                        if (unseen.isEmpty()) {
                            break;
                        }
                    }
                    if (unseen.isEmpty()) {
                        lastNum = num;
                        break;
                    }
                }
                System.out.println("Case #" + caseNum + ": " + (lastNum != -1 ? lastNum : "INSOMNIA"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package methodEmbedding.Counting_Sheep.S.LYD457;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("text")));
        int testCount = Integer.parseInt(br.readLine());
        for (int i = 1; i <= testCount; i++) {
            Set<Long> a = new HashSet<Long>();
            Long input = Long.parseLong(br.readLine());
            Long num = input;
            boolean flag = true;
            String answer = "INSOMNIA";
            Long k=1L;
            while (num != 0L && flag) {
                num = k*input;
                k++;
                long temp = num;
                while(temp!=0) {
                    a.add(temp%10);
                    temp = temp/10;
                }
                if (a.size() == 10) {
                    answer = "" + num;
                    flag = false;
                } else {
                    continue;
                }

            }
            System.out.println("Case #"+i+": " + answer);
        }
    }
}

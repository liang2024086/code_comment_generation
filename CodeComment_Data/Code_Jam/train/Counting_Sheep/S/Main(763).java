package methodEmbedding.Counting_Sheep.S.LYD20;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] n = new int[t];
        List<String> list = new ArrayList<String>();
        int i = 0;
        while(t > 0) {
            n[i++] = in.nextInt();
            t--;
        }
        for(int num : n) {
            if(num == 0) {
                list.add("INSOMNIA");
                continue;
            }
            long current = num;
            int count = 0;
            boolean[] hasNum = new boolean[10];
            while(count != 10) {
                for(char c : String.valueOf(current).toCharArray()) {
                    if(!hasNum[c - '0']) {
                        hasNum[c - '0'] = true;
                        count++;
                    }
                }
                current += num;
            }
            list.add(String.valueOf(current - num));
        }

        for(int j = 0; j < list.size(); j++) {
            int x = j + 1;
            System.out.println("CASE #" + x + ": " + list.get(j));
        }
    }
}

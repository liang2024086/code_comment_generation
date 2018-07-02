package methodEmbedding.Counting_Sheep.S.LYD138;

import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int caseNumber = in.nextInt();
        
        for(int i = 1; i <= caseNumber; i++) {
            int N = in.nextInt();
            int num = N, j = 1;
            
            Set<Integer> set = new HashSet<Integer>();
            String output = "";
            while(true) {
                if(num == 0) { output = "INSOMNIA"; break; }
                
                while(num > 0) {
                    set.add(num % 10);
                    num /= 10;
                }
                
                if(set.size() == 10) { output = N * j + ""; break; }
                
                j++;
                num = N * j;
            }
            System.out.println("Case #" + i + ": " + output);
        }
    }
}

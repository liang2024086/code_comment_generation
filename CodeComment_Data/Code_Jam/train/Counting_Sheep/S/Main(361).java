package methodEmbedding.Counting_Sheep.S.LYD1335;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++) {
            int caseNo = i + 1;
            int n = Integer.parseInt(br.readLine());

            boolean insomnia = n == 0;
            BitSet bs = new BitSet(10);
            int j = 0;
            while(!insomnia && bs.cardinality() != 10) {
                j++;
                String s = Integer.toString(n * j);
                for(char c: s.toCharArray()) {
                    int v = Character.getNumericValue(c);
                    if (v != -1)
                        bs.set(v);
                }
            }

            System.out.print("Case #" + caseNo + ": ");
            if(insomnia)
                System.out.println("INSOMNIA");
            else
                System.out.println(String.valueOf(n * j));
        }
    }
}

package methodEmbedding.Revenge_of_the_Pancakes.S.LYD681;

import java.io.*;
import java.util.*;
public class A {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner input = new Scanner(new File("input.txt"));
        PrintWriter output = new PrintWriter("output.txt");
        int inputs = input.nextInt();
        input.nextLine();
        for (int i = 0; i < inputs; i++) {
            char[] ch = input.nextLine().toCharArray();
            /*ArrayList<Integer> in = new ArrayList<>();
            for(int j = 0; j < ch.length; j++) {
                if(ch[j] == '+') {
                    in.add(0);
                } else {
                    in.add(1);
                }
            }*/
            int switches = 0;
            for (int j = 0; j < ch.length - 1; j++) {
                if (ch[j] != ch[j + 1]) {
                    switches ++;
                }
            }
            switches += ch[ch.length - 1] == '+' ? 0 : 1;

            output.write(String.format("Case #%d: %d\n", i + 1, switches));
        }
        output.close();
    }
}

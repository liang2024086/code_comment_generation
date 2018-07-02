package methodEmbedding.Counting_Sheep.S.LYD122;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Beatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String line = null;

            Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            line = in.nextLine();
            int testCases = Integer.parseInt(line);
            for(int i = 0; i < testCases; i++) {
                Set<Character> intSet = new HashSet<Character>();
                line = in.nextLine();
                int n = Integer.parseInt(line);
                if(n == 0) {
                    System.out.println("Case #" + (i + 1) + ": INSOMNIA");
                } else {

                    boolean done = false;
                    for(Integer cur = n, k = 1; !done && k < 100; k++, cur = n * k ){
                        String curStr = cur.toString();
                        for(int j = 0; j < curStr.length(); j++) {
                            intSet.add(curStr.charAt(j));
                        }
                        if(intSet.size() == 10){
                            done = true;
                            System.out.println("Case #" + (i + 1) + ": " + curStr);
                        }
                    }
                }

            }






    }
}

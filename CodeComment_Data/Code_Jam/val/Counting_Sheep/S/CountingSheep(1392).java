package methodEmbedding.Counting_Sheep.S.LYD1589;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep{

    public static void main(String[] args) {
        Scanner sc = null;
        PrintWriter w = null;
        try {
             w = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("out-countingsheep.txt", false)));
           sc = new Scanner(new File("A-small-attempt1.in"));
//             sc = new Scanner("5\n" +
//                    "0\n" +
//                    "1\n" +
//                    "2\n" +
//                    "11\n" +
//                    "1692"
//             );

            int T = Integer.parseInt(sc.nextLine());

            for(int i = 0; i < T; i++){
                int N = Integer.parseInt(sc.nextLine());
                String result = "INSOMNIA";

                HashSet<Integer> s = new HashSet<>();
                for(int j = 0; j < 10; j++){
                    s.add(j);
                }

                if(N != 0){
                    int k = 1;
                    int Num = 0;
                    while(true){
                        Num = N * k;
                        String n = "" + Num;
                        for(int m = 0; m < n.length(); m++){
                            int thisInt = Character.getNumericValue(n.charAt(m));
                            if(s.contains(thisInt)) s.remove(thisInt);
                        }
                        if(s.isEmpty()) break;
                        k++;
                    }
                    result = "" + Num;
                }
                w.println("Case #" + (i + 1) + ": " + result);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            sc.close();
            w.close();
        }
    }

}

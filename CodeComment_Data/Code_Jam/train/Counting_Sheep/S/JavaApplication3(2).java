package methodEmbedding.Counting_Sheep.S.LYD433;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kienpc
 */
public class JavaApplication3 {

    private static final String CANT = "INSOMNIA";

    public static void main(String[] args) {
        String file = "input.txt";
        try {
            PrintWriter writer = new PrintWriter("ouput.txt", "UTF-8");
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                int lineCount = 0;
                int NNumber = 0;
                String CRR = "";
                while ((line = br.readLine()) != null) {
                    Set<String> zeroToNine = new HashSet<>();
                    for (int i = 0; i < 10; i++) {
                        zeroToNine.add("" + i);
                    }
                    int res = 0;
                    if (lineCount == 0) {
                    } else {
                        System.out.println("--------------------------------------------");
                        NNumber = Integer.parseInt(line);
                        System.out.println(NNumber);
                        int MAX = (int) Math.pow(10, line.length());
                        MAX += 10000;
                        System.out.println("MAX:" + MAX);
                        int i;
                        for (i = 1; i < MAX; i++) {
                            CRR = "" + NNumber * i;
                            for (int j = 0; j < CRR.length(); j++) {
                                zeroToNine.remove("" + CRR.charAt(j));
                            }
                            if (zeroToNine.isEmpty()) {
                                System.out.println("empty");
                                break;
                            }
                            for (String string : zeroToNine) {
                                System.out.print(string);
                                System.out.print("\t");
                            }
                            System.out.println();
                        }
                        if (!zeroToNine.isEmpty()) {
                            writer.println(String.format("CASE #%d: %s", lineCount, CANT));
                        } else {
                            writer.println(String.format("CASE #%d: %s", lineCount, CRR));
                        }
                    }
                    lineCount++;
                }
            }
            writer.flush();
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

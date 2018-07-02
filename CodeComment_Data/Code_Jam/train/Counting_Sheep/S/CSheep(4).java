package methodEmbedding.Counting_Sheep.S.LYD1652;


import java.io.*;
import java.util.HashSet;

/**
 * Created by asthiwanka on 9/4/16.
 */
public class CSheep {

    public static void main(String[] args) {


        BufferedReader br = null;
        File file = new File("/Users/asthiwanka/Desktop/out.txt");

        try {

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            br = new BufferedReader(new FileReader("/Users/asthiwanka/Desktop/test.txt"));
            int T = Integer.parseInt(br.readLine());

            for (int i = 1 ; i <= T ; i++) {
                int v = Integer.parseInt(br.readLine());

                HashSet<String> set = new HashSet<>();

                for (int x = 1 ; x < 1001 ; x++) {
                    String xV = String.valueOf(v*x);
                    for (int y = 0 ; y < xV.length() ; y++) {
                        set.add(xV.charAt(y) + "");
                    }
                    if (set.size() == 10) {
                        bw.write("Case #"+ i +": " + xV + "\n");
                        break;
                    }

                    if (x == 1000) {
                        bw.write("Case #"+ i +": " + "INSOMNIA\n");
                    }
                }
            }

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

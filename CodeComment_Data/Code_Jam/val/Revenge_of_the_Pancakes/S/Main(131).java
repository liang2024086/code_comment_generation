package methodEmbedding.Revenge_of_the_Pancakes.S.LYD913;


import javax.crypto.NoSuchPaddingException;
import java.io.*;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException {
        BufferedReader br = null;
        FileOutputStream fos = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("B-small-attempt0.in"));
            fos = new FileOutputStream(new File("output.txt"));
            bw = new BufferedWriter(new OutputStreamWriter(fos));
            int cases = Integer.valueOf(br.readLine());
            String line = null;
            int counter;
            for (int i = 1; i <= cases; i++) {
                line = br.readLine();
                counter = 0;
                char prev = ' ';
                for (char p: line.toCharArray()) {
                    if (p == prev) continue;
                    if (p == '-') {
                        counter +=1;
                        if (prev == '+') counter +=1;
                    }
                    prev = p;
                }
                bw.write(String.format("Case #%s: %s",i,counter));
                bw.newLine();
            }
            br.close();
            bw.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

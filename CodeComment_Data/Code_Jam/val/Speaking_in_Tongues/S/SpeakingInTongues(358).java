package methodEmbedding.Speaking_in_Tongues.S.LYD562;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

/**
 *
 * @author PARIMAL
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("E:\\A-small-attempt0.in");
        FileInputStream fis = null;
        BufferedReader reader = null;
        String[] ret = null;
        try {
            fis = new FileInputStream(f);
            reader = new BufferedReader(new InputStreamReader(fis));
            String line = reader.readLine();
            //ret=line.split(" ");

            int loopCount = Integer.parseInt(line);

            Hashtable<String, String> hash = new Hashtable<String, String>();

            char plainText[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            char cipherText[] = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z',
                't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};

            for (int i = 0; i < plainText.length; i++) {

                hash.put(String.valueOf(plainText[i]), String.valueOf(cipherText[i]));
            }

            int i;
            char temp;
            //System.out.println("loop"+loopCount);
            String out[] = new String[loopCount];

            for (i = 0; i < loopCount; i++) {
                //char c = cipherText[i];
                String t = reader.readLine();
                String o = " ";
                StringBuffer sB = new StringBuffer(100);
                sB.append("Case #" + (i + 1) + ": ");
                for (int j = 0; j < t.length(); j++) {
                    temp = t.charAt(j);
                    //System.out.println("temp"+temp);
                    if (!String.valueOf(temp).equalsIgnoreCase(" ")) {
                        o=sB.append(hash.get(String.valueOf(temp))).toString();
                    } else if (String.valueOf(temp).equalsIgnoreCase(" ")) {
                        o=sB.append(" ").toString();
                    }
                }
                out[i] = o;
            }


            FileOutputStream fileOutputStream = null;
            try {
                File fOut = new File("E:\\A-small-attempt0.out");
                fileOutputStream = new FileOutputStream(fOut);

                for (int j = 0; j < out.length; j++) {

                    out[j] += "\n";
                    byte[] b = out[j].getBytes();
                    fileOutputStream.write(b);
                }


                fileOutputStream.flush();
                fileOutputStream.close();

                fis.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

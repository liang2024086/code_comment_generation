package methodEmbedding.Standing_Ovation.S.LYD586;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fazal Kareem
 */
public class TestSmall {

    public static void main(String[] args) throws IOException {
        String file = "A-small-attempt0.in";
        File f = new File(file);
        File out = new File("outputFileSmall.txt");
        FileWriter fr = new FileWriter(out);
        BufferedWriter bw = new BufferedWriter(fr);

        file = f.getAbsolutePath();
        FileInputStream fstream;
        try {
            fstream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            int i = 0;
            try {
                while ((strLine = br.readLine()) != null) {
                    String tempString;

                    if (i > 0) {
                        String[] strArray = strLine.split(" ");
                        tempString = strArray[1];
                        int tempConfident = 0;
                        int tempConfidentMust = 0;

                        //System.out.println (strArray[1]);
                        for (int j = 0; j < strArray[1].length(); j++) {
                            String str = String.valueOf(tempString.charAt(j));
                            int indexValue = Integer.parseInt(str);
                            // System.out.println("index"+indexValue);
                            if (indexValue >= 1 && j == 0) {
                                tempConfident = tempConfident + indexValue;
                            } else if (j == 0) {
                                tempConfidentMust++;
                            } else if ((tempConfident + tempConfidentMust) >= j) {
                                if ((tempConfident + tempConfidentMust) == j && indexValue == 0) {
                                    tempConfidentMust++;
                                }

                                tempConfident += indexValue;
                            } else {
                                tempConfidentMust++;
                            }
                        }
                        bw.append("Case #" + i + ":" + tempConfidentMust);
                        bw.newLine();

                    }
                    i++;

                }

                br.close();
            } catch (IOException ex) {
                Logger.getLogger(TestSmall.class.getName()).log(Level.SEVERE, null, ex);
            }
            bw.flush();
            bw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestSmall.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1037;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Cookie {
    public static void main(String[] args){

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("/Users/dineshsg/Downloads/B-small-attempt1.in"));
            int T = Integer.parseInt(br.readLine());

            File file = new File("/Users/dineshsg/Downloads/output.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);

            int cnt = 1;
            while ((sCurrentLine = br.readLine()) != null) {
                    String[] splitInput = sCurrentLine.split(" ");

                    float C = Float.parseFloat(splitInput[0]);
                    float F = Float.parseFloat(splitInput[1]);
                    float X = Float.parseFloat(splitInput[2]);


                    float n = (X/C) - (2.0f/F) - 1;
                    if(n<=0){
                        bw.write("Case #" + (cnt++) + ": " + X/2 + "\n");
                        continue;
                    }

                    int N = (int)(Math.floor(n));
                    double ans = X/(2+(N+1)*F);

                    for(int i=0; i<=N; i++){
                        ans += C/(2+i*F);
                    }
                bw.write("Case #" + (cnt++) + ": " + ans + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
                if(bw!= null) bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


        }
    }


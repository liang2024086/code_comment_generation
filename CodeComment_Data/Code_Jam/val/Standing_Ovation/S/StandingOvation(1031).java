package methodEmbedding.Standing_Ovation.S.LYD2017;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.nio.charset.Charset;

public class StandingOvation {
    public StandingOvation() {
        super();
    }

    public static void main(String[] args) throws Exception {
        File fout = new File("D:\\Saju\\workspace\\CodeJam\\ovation-out.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));


        InputStream fis = new FileInputStream("D:\\Saju\\workspace\\CodeJam\\ovation-in.txt");
        InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(isr);
        String line = "";
        int linenum = 1;
        while ((line = br.readLine()) != null) {
            // Deal with the line
            String[] strArr = line.split(" ");
            if (strArr.length>1 && strArr[1].length() > 0) {
                int maxShy = Integer.valueOf(strArr[0]);
                int audienceShy[] = new int[maxShy + 1];
                for (int i = 0; i < strArr[1].length(); i++) {
                    audienceShy[i] = Integer.valueOf(String.valueOf(strArr[1].charAt(i)));
                }
                System.out.println("Audience shy " + audienceShy);
                int extraNeeded=0;
                int stoodup=0;
                for(int j=0; j< audienceShy.length; j++){
                    int currShyAudCnt = audienceShy[j];
                    if(currShyAudCnt>0){
                        if(stoodup >= j){
                            //enough people already up
                            stoodup+=currShyAudCnt;
                        }else{                            
                            extraNeeded+= (j-stoodup);
                            stoodup+= (j-stoodup);
                            stoodup+=currShyAudCnt;
                        }
                    }
                }
                bw.write("Case #"+linenum+": "+extraNeeded);
                bw.write("\n");
                bw.flush();
            }
            linenum++;
            
        }
        bw.close();

    }
}

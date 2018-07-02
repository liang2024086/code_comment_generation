package methodEmbedding.Magic_Trick.S.LYD2109;

import java.io.*;
import java.util.Arrays;

public class Magic {
    public static void main(String[] args){

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            String sCurrentLine;
            br = new BufferedReader(new FileReader("/Users/dineshsg/Downloads/A-small-attempt0.in"));
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
                int ans[] = new int[2];

                String[][] row = new String[2][4];

                int r = 1;

                ans[0] = Integer.parseInt(sCurrentLine);

                for(int j=0; j<4; j++){
                   sCurrentLine = br.readLine();
                   if((j+1) == ans[0]){
                      row[0] = sCurrentLine.split(" ");
                   }
                }

                ans[1] = Integer.parseInt(br.readLine());

                for(int j=0; j<4; j++){
                    sCurrentLine = br.readLine();
                    if((j+1) == ans[1]){
                        row[1] = sCurrentLine.split(" ");
                    }
                }

                int match = 0;
                String res = null;
                for(int i=0; i<4;i++){
                    for(int j=0; j<4; j++){
                        if(row[0][i].equals(row[1][j])){
                            match++;
                            res = row[0][i];
                        }
                    }
                }

                switch (match){
                    case 0 :
                        bw.write("Case #" + (cnt++) + ": Volunteer cheated!\n");
                        break;
                    case 1:
                        bw.write("Case #" + (cnt++) + ": " + res + "\n");
                        break;
                    default:
                        bw.write("Case #" + (cnt++) + ": Bad magician!\n");
                }

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

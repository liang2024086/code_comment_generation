package methodEmbedding.Magic_Trick.S.LYD1654;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MajicTrick {
    public static void main(String[] args) {

        try (BufferedReader br =
             new BufferedReader(new FileReader("C:\\Users\\iT-v8\\Downloads\\A-small-attempt1.in"))) {

            String sCurrentLine;
            File file = new File("C:\\Users\\iT-v8\\Downloads\\CodeJam\\results.out");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);


            if ((sCurrentLine = br.readLine()) != null) {
                int T = Integer.parseInt(sCurrentLine);
                int t = 1;
                int i;
                while (t <= T) {

                    int order1 = Integer.parseInt(br.readLine());
                    String[] arr1 = new String[4];
                    String nt;
                    for (i = 0; i < order1; i++) {
                        arr1 = br.readLine().split(" ");
                    }
                    for (int j = i; j < 4; j++) {
                        nt = br.readLine();
                    }

                    int order2 = Integer.parseInt(br.readLine());
                    String[] arr2 = new String[4];
                    for (i = 0; i < order2; i++) {
                        arr2 = br.readLine().split(" ");
                    }
                    for (int j = i; j < 4; j++) {
                        nt = br.readLine();
                    }
                   
                  int found=0;
                    boolean statement1=false;
                    boolean statement2=false;
                    for (i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (arr1[i].equals(arr2[j])) {
                                if(found==0){
                                    statement1=true;
                                    found= Integer.parseInt(arr1[i]);
                                }
                                else{
                                    statement2=true;
                                    statement1=false;
                                }
                            }
                        }
                    }
                    if(statement1==true)
                        bw.write("Case #" + t + ": " + found);
                    if(statement2==true)
                        bw.write("Case #" + t + ": " + "Bad magician!");
                    if(statement1==false && statement2==false){
                        bw.write("Case #" + t + ": " + "Volunteer cheated!");
                    }                   
                    bw.newLine();
                    t++;
                }
                bw.close();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

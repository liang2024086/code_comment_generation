package methodEmbedding.Magic_Trick.S.LYD1546;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String args[]){
        BufferedReader br = null;
        int inputCount=0;

        try {

            String sCurrentLine;
            br = new BufferedReader(new FileReader("input.txt"));

            //reading first line
           // br.readLine();

            if((sCurrentLine = br.readLine()) != null) {
                inputCount = Integer.parseInt(sCurrentLine);
            }

            for(int i=0;i<inputCount;i++){
                int grid1[][] = new int[4][4];
                int grid2[][] = new int[4][4];
               int firstAns = Integer.parseInt(br.readLine());
                int secondAns;

                for(int j=0;j<4;j++){
                    String inputValues[]= br.readLine().split(" ");
                    for(int k=0;k<4;k++){
                        grid1[j][k] = Integer.parseInt(inputValues[k]);
                    }
                }
                secondAns =Integer.parseInt(br.readLine());

                for(int j=0;j<4;j++){
                    String inputValues[]= br.readLine().split(" ");
                    for(int k=0;k<4;k++){
                        grid2[j][k] = Integer.parseInt(inputValues[k]);
                    }
                }

                boolean found = false;
                boolean moreThanOne = false;
                int AnsCount =0;
                int finalAns = 0;

                for(int r1:grid1[firstAns-1]){
                    for(int r2:grid2[secondAns-1]){
                        if(r1==r2){
                            AnsCount++;
                            finalAns = r1;
                            found =true;
                        }
                    }
                }
                int s = i+1;

                if(!found){
                    System.out.println("Case #"+s+": "+"Volunteer cheated!");
                } else if(AnsCount>1){
                    System.out.println("Case #"+s+": "+"Bad magician!");
                }  else{
                    System.out.println("Case #"+s+": "+finalAns);
                }

            }



            System.out.println();

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

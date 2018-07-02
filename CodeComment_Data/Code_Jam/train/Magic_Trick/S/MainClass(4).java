package methodEmbedding.Magic_Trick.S.LYD547;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

    public static void main(String args[]) throws IOException
    {

        Scanner s = new Scanner(new File("st.txt"));
        File out = new File("out.txt");
        FileWriter fw = new FileWriter(out);
        //System.out.println(s.next());
        int caseCount = s.nextInt();
        String[] cases = new String[caseCount];
        for (int i = 0; i < caseCount; i++)
        {
            int choise = s.nextInt() - 1;
            int[][] deck = new int[4][4];

            for (int j = 0; j < 4; j++)
                for(int k = 0; k < 4; k++)
                    deck[j][k] = s.nextInt();

            int[] line1 = new int[4];

            for (int j = 0; j < 4; j++)
                line1[j] = deck[choise][j];

            choise = s.nextInt() - 1;

            for (int j = 0; j < 4; j++)
                for(int k = 0; k < 4; k++)
                    deck[j][k] = s.nextInt();

            int[] line2 = new int[4];
            int memX = choise, memY = 0;

            for (int j = 0; j < 4; j++)
                line2[j] = deck[choise][j];

            int answCount = 0;
            for (int j = 0; j < 4; j++)
                for(int k = 0; k < 4; k++)
                    if(line1[j] == line2[k])
                    {
                        answCount++;
                        memY = k;
                    }

            String outString = "";

            switch (answCount)
            {
                case 1:
                    //System.out.println("Case#" + (i + 1) + ": " + deck[memX][memY]);
                    outString = "Case #" + (i + 1) + ": " + deck[memX][memY] + "\n";
                    fw.write(outString);
                    break;
                case 0:
                   // System.out.println("Case#" + (i + 1) + ": " + "Volunteer cheated!");
                    outString = "Case #" + (i + 1) + ": " + "Volunteer cheated!" + "\n";
                    fw.write(outString);
                    break;
                default:
                    //System.out.println("Case#" + (i + 1) + ": " + "Bad magician!");
                    outString = "Case #" + (i + 1) + ": " + "Bad magician!" + "\n";
                    fw.write(outString);
                    break;


            }

        }

        fw.flush();
    }
}

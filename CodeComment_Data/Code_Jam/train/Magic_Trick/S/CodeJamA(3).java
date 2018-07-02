package methodEmbedding.Magic_Trick.S.LYD1899;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author omid
 */
public class CodeJamA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int count = 1;
        int[] first = new int[4];
        int secondints = 0;
        int firstints = 0;
        
        while (count <=T)
        {
            String massage = "";
            int i=0;
            int j=0;
            int firstRow = 0;
            int secondRow = 0;
            int repCounter = 0;
            int goal = 0;
            
            firstRow = input.nextInt()-1;
            
            for (i = 0; i<4; i++)
                for(j = 0; j<4;j++)
                {
                    firstints = input.nextInt();
                    if(i==firstRow)
                        first[j] = firstints;
                }

            secondRow = input.nextInt()-1;
            for (i = 0; i<4; i++)
                for(j = 0; j<4;j++)
                {
                    secondints = input.nextInt();
                    if(i==secondRow)
                    {
                        for (int k = 0; k<4; k++)
                        {
                            if(first[k]==secondints){
                                repCounter++;
                                goal = secondints;
                            }
                        }
                    }
                }
            if(repCounter==0)
                massage = "Volunteer cheated!";
            if (repCounter==1)
                massage = Integer.toString(goal);
            if (repCounter>1)
                massage = "Bad magician!";
            
             System.out.print("Case #"+count+": "+massage+"\n");
             count++;
        }
        
        // TODO code application logic here
    }
}

package methodEmbedding.Magic_Trick.S.LYD910;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew
 */
public class MagicTrick {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //number of test cases
        String line = in.nextLine();
        int testCases = Integer.parseInt(line);
        
        for(int i=0; i<testCases; i++)
        {
            int[] row1 = new int[4];
            int[] row2 = new int[4];
            int[] row = new int[4];

            //get first row selection
            line = in.nextLine();
            int rowQ1 = Integer.parseInt(line);
            
            //get first row
            for (int j=0; j<4; j++)
            {
                line = in.nextLine();
            
                if((j+1)==rowQ1)
                {
                    String[] line2 = line.split(" ");

                    for (int k=0; k<4; k++)
                    {
                        row1[k] = Integer.parseInt(line2[k]);
                    }
                }
            }
            
            //get first row selection
            line = in.nextLine();
            int rowQ2 = Integer.parseInt(line);
            
            //get second row
            for (int j=0; j<4; j++)
            {
                line = in.nextLine();
                        
                if((j+1)==rowQ2)
                {
                    String[] line2 = line.split(" ");

                    for (int k=0; k<4; k++)
                    {
                        row2[k] = Integer.parseInt(line2[k]);
                    }
                }
            }
            
            boolean match = false;
            boolean matchPlus = false;
            int yourNumber = 0;
            
            //Make a decision
            for (int j=0; j<4; j++)
            {
                for (int k=0; k<4; k++)
                {
                    if (row1[j] == row2[k])
                    {
                        if(!match)
                        {
                            yourNumber = row1[j];
                            match = true;
                        }
                        else
                        {
                            matchPlus = true;
                        }
                    }
                }
            }
            
            System.out.print("Case #" + (i+1) + ": ");
            //output message
            if(matchPlus)
            {
                System.out.print("Bad Magician!\n");
            }
            else if(match)
            {
                System.out.print(yourNumber + "\n");
            }
            else
            {
                System.out.print("Volunteer Cheated!\n");
            }
            
        }
        
        //System.out.println(testCases);
    }
}

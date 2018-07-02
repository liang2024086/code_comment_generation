package methodEmbedding.Magic_Trick.S.LYD791;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avinash
 */
public class Q1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File ("input.txt"));
                        BufferedWriter out = new BufferedWriter(new FileWriter("A1P1out1.txt"));

            
            int c= in.nextInt();
            for(int z=1;z<=c;z++)
            {
                int selected = in.nextInt();
                int card[][] = new int[4][4];
                int possibles[] = new int[4];
                int result=-1;
                for(int i=0;i<4;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                        card[i][j]=in.nextInt();
                    }
                }
                for(int i=0;i<4;i++)
                {
                    possibles[i]=card[selected-1][i];
                }
                selected = in.nextInt();
                for(int i=0;i<4;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                        card[i][j]=in.nextInt();
                    }
                }
                boolean stop = false;
                for(int i=0;i<4 && !stop;i++)
                {
                    for(int j=0;j<4 && !stop;j++)
                    {
                        if(card[selected-1][i]==possibles[j])
                        {
                            if(result==-1)
                                result = possibles[j];
                            else
                                stop = true;
                        }
                    }
                }
                if(result != -1 && !stop)
                {
                    out.append("Case #"+z+": "+result);
                    out.newLine();/**/
                }
                else if(result == -1)
                {
                    out.append("Case #"+z+": Volunteer cheated!");
                    out.newLine();/**/
                }
                else if(stop)
                {
                    out.append("Case #"+z+": Bad magician!");out.newLine();/**/
                }
                
            }
            
            
            out.close();
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Q1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
}

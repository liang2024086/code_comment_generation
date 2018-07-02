package methodEmbedding.Magic_Trick.S.LYD921;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BHAWIK JAIN
 */
public class Cjqual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = null;
        try {
            s = new Scanner(new File("A-small-attempt0.in"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cjqual.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        PrintWriter pw=null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("A-small-attempt0.txt"));
            pw = new PrintWriter(fos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cjqual.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int T;
        T=Integer.parseInt(s.nextLine());
        for(int i=0; i<T; i++)
        {
            int ans1 = Integer.parseInt(s.nextLine());
            int[] mat1 = new int[4];
            String[] s1 = new String[4];
            for(int m=0; m<4; m++)
            {
                s1[m]=s.nextLine();
            }
            String[] m1 = s1[ans1-1].split(" ");
            for(int m=0; m<4; m++)
            {
                mat1[m]=Integer.parseInt(m1[m]);
            }
            int ans2 = Integer.parseInt(s.nextLine());
            int[] mat2 = new int[4];
            String[] s2 = new String[4];
            for(int m=0; m<4; m++)
            {
                s2[m]=s.nextLine();
            }
            String[] m2 = s2[ans2-1].split(" ");
            for(int m=0; m<4; m++)
            {
                mat2[m]=Integer.parseInt(m2[m]);
            }
            int flag=0;
            int ans=0;
            String y="";
            for(int m=0; m<4; m++)
            {
                for(int n=0; n<4; n++)
                {
                    if(mat1[m]==mat2[n])
                    {
                        if(flag==1)
                        {
                            y="Bad magician!";
                            ans=50;
                            break;
                        }
                        else
                        {
                            flag=1;
                            ans=mat1[m];
                        }
                    }
                }
            }
            if(ans==0)
            {
                y="Volunteer cheated!";
            }
            else if(ans!=50)
            {
                y=String.valueOf(ans);
            }
            pw.println("Case #"+(i+1)+": "+y);
        }
        pw.close();
        s.close();
    }
    
}

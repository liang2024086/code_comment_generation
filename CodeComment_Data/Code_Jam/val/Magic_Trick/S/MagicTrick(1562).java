package methodEmbedding.Magic_Trick.S.LYD1637;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.regex.Pattern;

/**
 *
 * @author Nous
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        
        Reader rr;
        Writer ww;
        LineNumberReader Lnr;
        String s;
        String[][] TTabs;
        long a,b,c;
        int i,j,ntc;
        int[][] Tabi;
        Pattern pat;
        
        Tabi = new int[1000][1000];
        TTabs = new String[100][];
        
        int NbTestCases;
        String sout;
        int  FlagOK;
        
// Variables Fonctionnelles li??es au Test Case :
        int[][][] Cartes;
        int[] Ans;
        int NbPos, Carte;
        
        Cartes = new int [2][4][4];
        Ans=new int [2];
         
        pat =  Pattern.compile(" +"); // Pour s??parer les mots
 //       pat =  Pattern.compile(" *"); // Pour s??parer chaque caract??re 
 //               (ATTENTION : commence alors par "" !!!)
        // Titre
        System.out.println("Magic Trick");
        
        // Nombre de cas
        rr=new InputStreamReader(new FileInputStream("A-small-attempt0.in"), 
                "ISO-8859-1");
        ww=new OutputStreamWriter(new FileOutputStream("File.out"), 
                "ISO-8859-1");
        Lnr = new LineNumberReader(rr);
        NbTestCases = Integer.parseInt(Lnr.readLine());
        
        
        // Cas par cas
        for(ntc=1;ntc<=NbTestCases;ntc++)
        {
            // Premi??re r??ponse
            s=Lnr.readLine();
            TTabs[0] = pat.split(s);
            Ans[0] = Integer.parseInt(TTabs[0][0]);
            
            // Premi??re table
            for(i=0;i<4;i++)
            {
                s=Lnr.readLine();
                TTabs[0] = pat.split(s);
                for(j=0;j<4;j++)
                {
                    Cartes[0][i][j]=Integer.parseInt(TTabs[0][j]);
                }
            }
            
            // Deuxi??me r??ponse
            s=Lnr.readLine();
            TTabs[0] = pat.split(s);
            Ans[1] = Integer.parseInt(TTabs[0][0]);
            
            // Deuxi??me table
            for(i=0;i<4;i++)
            {
                s=Lnr.readLine();
                TTabs[0] = pat.split(s);
                for(j=0;j<4;j++)
                {
                    Cartes[1][i][j]=Integer.parseInt(TTabs[0][j]);
                }
            }
            
            // C'est parti :
            Carte=0;
            NbPos=0;
            for(i=0;i<4;i++)
            {
                for(j=0;j<4;j++)
                {
                    if(Cartes[0][Ans[0]-1][i]==Cartes[1][Ans[1]-1][j])
                    {
                        Carte=Cartes[0][Ans[0]-1][i];
                        NbPos++;
                    }
                }
            }
            
            
            // R??sultat du Test Case
            sout="";
            if(NbPos==0)
            {
                sout="Volunteer cheated!";                
            }
            if(NbPos==1)
            {
                sout=String.valueOf(Carte);
            }
            if(NbPos>1)
            {
                sout="Bad magician!";
            }

            // Sortie de la r??ponse
            System.out.println("Case #"+ntc+": "+sout); 
            ww.write("Case #"+ntc+": "+sout+"\n");
        }
        
        
        ww.close();
        
    }
    
}

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1454;

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
public class CookieClickerAlpha {

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
        double Cin, Fin, Xin;
        double Prod0, BestTime, dt, Time, nFermes,TFermes;
        int pente;
        
        
         
        pat =  Pattern.compile(" +"); // Pour s??parer les mots
 //       pat =  Pattern.compile(" *"); // Pour s??parer chaque caract??re 
 //               (ATTENTION : commence alors par "" !!!)
        // Titre
        System.out.println("Cookie Clicker Alpha");
        
        // Nombre de cas
        rr=new InputStreamReader(new FileInputStream("B-small-attempt0.in"), 
                "ISO-8859-1");
        ww=new OutputStreamWriter(new FileOutputStream("File.out"), 
                "ISO-8859-1");
        Lnr = new LineNumberReader(rr);
        NbTestCases = Integer.parseInt(Lnr.readLine());
        
        
        // Cas par cas
        for(ntc=1;ntc<=NbTestCases;ntc++)
        {
            // Lecture des entr??es
            s=Lnr.readLine();
            TTabs[0] = pat.split(s);
            Cin = Double.parseDouble(TTabs[0][0]);
            Fin = Double.parseDouble(TTabs[0][1]);
            Xin = Double.parseDouble(TTabs[0][2]);
            
           
            // C'est parti : temps optimal en fonction du nombre de fermes
            Prod0=2;
            BestTime=Xin/Prod0+1;
            TFermes=0;
            pente=-1;
            for(nFermes=0;pente<1;nFermes++)
            {
                // Temps correspondant ?? nFerme
                Time=0;
                for(i=0;i<nFermes;i++)
                {
                    Time+=Cin/(Prod0+i*Fin);
                }
                TFermes=Time;
                Time+=Xin/(Prod0+nFermes*Fin);
                if(Time<=BestTime)
                {
                    BestTime=Time;
                    pente=0;
                } else
                {
                    if(pente==0) pente=1;
                }
            } 
            
            // R??sultat du Test Case
            sout="";
            sout=String.valueOf(BestTime);

            // Sortie de la r??ponse
            System.out.println("Case #"+ntc+": "+sout); 
            ww.write("Case #"+ntc+": "+sout+"\n");
        }
        
        
        ww.close();
        
    }
    
}

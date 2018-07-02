package methodEmbedding.Speaking_in_Tongues.S.LYD1505;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdallah gaber
 */
public class Speaking_in_Tongues {
    ///////////////////////////variables////////////////
    public static char[] OurAlg=new char[255];
    ///////////////////////////////////////////////////
    
    
    public Speaking_in_Tongues()
    {
        OurAlg['y']='a';OurAlg['n']='b';OurAlg['f']='c';OurAlg['i']='d';OurAlg['c']='e';OurAlg['w']='f';
        OurAlg['l']='g';OurAlg['b']='h';OurAlg['k']='i';OurAlg['u']='j';OurAlg['o']='k';OurAlg['m']='l';
        OurAlg['x']='m';OurAlg['s']='n';OurAlg['e']='o';OurAlg['v']='p';OurAlg['z']='q';OurAlg['p']='r';
        OurAlg['d']='s';OurAlg['r']='t';OurAlg['j']='u';OurAlg['g']='v';OurAlg['t']='w';OurAlg['h']='x';
        OurAlg['a']='y';OurAlg['q']='z';
    }

    public static void main(String[] args)
    {
        PrintWriter pw = null;
        Scanner sc = null;
        try {
            new Speaking_in_Tongues();
            sc = new Scanner(new FileReader("C:\\Users\\abdallah gaber\\Documents\\NetBeansProjects\\CodeJam2012\\src\\Qualification\\Spkinput.in"));
            pw = new PrintWriter(new FileWriter("C:\\Users\\abdallah gaber\\Documents\\NetBeansProjects\\CodeJam2012\\src\\Qualification\\Spkoutput.out"));
            int casCnt=Integer.parseInt(sc.nextLine());
            for(int cnt=0;cnt<casCnt;cnt++)
            {
                String s=sc.nextLine();
                String out="";
                for(int i=0;i<s.length();i++)
                {
                    if(s.toLowerCase().charAt(i)<='z'&&s.toLowerCase().charAt(i)>='a')
                    {
                        out+=OurAlg[s.charAt(i)];
                    }
                    else
                        out+=s.charAt(i);
                }
                pw.println("Case #"+(cnt+1)+": "+out);
            }
        } catch (IOException ex) {
            Logger.getLogger(Speaking_in_Tongues.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            pw.flush();
            pw.close();
            sc.close();
        }
    }
}

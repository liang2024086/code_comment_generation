package methodEmbedding.Standing_Ovation.S.LYD1033;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class Standing_Ovation_2 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int nbTest, Smax,  tabPersonne[];
        String personne="", chSMax="", test;
        long nbPersonne=0, nbAmi=0;
       
        test = sc.nextLine();
        nbTest = Integer.parseInt(test);        
        
        for(int p=0; p<nbTest; p++)
        {
            chSMax = sc.next();
            Smax = Integer.parseInt(chSMax);
            //sc.next();
            personne = sc.next();
            //System.out.println("Personne "+personne);
            
            tabPersonne = new int[personne.length()];
            
            for (int q=0; q<personne.length();q++)
            {
                tabPersonne[q] = Integer.parseInt(""+personne.charAt(q));
            }
            
            
            nbPersonne = 0 ;
            
            //D??but du traitement du tableau des personnes
            
            for (int i=0; i<tabPersonne.length; i++)
            {
               nbPersonne = nbPersonne + tabPersonne[i] ;
               
               if (nbPersonne < (i+1))
               {
                   nbPersonne++ ;
                   nbAmi++ ;
               }
               
            }
            
            System.out.println("Case #"+(p+1)+": "+nbAmi);
            
            nbPersonne=0;
            nbAmi=0 ;
            personne="" ;
        }
        
    }
}

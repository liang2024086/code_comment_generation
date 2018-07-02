package methodEmbedding.Speaking_in_Tongues.S.LYD188;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author yilianz
 */
public class SpeakingTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        //get the mapping by using examples 
        char []translate = new char[26]; 
        char []translateB = new char[26];
        translate[24]='a';
        translate[4]='o';
        translate[16]='z';
        
        String AC ="ejp mysljylc kd kxveddknmc re jsicpdrysi";
        String A = "our language is impossible to understand";
        String BC = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
        String CC= "de kr kd eoya kw aej tysr re ujdr lkgc jv";
        String B = "there are twenty six factorial possibilities";
        String C = "so it is okay if you want to just give up";
        A = A+B+C;
        AC = AC+BC+CC;
        char[] acarray =AC.toCharArray();
        char[] aarray =A.toCharArray();
   
        
        for (int i =0; i<acarray.length;i++){
            int k = (int)acarray[i]-97;
            if (k>=0) {
               // System.out.println(acarray[i]+"->"+aarray[i]);            
            translate[k] = aarray[i];
            int k1=(int)aarray[i]-97;
            translateB[k1]=acarray[i];
            }
        }
            
       
        for (int i = 0; i<26; i++) 
          System.out.println(i+"   "+translate[i]);
        
        //miss two translation
       
        translate[25]='q';
        
        Scanner inFile = new Scanner(new File("file.in"));
        PrintWriter outFile = new PrintWriter(new File("out.file"));
        
        int caseN =(int)inFile.nextInt();
        inFile.nextLine();
        // TODO code application logic here
        for(int i = 1; i<caseN+1; i++){
            String caseString = inFile.nextLine();
            char[] cArray = caseString.toCharArray();
            char[] TArray = new char[cArray.length];
            
            //do the translator
            for(int j = 0; j<cArray.length; j++){
                int k = (int)cArray[j]-97;
                if (k>=0) {
                    TArray[j]=translate[k];
                }
                else TArray[j] = cArray[j];
            }
            String outString = new String(TArray);
            System.out.println("Case #"+i+": "+outString);
             outFile.println("Case #"+i+": "+outString);
        }
        
        //close the file
         inFile.close();
         outFile.close();
    
        
         
                 }
}

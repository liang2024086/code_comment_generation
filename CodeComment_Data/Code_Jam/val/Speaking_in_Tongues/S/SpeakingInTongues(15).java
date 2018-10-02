package methodEmbedding.Speaking_in_Tongues.S.LYD51;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author AHMED
 */
public class SpeakingInTongues {
    
    public static void main(String[] args) throws Exception{
        SpeakingInTongues s = new SpeakingInTongues();
    }
    
    private char[] mapping = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
     public SpeakingInTongues() throws Exception{
         File inputFile = new File("A-small-attempt1.in");
         File outpuFile = new File("A-small-attempt1.out");
         Scanner sc = new Scanner(inputFile);
         PrintWriter pin = new PrintWriter(outpuFile);
         String currentLine;
         char currentChar;
         int n = Integer.parseInt(sc.nextLine());
         for(int i = 1 ; i <= n ; i++){
             currentLine = sc.nextLine();
             pin.print("Case #"+i+": ");
             for(int index = 0 ; index < currentLine.length() ; index++){
                 currentChar = currentLine.charAt(index);
                 if(currentChar == ' ')pin.print(currentChar);
                 else pin.print(mapping[currentChar - 'a']);
             }
             if(i!=n)pin.print("\n");
         }
         pin.close();
         sc.close();
     }
    
    //<editor-fold desc="calculate Mapping" defaultstate="collapsed">
    /*
     * myInput.txt File contains:
     * ejp mysljylc kd kxveddknmc re jsicpdrysi
     * our language is impossible to understand
     * rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd
     * there are twenty six factorial possibilities
     * de kr kd eoya kw aej tysr re ujdr lkgc jv
     * so it is okay if you want to just give up
    private char[] alphabets = new char[26];
    private char[] mapping = new char[26];
    public SpeakingInTongues(){
        for(int i=0 ; i<26;i++)
            alphabets[i] = (char)('a'+i);
        
        File f = new File("myInput.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(f);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        for(int i = 0 ; i < 3 ; i ++){
            String googlersLine = sc.nextLine();
            String naturalLine = sc.nextLine();
            for(int k = 0 ; k < googlersLine.length() ; k++){
                if(googlersLine.charAt(k) != ' '){
                int googlerIndex = googlersLine.charAt(k) - 'a';
                int naturalIndex = naturalLine.charAt(k) - 'a';
                mapping[googlerIndex] = alphabets[naturalIndex];
                }
            }
        }
        
        for(int i = 0 ; i < 26 ; i++)
            System.out.println(alphabets[i]+"->"+mapping[i]);
            
    }
    * 
    */
    //</editor-fold>
}

package methodEmbedding.Speaking_in_Tongues.S.LYD597;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Bogatinovi
 */
public class GoogleCodeJam { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int T = Integer.parseInt(in.nextLine());
            String alphabet="abcdefghijklmnopqrstuvwxyz";
            String Galphabet="yhesocvxduiglbkrztnwjpfmaq";
            for(int k=1;k<=T;k++){
                String s = in.nextLine();
                String result = "";
                for(int j=0;j<s.length();j++){
                  if(s.charAt(j)==' ') result+=' ';
                  else{
                      for(int m=0;m<alphabet.length();m++){
                          if(s.charAt(j)==alphabet.charAt(m)) result+=Galphabet.charAt(m);
                  }
                 }
                }
                System.out.println("Case #"+k+": "+result+"\n");
            }
    }
}

package methodEmbedding.Speaking_in_Tongues.S.LYD36;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author andy
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        //char sd = '1';
        //int[] sdf = new int[ 10 ];
        
        //System.out.println( sdf[ 0 ] );
        
        String map = "yhesocvxduiglbkrztnwjpfmaq";
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        
        String s = in.readLine();
        
        int numTestCases = Integer.parseInt(s);
        
        for( int testCase = 1 ; testCase <= numTestCases ; testCase ++ )
        {
            String encoded = in.readLine();
            
            String decoded = "";
            
            for( int i = 0 ; i < encoded.length() ; i ++)
            {
                char c = encoded.charAt(i);
                
                if( c != ' ')
                {
                    int iMap = c - 'a';
                    decoded += "" + map.charAt( iMap );
                }else
                {
                    decoded += " ";
                }
                
            }
            
            
            System.out.println("Case #" + testCase + ": " + decoded );
            
        }
    }
}

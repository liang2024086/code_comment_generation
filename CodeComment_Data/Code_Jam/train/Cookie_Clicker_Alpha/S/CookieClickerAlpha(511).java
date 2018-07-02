package methodEmbedding.Cookie_Clicker_Alpha.S.LYD140;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rashmika Local
 */
public class CookieClickerAlpha {
    public static void main(String[] args) {
        BufferedReader br = null;
        
        try{
            
            String sCurrentLine;
            br = new BufferedReader(new FileReader("input.txt"));
            int n=0;
            String[] answers = new String[1];
            String[] temp;
            
            if ((sCurrentLine = br.readLine()) != null) {
                
                n=Integer.parseInt(sCurrentLine); 
                answers = new String[n];
                
                for(int i=0; i<n; i++){
                    sCurrentLine = br.readLine();
                    temp = sCurrentLine.split(" ");
                    
                    double c = Double.parseDouble(temp[0]);
                    double f = Double.parseDouble(temp[1]);
                    double x = Double.parseDouble(temp[2]);
                    
                    double minTime = Integer.MAX_VALUE;
                    double nextTime = 0;
                    
                    for(int j=0; ; j++){                        
                        for(int k=j; k>=0; k--){
                            if(k==j){
                                nextTime += x /( 2 + (k*f) );
                            }else{
                                nextTime += c / ( 2 + (k*f) );
                            }
                        }                        
                        if(minTime > nextTime ){
                            minTime = nextTime;
                            nextTime = 0;
                        }else{
                            break;
                        }
                        
                    }
                    
                    answers[i] = "Case #" + (i+1) + ": " + minTime;                    
                }
                
            }
            
            for(int p=0; p<answers.length; p++){
                System.out.println(""+answers[p]);
            }
            
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (br != null)br.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
    }
}

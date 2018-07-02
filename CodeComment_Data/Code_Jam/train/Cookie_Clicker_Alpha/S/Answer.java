package methodEmbedding.Cookie_Clicker_Alpha.S.LYD42;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Thamayanthy
 */
public class Answer {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=0;
        double out[] = null;
        String element[];
        double c,f,x;
        
        try{
        String s=br.readLine();
        n=Integer.parseInt(s);
        out=new double[n];
        for(int k=0;k<n;k++){
             s=br.readLine();
             element=s.split(" ");
             c=Double.parseDouble(element[0]);
             f=Double.parseDouble(element[1]);
             x=Double.parseDouble(element[2]);
             double rate=2;
             while((x/(rate+f)+c/rate<x/rate)){
                 out[k]+=c/rate;
                 rate=rate+f;
             }
             out[k]+=x/rate;
			}
        }
        catch(Exception e){
            System.out.println(e);
        }
        for(int k=0;k<n;k++){           
             System.out.println("Case #"+(k+1)+": "+out[k]);             
        }            
    }  
}

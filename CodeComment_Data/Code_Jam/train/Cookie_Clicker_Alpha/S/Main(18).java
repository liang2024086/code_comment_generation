package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1255;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String filename = "C:/Users/Anextro/Downloads/me.txt";
        String filenames = "C:/Users/Anextro/Downloads/you.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filenames));
        
        
        int T = Integer.parseInt(br.readLine());
        
        for(int t=0;t<T;t++){
        
            String[] ln1 = br.readLine().split(" ");
            
            double C = Double.parseDouble(ln1[0]);
            double F = Double.parseDouble(ln1[1]);
            double X = Double.parseDouble(ln1[2]);
            
            double rate = 2.0;
            double time = 0.0;
            
            
            while(true){
                double A = X/rate;
                
                double M = X/(rate+F);
                
                double N = C/rate;
                
                double B = N + M;
                
                if(A<=B){
                    time = time + A;
                    
                    DecimalFormat df = new DecimalFormat("#.0000000");
                    String btemp = df.format(time);
                    String atemp = String.valueOf(((int)time));
                    //String btemp = String.valueOf((time));
                    int tmp = btemp.length()-atemp.length();
                    
                    while(tmp<7){
                        btemp+="0";
                        tmp+=1;
                        
                    }
                    if(t==T-1)  bw.append(btemp);
                    else    bw.append(btemp+"\n");
                    break;
                }else{
                    rate = rate + F;
                    time = time + N;
                    
                    
                }
            }
        }
        
        bw.close();
    }
}

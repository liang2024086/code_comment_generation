package methodEmbedding.Cookie_Clicker_Alpha.S.LYD442;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class CookieClickerAlpha {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new FileReader("B-small-attempt0.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("B-small-attempt0.out")));

    // No. of test cases
    int t = Integer.parseInt(br.readLine());
    
    int i,j,a,b;
    String l1 = "";
    StringTokenizer st = new StringTokenizer("");
    double c,f,x,t1,t2,tf,r;
    String[] output = new String[t];
    
    
    for(i = 0; i < t; i++){
      
      l1 = br.readLine();
      
      st = new StringTokenizer(l1);
      c = Double.parseDouble(st.nextToken());
      f = Double.parseDouble(st.nextToken());
      x = Double.parseDouble(st.nextToken());
      
      t1=t2=tf=0;
      r = 2;
      
      while(true){
        t1 = x/r;
        t2 = c/r + x/(r+f);
        
        if(t1 <= t2){
          tf += t1;
          break;
        }
        else{
          tf += c/r;
          r = r+f;
          continue;
        }

      }

      
      output[i] = "Case #" + (i+1) + ": " + String.format("%.7f", tf) + "\n";
      
    }
    
    br.close();
    
    //Write to file
    for(i = 0 ; i<t ; i++){
      
      bw.write(output[i]);
    }
    
    bw.close();
    
  }

}

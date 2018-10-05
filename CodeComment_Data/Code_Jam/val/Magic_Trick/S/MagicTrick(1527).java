package methodEmbedding.Magic_Trick.S.LYD1567;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;


public class MagicTrick {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("A-small-attempt0.out")));

    // No. of test cases
    int t = Integer.parseInt(br.readLine());
    
    int i,j,a,b;
    String l1 = "", l2 = "";
    StringTokenizer st = new StringTokenizer("");
    int b1,b2,b3,c;
    String[] output = new String[t];
    
    final int i1 = 0000000000000001;
    final String t2 = "Bad magician!";
    final String t3 = "Volunteer cheated!";
    
    for(i = 0; i < t; i++){
      b1 = b2 = b3 = 0;
      
      a = Integer.parseInt(br.readLine());
      
      for(j = 1; j<a; j++)
        br.readLine();
      l1 = br.readLine();
      
      for(j=a+1;j<5;j++)
        br.readLine();
      
      b = Integer.parseInt(br.readLine());
      
      for(j = 1; j<b; j++)
        br.readLine();
      l2 = br.readLine();
      
      for(j=b+1;j<5;j++)
        br.readLine();
      
      st = new StringTokenizer(l1);
      while(st.hasMoreTokens()){
        b1 |= i1<<Integer.parseInt(st.nextToken());
      }
      
      st = new StringTokenizer(l2);
      while(st.hasMoreTokens()){
        b2 |= i1<<Integer.parseInt(st.nextToken());
      }
      
      b3 = b1&b2;
      c = Integer.bitCount(b3);
      
      output[i] = "Case #" + (i+1) + ": " + 
      ((c==1) ? Integer.numberOfTrailingZeros(b3) : ( (c==0)? t3 : t2 )) + "\n";
      
    }
    
    br.close();
    
    //Write to file
    for(i = 0 ; i<t ; i++){
      
      bw.write(output[i]);
    }
    
    bw.close();
    
  }

}

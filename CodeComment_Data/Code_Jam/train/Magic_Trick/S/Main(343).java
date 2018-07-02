package methodEmbedding.Magic_Trick.S.LYD2122;


import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {    

    public static void main(String[] args) throws IOException {
        
        BufferedInputStream is = new BufferedInputStream(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int a, b, c, d, e;        
        
        a = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= a; i++) {
            
            b = Integer.parseInt(br.readLine());
            int cont = 0, carta = 0; 
            ArrayList <Integer> cartas1 = new ArrayList<>();
            
            for (int j = 1; j < 5; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 1; k < 5; k++) {
                    
                  d = Integer.parseInt(st.nextToken());
                  if(j==b)cartas1.add(d);
                }
                
            }
                        
            c = Integer.parseInt(br.readLine());
            
            for (int j = 1; j < 5; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 1; k < 5; k++) {
                    
                  e = Integer.parseInt(st.nextToken());
                  if(j==c && cartas1.contains(e)){ 
                      carta = e;
                      cont++;
                      if(cont>1)break;
                  }
                }
                
            }
            
            if(cont==1)sb.append("Case #").append(i).append(": ").append(carta).append("\n");
            else if(cont>1)sb.append("Case #").append(i).append(": ").append("Bad magician!\n");
            else if(cont==0)sb.append("Case #").append(i).append(": ").append("Volunteer cheated!\n");
           
        }
        bw.write(sb.toString());
        bw.flush();
    }
}

package methodEmbedding.Standing_Ovation.S.LYD1996;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
class SatndingOvation {
    
public static void main(String[] args) throws IOException {
   String filename="C:\\Users\\Anil Saroj\\My Documents\\NetBeansProjects\\USCO\\src\\codejam.in.txt";
  String fileout="C:\\Users\\Anil Saroj\\My Documents\\NetBeansProjects\\USCO\\src\\codejam.out.txt";

    BufferedReader f = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
 
    PrintWriter out = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileout)));  
        int t=Integer.parseInt(f.readLine());
        
        for (int i = 0; i < t; i++) {
            
             String s[]=f.readLine().split(" ");
             int smax=Integer.parseInt(s[0]);
             String r=s[1];
             
             
              int friend=0;int cnt=0;int stand=0;
              for (int j =0; j<=smax; j++) {
            
             int m=Character.getNumericValue(r.charAt(j));
             if(m!=0){
                 if (stand>=j) {
                        stand+=m;
                    }
                    if(stand<j){
                        friend+=j-stand;
                        stand+=friend+m;
                     }
                cnt++;
                 }
              }
          out.println("Case #"+(i+1)+":"+" "+friend);
             
        }
        out.close();
          System.exit(0);
          
}

    
}

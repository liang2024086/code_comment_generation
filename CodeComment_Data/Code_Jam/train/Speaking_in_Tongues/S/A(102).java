package methodEmbedding.Speaking_in_Tongues.S.LYD1525;

/*
  To change this template, choose Tools | Templates
  and open the template in the editor.
 */

import java.io.*;

/*
 
  @author Mo
 */
public class A {

    /*
      @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String map1[]={"y","n","f","i","c","w","l","b","k","u","o","m","x","s","e","v","z","p","d","r","j","g","t","h","a","q"," "};
        String mapn[]={"<1>","<2>","<3>","<4>","<5>","<6>","<7>","<8>","<9>","<10>","<11>","<12>","<13>","<14>","<15>","<16>","<17>","<18>","<19>","<20>","<21>","<22>","<23>","<24>","<25>","<26>","<27>"};
        String map2[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
        
        BufferedReader br=new BufferedReader(new FileReader(new File("A-small-attempt0.in")));
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("output.out")));
        
        int K=Integer.parseInt(br.readLine());
        for(int k=1;k<=K;k++){
            String line=br.readLine();
            for(int i=0;i<27;i++){
                //System.out.println(map1[i]+"->"+map2[i]);
                line=line.replaceAll(map1[i], mapn[i]);
            }
            //System.out.println(line);
            for(int i=0;i<27;i++){
                
                line=line.replaceAll(mapn[i], map2[i]);
                
            }
            System.out.println(line);
            bw.write("Case #"+k+": "+line);
            bw.newLine();
        }
        
        bw.close();
        
        
        
        
    }
}

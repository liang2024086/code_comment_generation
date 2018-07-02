package methodEmbedding.Magic_Trick.S.LYD1836;




import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class CodeJam_A {
    
    
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(new File("input")));        
        BufferedWriter wr = new BufferedWriter(new FileWriter("output"));
        int T = Integer.parseInt(br.readLine());
        
        for(int t = 0; t < T; t++){             
            HashSet<Integer> set = new HashSet<>();
            int cont = 0;          
            int ans = -1;
            int one = Integer.parseInt(br.readLine());
            int option1[] = new int[4];
            for(int i = 1; i<= 4; i++){
                String line = br.readLine();
                if(i==one){
                    StringTokenizer st = new StringTokenizer(line);
                    while(st.hasMoreTokens()){
                        set.add(Integer.parseInt(st.nextToken()));
                    }
                }                
            }
            int two = Integer.parseInt(br.readLine());
            int option2[] = new int[4];
            for(int i =1; i <= 4; i++){
                String line = br.readLine();
                if(i==two){
                    StringTokenizer st = new StringTokenizer(line);
                    while(st.hasMoreTokens()){
                        int num = Integer.parseInt(st.nextToken());
                        if(set.contains(num)){
                            cont++;
                            ans = num;                    
                        }
                    }
                }
            }
            wr.write("Case #"+(t+1)+": ");
            if(cont==1) wr.write(ans+"\n");
            else if(cont>1) wr.write("Bad magician!\n");
            else wr.write("Volunteer cheated!\n");                
        }
        
        wr.close();
    }
    
    
}

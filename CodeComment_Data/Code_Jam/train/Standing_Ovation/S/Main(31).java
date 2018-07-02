package methodEmbedding.Standing_Ovation.S.LYD1394;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author arthur
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = "C:/Users/arthur/Desktop/fbx/in.txt";
        String filenames = "C:/Users/arthur/Desktop/fbx/out.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        BufferedWriter bw = new BufferedWriter(new FileWriter(filenames));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int t=0;t<T;t++){
            
            String[] ln1 = br.readLine().split(" ");
            
            int maxn = Integer.parseInt(ln1[0]);
            
            int[] persons = new int[maxn+1];
            
            String p = ln1[1];
            
            int cnt = 0; //newly added
            
            
            
            for(int i=0;i<=maxn;i++){
                persons[i] = Integer.parseInt(String.valueOf(p.charAt(i)));
            }
            
            int stdup = persons[0] > 0 ? persons[0] : 0; //currenty standing
            
            for(int i=1;i<=maxn;i++){
                if(persons[i] > 0){//someone has that shyness level
                    
                    if(i > stdup){
                        cnt = cnt + (i-stdup);
                        stdup = i + persons[i];
                    }else{//no need to add new persons, just tell them to stand
                        stdup += persons[i];
                    }
                }
                else{//it is wise to fill up this position so that
                
                }
            }
            
            bw.append("Case #"+(t+1)+": "+cnt+"\n");
        }   
        bw.close();
    }
}

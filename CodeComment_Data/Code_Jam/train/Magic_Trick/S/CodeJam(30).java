package methodEmbedding.Magic_Trick.S.LYD466;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ManosMagnus
 */
public class CodeJam {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Scanner inFile = new Scanner ( new BufferedReader( new FileReader ("input.in") ) );
        try (PrintWriter outFile = new PrintWriter("output.in","UTF-8")) {
            int n = inFile.nextInt();
            
            HashSet<Integer> set = new HashSet<>();
            ArrayList<Integer> ans = new ArrayList<Integer>();
            
            for(int i=0; i<n; i++){
                
                int first = inFile.nextInt() - 1 ;
                for(int j=0; j<4; j++){
                    if(j == first){
                        for(int k=0; k<4; k++){
                            int temp = inFile.nextInt();
                            set.add(temp);
                        }
                    }else{
                        for(int k=0; k<4; k++){
                            inFile.nextInt();
                        }
                    }
                }
                int second = inFile.nextInt() - 1;
                for(int j=0; j<4; j++){
                    if(j == second){
                        for(int k=0; k<4; k++){
                            int temp = inFile.nextInt();
                            if(set.contains(temp)){
                                ans.add(temp);
                            }
                        }
                    }else{
                        for(int k=0; k<4; k++){
                            inFile.nextInt();
                        }
                    }
                }
                if( ans.size() == 1 ){
                    outFile.println("Case #" + (i+1) + ": " + ans.get(0) );
                }
                else if (ans.size() > 1){
                    outFile.println("Case #" + (i+1) + ": Bad magician!");
                }
                else{
                    outFile.println("Case #" + (i+1) + ": Volunteer cheated!");
                }
                ans.clear();
                set.clear();
            }
        }
        
    }
    
}

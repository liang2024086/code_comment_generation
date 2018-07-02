package methodEmbedding.Standing_Ovation.S.LYD231;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class StandingOFileOutput {


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
 
       // PrintWriter writer2 = new PrintWriter("inputO.txt", "UTF-8");
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        BufferedReader input = new BufferedReader(new FileReader("A-small-attempt2.in"));  
       // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));          
        String s[] = input.readLine().split(" ");   
        String s1;
        int  t = Integer.parseInt(s[0]);   
        // writer2.println(t);
        for(int i = 0; i < t; ++i) {  
              s1 = input.readLine();
             // writer2.println("Case #"+(i+1)+" "+ s1);
              s = s1.split(" "); 
              
              int smax = Integer.parseInt(s[0]);
              char[] charArray = s[1].toCharArray();
              int friends = 0;
              int sum = 0; 

              sum += (int)charArray[0]-48;
              for(int j = 1; j <= smax; ++j) {
                    int curr = (int)charArray[j]-48; 
                    if(curr >0){
                        if(sum < j){
                            friends += (j - sum);
                            sum += friends;
                       // System.out.println("j: "+j+"  sum: "+sum +" freinds: "+ friends);     
                        }else if(sum >= j){
                                    
                        }
                       sum +=  curr;
                    }
              } 
              writer.println("Case #"+(i+1)+": "+friends);
        } 
      //writer2.close();
        writer.close();
      }
    
}

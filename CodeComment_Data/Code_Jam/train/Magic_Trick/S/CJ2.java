package methodEmbedding.Magic_Trick.S.LYD1007;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CJ2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        File file = new File("input.txt");
        PrintWriter pw = new PrintWriter("output.txt");
          
        FileReader fr = new FileReader(file);
        BufferedReader r = new BufferedReader(fr);
         
        int T;          
 
        T = Integer.parseInt(r.readLine());        
         for(int t =0;t<T;t++){
             
                 int pr_1 = Integer.parseInt(r.readLine()); 
                 String[] lines_1 = new String[4];
                 int[] pos_1 = new int[4] ;
                 
                 lines_1[0] = r.readLine();
                 lines_1[1] = r.readLine();
                 lines_1[2] = r.readLine();
                 lines_1[3] = r.readLine();
                 
                StringTokenizer sto1 =  new StringTokenizer(lines_1[(pr_1-1)] ," "); 
                pos_1[0]= Integer.parseInt(sto1.nextElement().toString());
                pos_1[1]= Integer.parseInt(sto1.nextElement().toString());
                pos_1[2]= Integer.parseInt(sto1.nextElement().toString());
                pos_1[3]= Integer.parseInt(sto1.nextElement().toString());          
                 
                 int pr_2 = Integer.parseInt(r.readLine()); 
                 String[] lines_2 = new String[4];
                 int[] pos_2 = new int[4] ;
                 
                 lines_2[0] = r.readLine();
                 lines_2[1] = r.readLine();
                 lines_2[2] = r.readLine();
                 lines_2[3] = r.readLine(); 
                 
                StringTokenizer sto2 =  new StringTokenizer(lines_2[(pr_2-1)] ," ");
                pos_2[0]= Integer.parseInt(sto2.nextElement().toString());
                pos_2[1]= Integer.parseInt(sto2.nextElement().toString());
                pos_2[2]= Integer.parseInt(sto2.nextElement().toString());
                pos_2[3]= Integer.parseInt(sto2.nextElement().toString());
                
                int finalNumber =0;
                int count =0;
                
                for(int i=0; i<4;i++){
                    for(int j=0;j<4;j++){
                        if(pos_2[i]==pos_1[j] ){
                          //  System.err.println(t + "$$" +count +"##" + pos_2[i] +"##"+pos_1[j] );
                            count ++;
                            finalNumber = pos_2[i];
                        }
                    }
                }
                String fString;
                if(count ==0){
                    fString = "Volunteer cheated!";
                }else if(count ==1){
                    fString = finalNumber + "";
                }else{
                    fString = "Bad magician!" + "";
                }       
                      
                 pw.println("Case #"+(t+1)+": "+fString);
                 pw.flush();
         }            
    }


}

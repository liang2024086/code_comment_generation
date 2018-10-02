package methodEmbedding.Speaking_in_Tongues.S.LYD1404;



import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {

  public static void main(String [] args){
    if(args!=null && args.length==1){
      FileInputStream fstream = null;
      try {
        fstream = new FileInputStream(args[0]);
     // Get the object of DataInputStream
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        int lineNum = Integer.parseInt(br.readLine());
        
        GooglereseSolver solver = new GooglereseSolver();
        GooglereseSolver.calcualteMapping();
        
        
        for(int i=0 ; i<lineNum; i++){
          strLine = br.readLine();
          String resultStr = solver.solve(strLine);
          //System.out.println (strLine + "->" + resultStr);
          
          System.out.println ("Case #"+(i+1) +": " + resultStr);
        }
          
        in.close();
        
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
    }
  }
}

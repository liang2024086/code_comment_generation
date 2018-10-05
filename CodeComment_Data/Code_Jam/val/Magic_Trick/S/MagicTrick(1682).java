package methodEmbedding.Magic_Trick.S.LYD1143;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class MagicTrick 
{
    public static void main(String[] args) {
        
        try {
            BufferedReader in = new BufferedReader(new FileReader("A-small-attempt0.in"));
            int cases = Integer.parseInt(in.readLine());
            
            for (int i=0;i<cases;i++)
            {
                int rowNumber = Integer.parseInt(in.readLine());
                
                //skip useless lines 
                for (int j=0;j<rowNumber-1;j++)
                {
                    in.readLine();
                }
                String[] ar = in.readLine().split(" ");
                int candidate0 = Integer.parseInt(ar[0]);
                int candidate1 = Integer.parseInt(ar[1]);
                int candidate2 = Integer.parseInt(ar[2]);
                int candidate3 = Integer.parseInt(ar[3]);
                
                //skip useless lines
                for (int j=rowNumber;j<4;j++)
                {
                    in.readLine();
                }
                
                int columnNumber = Integer.parseInt(in.readLine());
                int found=0;
                int answer=0;
                
                //skip useless lines 
                for (int j=0;j<columnNumber-1;j++)
                {
                    in.readLine();
                }
                ar = in.readLine().split(" ");
                for (int j=0;j<4;j++)
                {
                    int candidate = Integer.parseInt(ar[j]);
                    if (candidate==candidate0 ||candidate==candidate1 ||candidate==candidate2 ||candidate==candidate3)
                    {
                        found++;
                        answer=candidate;
                    }
                }
                
                
                if (found==0) System.out.println("Case #"+(i+1)+": Volunteer cheated!");
                else if (found>1) System.out.println("Case #"+(i+1)+": Bad magician!");
                else System.out.println("Case #"+(i+1)+": "+answer);
                
                //skip useless lines
                for (int j=columnNumber;j<4;j++)
                {
                    in.readLine();
                }
                    
            }
            
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
    }
    
    
}

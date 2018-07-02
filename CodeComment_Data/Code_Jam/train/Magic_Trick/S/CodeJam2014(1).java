package methodEmbedding.Magic_Trick.S.LYD804;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CodeJam2014 {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\JAIDEEP\\Downloads\\A-small-attempt1.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\JAIDEEP\\Desktop\\output.out"));
        int T=Integer.parseInt(br.readLine());
        for(int t=1;t<=T;t++)
        {
            int rowid=Integer.parseInt(br.readLine());
            int k=1;
            while(k!= rowid){
                br.readLine();
                k++;
            }
            String line=" "+br.readLine()+" ";
            while(k++<4)
                br.readLine();
            rowid=Integer.parseInt(br.readLine());
            k=1;
            while(k!= rowid){
                br.readLine();
                k++;
            }
            String []ele=br.readLine().split(" ");
            while(k++<4)
                br.readLine();
            int card=0;
            for(int i=0;i<4;i++)
            {
                if(line.contains(" "+ele[i]+" ")){
                    if(card==0)
                        card=Integer.parseInt(ele[i]);
                    else
                    {
                        card=-1;
                        break;
                    }
                }
            }
            if(card==0)
                bw.append("Case #"+t+": Volunteer cheated!\n");
            else if(card==-1)
                bw.append("Case #"+t+": Bad magician!\n");
            else
                bw.append("Case #"+t+": "+card+"\n");
        }
        br.close();
        bw.close();
    }
}

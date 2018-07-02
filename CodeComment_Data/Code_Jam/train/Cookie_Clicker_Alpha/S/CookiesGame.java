package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1016;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CookiesGame {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\JAIDEEP\\Downloads\\B-small-attempt0.in"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\JAIDEEP\\Desktop\\output.out"));
        int T=Integer.parseInt(br.readLine());
        for(int t=1;t<=T;t++)
        {
            String []ele=br.readLine().split(" ");
            double C=Double.parseDouble(ele[0]);
            double F=Double.parseDouble(ele[1]);
            double X=Double.parseDouble(ele[2]);
            double ck=2;
            double ans1;
            double ans2=X/2;
            double intrSum=0;
            do
            {
                ans1=ans2;
                intrSum+=C/ck;
                ck+=F;
                ans2=intrSum + X/ck;
            }while(ans1>=ans2);
            bw.append("Case #"+t+": "+ans1+"\n");
        }
        br.close();
        bw.close();
    }
}

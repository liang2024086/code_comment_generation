package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1021;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 *
 * @author Bassem Ehab
 */
public class CookieClickerAlpha {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("B-small.in"));
        FileWriter file = new FileWriter("o.out");
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine());
            double C=Double.parseDouble(st.nextToken());
            double F=Double.parseDouble(st.nextToken());
            double X=Double.parseDouble(st.nextToken());
            double O= 2.0;double sum=0;
            for(;;)
            {
                if(((C/O)+(X/(O+F)))<(X/O)){sum+=C/O;O+=F;continue;}
                sum+=X/O;break;
            }
            file.append("Case #" + (i) + ": "+ sum);
                file.append("\n");
        }
        file.close();
    }
}

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1002;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.StringTokenizer;


public class CookieClickerAlpha {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("B-small-attempt0.in");
        FileWriter fw = new FileWriter("output.out");
        BufferedReader br = new BufferedReader(fr);
        String s;
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int count,k=1;
        double cookie,farm,X,time1=0,time2,cookiesPerSecond;
        DecimalFormat df = new DecimalFormat("#.#######");
        for(int i=0;i<n;i++){
            s = br.readLine();
            st = new StringTokenizer(s," ");
            cookie = Double.parseDouble(st.nextToken());
            farm = Double.parseDouble(st.nextToken());
            X = Double.parseDouble(st.nextToken());
            time1 = 0;
            count = 1;

            while(true){
                time2 = 0;
                cookiesPerSecond = 2;
                if(count==1){
                    time1 += X/cookiesPerSecond;
                    count++;
                    continue;
                }
                for(int j=0;j<count;j++){
                    if(j==count-1){
                        time2 += X/cookiesPerSecond;
                        break;
                    }
                    time2 += cookie/cookiesPerSecond;
                    cookiesPerSecond += farm;
                    }
                if(time2>time1)
                    break;
                else
                    time1 = time2;
                count++;
            }

            fw.write("Case #" + (k++) + ": " + df.format(time1) + "\n");
        }

        fr.close();
        fw.close();
    }
}

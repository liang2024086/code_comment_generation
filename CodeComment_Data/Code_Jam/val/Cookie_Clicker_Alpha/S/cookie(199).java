package methodEmbedding.Cookie_Clicker_Alpha.S.LYD459;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class cookie 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++)
        {
            double c,f,x,time[] = new double[2000], rate = 2.0;
            int index = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            c = Double.parseDouble(st.nextToken());
            f = Double.parseDouble(st.nextToken());
            x = Double.parseDouble(st.nextToken());
            double temp_sum = 0;
            while(true)
            {
                // calculating initially time required
                if(index==0)
                {
                    time[index] = x/rate;
                    index++;
                }
                else
                {
                    //calculating furthur time required
                    double building_time = c/rate;
                    temp_sum = temp_sum + building_time;
                    rate = rate + f;
                    double total_time = x/rate;
                    time[index] = temp_sum+total_time;                   
                    if(time[index]>time[index-1])
                    {
                        System.out.println("Case #"+i+": "+time[index-1]);
                        break;
                    }
                    index = index + 1;
                }               
            }
        }
    }
}

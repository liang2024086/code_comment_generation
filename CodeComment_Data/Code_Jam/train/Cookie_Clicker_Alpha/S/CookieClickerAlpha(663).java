package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1452;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CookieClickerAlpha 
{
    public static void main(String[] args) 
    {
        try {
            BufferedReader in = new BufferedReader(new FileReader("B-small-attempt1.in"));
            int cases = Integer.parseInt(in.readLine());
            
            for (int i=0;i<cases;i++)
            {
                String[] ar = in.readLine().split(" ");
                double farmCost = Double.parseDouble(ar[0]);
                double cookiesPerSecond = Double.parseDouble(ar[1]);
                double winThreshold = Double.parseDouble(ar[2]);
                double currentRate=2.0f;
                
                //max possible farms needed
                int maxFarms=(int)Math.round(winThreshold/farmCost);
                if (maxFarms==0)
                {
                    System.out.println("Case #"+(i+1)+": "+winThreshold/currentRate);
                }
                else
                {
                    double[] times = new double[maxFarms+1];
                    times[0]=winThreshold/currentRate;
                    //System.out.println(times[0]);
                    //System.out.println("");
                    for (int j=1;j<=maxFarms;j++)
                    {
                        times[j]=0f;
                        for (int w=1;w<=j;w++)
                        {
                            times[j]+=farmCost/(currentRate+cookiesPerSecond*(w-1));
                            //System.out.println(farmCost/(currentRate+cookiesPerSecond*(w-1)));
                        }
                        times[j]+=winThreshold/(currentRate+cookiesPerSecond*(j));
                        //System.out.println(winThreshold/(currentRate+cookiesPerSecond*(j)));
                        //System.out.println("");
                    }
                    
                    double minTime=times[0];
                    for (int j=0;j<maxFarms+1;j++)
                    {
                        //System.out.println(times[j-1]);
                        if (minTime>times[j]) minTime=times[j];
                    }
                    
                    System.out.println("Case #"+(i+1)+": "+minTime);
                 }
            }
            
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
    }
    
}

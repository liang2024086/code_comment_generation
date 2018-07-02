package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1058;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;

public class Cucky 
{

    public static void main(String[] args) throws Exception
    {
        
        BufferedReader br=new BufferedReader(new FileReader(new File("D:\\krunal\\input\\B-small-attempt0.in")));
        FileWriter wr=new FileWriter(new File("D:\\krunal\\input\\_cucyout.txt"));
        int T=Integer.parseInt(br.readLine().trim());
        int i=0;
        while(i<T)
        {
        i+=1;
        double c,f,x,in=2;
        String s=br.readLine();
        String[] w=s.split(" ");
        c=Double.parseDouble(w[0].trim());
        f=Double.parseDouble(w[1].trim());
        x=Double.parseDouble(w[2].trim());
        double t=0;
        boolean yes=false;
        double pt=(x/2);
        while(!yes)
        {
            t=t+(c/in);
            in=in+f;
            double pred=(t+(x/in));
            if(pt<pred)
            {
                yes=true;
                Double d=pt;
                DecimalFormat twoDForm = new DecimalFormat("#.#######");
                twoDForm.setMinimumFractionDigits(7);
                //System.out.println(pt);
                wr.write("Case #"+i+": "+Double.valueOf(twoDForm.format(pt))+"\r");
                wr.write("\n");
            }
            else
                pt=pred;
        }
        }
        wr.close();
    }
}

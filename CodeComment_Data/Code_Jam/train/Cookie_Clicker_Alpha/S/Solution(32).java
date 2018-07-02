package methodEmbedding.Cookie_Clicker_Alpha.S.LYD151;

import java.io.*;
public class Solution {
    public static void main(String[] args)throws IOException {
        String str[]=new String[150];
        double a[]=new double[4];
        int count=0;
        int init=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++)
        {
            double rate=2;
            double cfarm=0;
            double time=0;
            double farm=0;
            str[i]=br.readLine();
            str[i]=str[i].trim();
            for(int j=0;j<(str[i].length());j++){
                if(str[i].charAt(j)==' '){
                    a[count]=Double.parseDouble(str[i].substring(init,j));
                    count++;
                    init=j+1;
                }
            }
            a[count]=Double.parseDouble(str[i].substring(init,str[i].length()));
            count=0;
            init=0;
            do{
                farm=0;
                if(cfarm<time)
                {
                    rate=rate+a[1];
                }
            time=cfarm+(a[2]/rate);
            cfarm+=(a[0]/rate);
            farm=cfarm+(a[2]/(rate+a[1]));
            }
            while(farm<time);
            System.out.println("Case #"+(i+1)+": "+time);  
        }
    }
    }

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD802;

import java.text.DecimalFormat;
import java.util.regex.*;
import java.io.*;

public class Cookie{
        public static void main(String[] args)throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int testcases = Integer.parseInt(br.readLine());
            for(int i=1; i<=testcases; i++){
                String line = br.readLine();
			    String regex="([+-]?\\d*\\.\\d+)(?![-+0-9\\.]).*?([+-]?\\d*\\.\\d+)(?![-+0-9\\.]).*?([+-]?\\d*\\.\\d+)(?![-+0-9\\.])";

    		    Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
   		 	    Matcher m = p.matcher(line);
    		    double C=0.0f, F=0.0f, X=0.0f;
                if (m.find())
    		    {
        		    C=Double.parseDouble(m.group(1));
        		    F=Double.parseDouble(m.group(2));
        		    X=Double.parseDouble(m.group(3));
    		    }
                double seconds = 0.0f;
                double rate = 2.0f;
                while(true){
                    if((X/(rate+F)+C/(rate))>(X/rate)){
                        seconds+=X/rate;
                        break;
                    }else
                        seconds+=C/rate;
                    rate+=F;
                }
                System.out.println("Case #"+i+": "+ new DecimalFormat("0.0000000").format(seconds));
            }
        }
}

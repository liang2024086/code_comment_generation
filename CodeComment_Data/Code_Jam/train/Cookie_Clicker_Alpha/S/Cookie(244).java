package methodEmbedding.Cookie_Clicker_Alpha.S.LYD297;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 class Cookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int T = Integer.parseInt(buf.readLine());
        for(int i=1;i<=T;i++){
            double C,F,X,inc=2,time=0.0;
            String str = buf.readLine();
            token = new StringTokenizer(str," ");
            C=Double.parseDouble(token.nextToken());
            F=Double.parseDouble(token.nextToken());
            X=Double.parseDouble(token.nextToken());
            inc+=F;
            while((X/inc)<=(X-C)/(inc-F)){
                time=time+C/(inc-F);
                //System.out.println(C/(inc-F)+":"+time+":"+X/inc+":"+(X-C)/(inc-F));
                inc+=F;
            }
            time=time+X/(inc-F);
            time = Math.round(time * 10000000) / 10000000.0;
            System.out.println("Case #"+i+": "+time);
        }
    }
}

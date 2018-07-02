package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1326;

import java.util.Scanner;

/**
 *
 * @author Rajind
 */
public class MyB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0; i<T; i++){
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            double time = 0.0;
            double totalTime = 0.0;
            int farmCount = 0;
            
            if( c >= x){
                totalTime = x/2.0;
            }else{
                while(true){
                    time = c/(2.0+farmCount*f);
                    //System.out.println("Temp time:"+time);
                    if(x/(2.0+ farmCount*f) > time + x/(2.0 + (farmCount+1)*f)){
                        farmCount++;
                        totalTime = totalTime + time;
                        //System.out.println("Total time:"+totalTime);
                    }else{
                        //System.out.println("cal:"+x/(2.0 + farmCount*f));
                        totalTime = totalTime + x/(2.0 + farmCount*f);
                        break;
                    }
                }
            }
            System.out.format("Case #%d: %.7f\n",i+1,totalTime);
        }
    }
}

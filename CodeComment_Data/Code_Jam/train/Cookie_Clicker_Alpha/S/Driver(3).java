package methodEmbedding.Cookie_Clicker_Alpha.S.LYD825;

import java.util.Scanner;

/**
 * @Author: William Greer
 */
public class Driver {
    public static void main(String[] args){
        Scanner sin = new Scanner(System.in);
        int cases = sin.nextInt();
        for(int i = 1; i <= cases; i++){

            Double[] in = new Double[3];
            for(int j = 0; j < 3; j++){
                in[j] = sin.nextDouble();
            }

            Double cps = 2.0;
            Double current = 0.0;
            Double time = 0.0;

            Double best = in[2] / cps;
            do{
                time += in[0] / cps;
                cps += in[1];
                if(best > time + in[2]/cps){
                    best = time + in[2]/cps;
                }else{
                    break;
                }
            }while(true);//best > time + in[2]/cps);





            System.out.format("Case #%d: %.7f%n",i,best);

        }
    }

}

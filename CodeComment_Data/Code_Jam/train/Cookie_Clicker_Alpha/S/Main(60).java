package methodEmbedding.Cookie_Clicker_Alpha.S.LYD23;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Jasmin on 12.04.14.
 */
public class Main {

    public static void main(String[] args){

        String fileName = args[0];

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat decim = new DecimalFormat("#0.0000000");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        decim.setDecimalFormatSymbols(dfs);

        int t;

        double frequency = 2;
        double sum = 0;

        //Farm price
        double farmPrice;

        //extra cookies per farm
        double extraCookies;

        //goal
        double goal;

        double time = 0;

        BufferedReader br;

        try{
            br = new BufferedReader(new FileReader(new File(fileName)));
            t = Integer.parseInt(br.readLine());


            for(int i = 0; i < t; i++){
                String[] cfx = br.readLine().split(" ");
                farmPrice = Double.parseDouble(cfx[0]);
                extraCookies = Double.parseDouble(cfx[1]);
                goal = Double.parseDouble(cfx[2]);

                sum = 0;
                frequency = 2;
                time = 0;

                if(goal <= farmPrice){
                    time += goal / frequency;
                    System.out.println("Case #" + (i+1) + ": " + decim.format(time));
                }else{
                    outerloop:
                    while(sum < goal){

                        if(sum < farmPrice){
                            time += (farmPrice - sum) / frequency;
                            sum += (farmPrice - sum);
                        }else{

                            double pos1 = (goal - sum) / frequency;
                            double pos2 = (goal - sum + farmPrice) / (frequency + extraCookies);

                            if(pos1 < pos2){
                                time += pos1;
                                sum = goal;
                                System.out.println("Case #" + (i+1) + ": " + decim.format(time));
                                break outerloop;
                            }else{
                                sum -= farmPrice;
                                frequency += extraCookies;
                            }
                        }
                    }
                }



            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

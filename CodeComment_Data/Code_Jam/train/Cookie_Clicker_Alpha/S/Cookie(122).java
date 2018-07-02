package methodEmbedding.Cookie_Clicker_Alpha.S.LYD120;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cookie {

    public static void main(String[] args) throws Exception{
    // write your code here
        Scanner s = new Scanner(new File("Cookie.dat"));
        int cases = s.nextInt();
        for(int o=1; o<=cases; o++){
            System.out.print("Case #" + o + ": ");
            double costFarm = s.nextDouble();
            double farmRate = s.nextDouble();
            double goal = s.nextDouble();
            double currentRate = 2;
            double currentCookies = 0;
            double time = 0;

            while(currentCookies<goal){
                if(((goal)/(currentRate+farmRate)) + (costFarm/(currentRate)) < goal/currentRate){
                    time = time + costFarm/currentRate;
                    //System.out.println(costFarm/currentRate);

                   currentCookies = 0;
                   currentRate+=farmRate;
                  // System.out.println(currentRate);
                }else{
                    
                    time = time + goal/currentRate;
                    break;
                }
                
            }
            System.out.printf("%.7f %n", time);

        }
    }




}

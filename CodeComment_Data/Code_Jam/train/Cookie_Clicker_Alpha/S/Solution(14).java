package methodEmbedding.Cookie_Clicker_Alpha.S.LYD730;

import java.util.*;

public class Solution
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int casos = Integer.parseInt(teclado.nextLine());
        for(int i = 1; i<=casos; i++){
            double C = teclado.nextDouble(); //Cost of a Farm
            double F = teclado.nextDouble(); //Increase of production per Farm
            double X = teclado.nextDouble(); //Quantity to win
            if(teclado.hasNext())teclado.nextLine();
            
            double production = 2;
            double time = 0;
            /*
            (X - cookies)/production //Tiempo hasta total
            (C - cookies)/production //Tiempo hasta mejora
             */
            System.out.print("Case #" + i + ": ");
            boolean win = false;
            while(!win){
                double timeUntilWin = X/production;
                double timeUntilUpgrade = C/production;
                double timeUpgradePlusWin = C/production + X/(production + F);

                if(timeUntilWin <= timeUpgradePlusWin){
                    System.out.println(timeUntilWin + time);
                    win = true;
                }else if(timeUpgradePlusWin < timeUntilWin){
                    time += timeUntilUpgrade;
                    production += F;
                }
                
            }
        }

    }
}

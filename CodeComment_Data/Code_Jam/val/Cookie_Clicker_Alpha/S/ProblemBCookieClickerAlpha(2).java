package methodEmbedding.Cookie_Clicker_Alpha.S.LYD205;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Gando19850304
 */

import java.util.*;

public class ProblemBCookieClickerAlpha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int T=Integer.parseInt(input.nextLine());
        String games[][]=new String[T][3];
        for(int i=0;i<T;i++)
            games[i]=input.nextLine().split(" ",0);
        
        double [][]values=new double[T][3];
        
        for(int i=0;i<T;i++)
            for (int j=0;j<3;j++)
                values[i][j]=Double.parseDouble(games[i][j]);
        
        for(int i=0;i<T;i++)
        {
        double C=values[i][0];
        double F=values[i][1];
        double X=values[i][2];
        double time=0;
        double rate=2;

        while((X*1.0)/rate>((C*1.0)/rate+(X*1.0)/(rate+F)))
        {
          time+=C/rate;
          rate+=F;
        }
        
        time+=X/rate;
        System.out.printf("Case #%d: %.7f\n",i+1,time);

        }
        
        
//        for(int i=0;i<values.length;i++)
//        {
//            for(int j=0;j<values[0].length;j++)
//            {
//            System.out.printf("%.7f ",values[i][j]);
//            }
//            System.out.println();
//        }
        
    }
    
}

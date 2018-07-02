package methodEmbedding.Standing_Ovation.S.LYD1805;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Jakub Kozlowski
 */
public class App
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        final int cases = scanner.nextInt();
        for( int c=1; c <= cases; c++ )
        {
            final int maxShyness = scanner.nextInt();
            final int[] audience = new int[maxShyness+1];
            final String audienceStr = scanner.next();
            for( int i=0; i <= maxShyness; i++ )
                audience[i] = audienceStr.charAt(i) - '0';
            System.out.println("Case #" + c + ": " + new Solver(audience).getMinimumPeople());
        }
    }
    
}

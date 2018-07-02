package methodEmbedding.Cookie_Clicker_Alpha.S.LYD345;

import java.util.*;

/**
 * Write a description of class CookieClickerAlpha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CookieClickerAlpha
{
    public static void main( String args[] )
    {
        Scanner in = new Scanner( System.in );

        int cases = in.nextInt();
        //in.nextLine();

        for( int i = 0; i < cases; i++ )
        {
            in.nextLine();
            // Get input
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            double cps = 2.0;

            double timeTaken = 0.0;

            if( x/cps <= c/cps )
            {
                System.out.println(String.format("Case #%d: %f", i+1, x/cps ));
            }
            else
            {
                double min = x/cps;
                double currentFarmTime = 0;
                double currentTime = 0;
                
                do
                {
                    min = currentFarmTime + (x/cps);
                    
                    currentFarmTime += c/cps;
                    cps += f;
                    
                    currentTime = currentFarmTime + (x/cps);
                } while( currentFarmTime + (x/cps) < min );
                
                System.out.println(String.format("Case #%d: %f", i+1, min ));
                }
            }
        }
    }

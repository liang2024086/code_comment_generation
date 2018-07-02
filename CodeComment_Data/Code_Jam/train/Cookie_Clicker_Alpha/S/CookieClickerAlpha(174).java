package methodEmbedding.Cookie_Clicker_Alpha.S.LYD778;


import java.io.*;

/**
 * Created by som on 4/12/14.
 */
public class CookieClickerAlpha {
    public static void main(String argv[]) {
        try {
            Reader input = new FileReader( argv[0] );
            BufferedReader inputReader = new BufferedReader(input);
            StringBuffer outputBuff = new StringBuffer();

            int noOfCases = Integer.parseInt( inputReader.readLine() );
            for( int i = 1 ; i <= noOfCases ; ++i )  {
                double speed = 2.0;
                String values[] = inputReader.readLine().split(" ");
                double farmCost = Double.parseDouble(values[0]);
                double speedIncr = Double.parseDouble(values[1]);
                double goal = Double.parseDouble(values[2]);
                double totalTime = 0.0;

                while( ((goal/speed)-(goal/(speed+speedIncr))) > (farmCost/speed) ) {
                    totalTime += (farmCost/speed);
                    speed += speedIncr;
                }

                totalTime += (goal/speed);

                outputBuff.append("Case #" + i + ": " + String.format("%.7f", totalTime) + "\n");
            }

            inputReader.close();
            input.close();

            Writer output = new FileWriter( argv[1] );
            output.write(outputBuff.toString());
            output.close();

        } catch (FileNotFoundException e) {
            System.err.println( "File Not Found: " + argv[0] );
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

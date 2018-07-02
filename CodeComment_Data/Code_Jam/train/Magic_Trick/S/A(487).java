package methodEmbedding.Magic_Trick.S.LYD1016;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int ntests = Integer.parseInt( reader.readLine() );
        for( int test = 1; test <= ntests; test++ )
        {
            int rowIdx = Integer.parseInt( reader.readLine() );
            String[] row = null;
            for( int i = 1; i <= 4; i++ )
            {
                String line = reader.readLine();
                if( rowIdx == i )
                    row = line.split( " " );
            }
            rowIdx = Integer.parseInt( reader.readLine() );
            String result = null;
            int n = 0;
            for( int i = 1; i <= 4; i++ )
            {
                String line = reader.readLine();
                if( rowIdx == i )
                    for( String card1 : line.split( " " ) )
                        for( String card2 : row )
                            if( card1.equals( card2 ) )
                            {
                                result = card1;
                                n++;
                            }
            }
            if( n == 0 )
                result = "Volunteer cheated!";
            else if( n > 1 )
                result = "Bad magician!";
            System.out.println( "Case #" + test + ": " + result );
        }
    }
}

package methodEmbedding.Cookie_Clicker_Alpha.S.LYD421;

import java.io.*;
public class Solve2 {
  public static void main ( String[] args ) {
    try {
      BufferedReader buf = new BufferedReader( new InputStreamReader( new FileInputStream( args[0] ) ) );
      int count = Integer.parseInt( buf.readLine() );
      double c, f, x;
      double growth;
      double time;
      double oldtime;
      double farmtime;
      String[] tmp;
      for ( int i = 1; i <= count; i++ ) {
	System.out.print( "Case #" + i + ": " );
	tmp = buf.readLine().trim().split( " " );
	c = Float.parseFloat( tmp[0] );
	f = Float.parseFloat( tmp[1] );
	x = Float.parseFloat( tmp[2] );
	time = Float.MAX_VALUE;
	oldtime = time;
	farmtime = (double)0.0;
	growth = (double)2.0;
	while ( !(time > oldtime) ) {
	  oldtime = time;
	  time = farmtime + x/growth;
	  farmtime = farmtime + c/growth;
	  growth = growth + f;
	}
	System.out.println( oldtime );
      }
    }
    catch ( Exception e ) {
      e.printStackTrace();
    }
  }
}

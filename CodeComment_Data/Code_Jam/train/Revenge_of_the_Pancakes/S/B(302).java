package methodEmbedding.Revenge_of_the_Pancakes.S.LYD438;


import java.util.Scanner;

public class CodeJamB {
	public static void main( String args[] ){
		Scanner scan = new Scanner( System.in );
		int t = scan.nextInt();
		scan.nextLine();
		
		for( int tc = 1; tc <= t; tc++ ){
			String s = scan.nextLine();
			//System.out.println( s );
			s = s.replaceAll( "[-]+", "-" );
			s = s.replaceAll( "[+]+", "+");
			int cnt = 0;
			
			for( int i = 0; i < s.length(); i++ )
				if( s.charAt( i ) == '-' )	cnt += 2;
			
			if( s.charAt(0) == '-' )	cnt--;
			System.out.println( "Case #" + tc + ": " + cnt );
		}
	}
}

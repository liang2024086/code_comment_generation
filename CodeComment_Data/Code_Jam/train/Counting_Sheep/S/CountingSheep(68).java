package methodEmbedding.Counting_Sheep.S.LYD343;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for( int k=0 ; k<tc ; k++ ){
			int n = in.nextInt();
			if( n == 0 ){
				System.out.println("Case #"+(k+1) + ": INSOMNIA" );
			} else {
				List numSeen = new ArrayList<Integer>();
				int j=1;
				String res = "";
				while( numSeen.size() < 10 ){
					res = (j * n) + "";
					int i=0;
					while( i < res.length() ){
						int num = Integer.parseInt( res.charAt(i) + "" );
						if( !numSeen.contains( num ) ){
							numSeen.add( num );
						}
						i++;
					}
					
					j++;
				}
				System.out.println("Case #"+(k+1) + ": " + res);
			}
		}
	}
}

package methodEmbedding.Counting_Sheep.S.LYD1547;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class CountingSheep {

	public static void main(String[] args) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(reader.readLine());
		int currentCase = 1 ;
		while( currentCase <= cases ){
			int n = Integer.parseInt(reader.readLine());
			int i = 1;
			HashSet<Integer> digits = new HashSet<>();
			ArrayList<Long> results = new ArrayList<>();
			
			long result = 0, lastResult = 0;
			
			while( digits.size() != 10 ){
				ArrayList<Integer> currentDigits = new ArrayList<Integer>();
				result = n * i;
				if( results.contains(result) )
					break;
				else
					results.add(result);
				
				lastResult = result;
				while( result > 0 ){
					currentDigits.add( (int) result % 10 );
					result /= 10;
				}
				for( int digit : currentDigits )
					digits.add(digit);
				
				++i;
			}
			if( digits.size() == 10 )
				System.out.println("Case #" + currentCase + ": " + lastResult);
			else
				System.out.println("Case #" + currentCase + ": INSOMNIA");
			++currentCase;
		}
	}

}

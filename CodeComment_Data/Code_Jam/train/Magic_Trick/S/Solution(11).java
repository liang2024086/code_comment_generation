package methodEmbedding.Magic_Trick.S.LYD1231;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Solution {
	
	private Solution(){}
	
	public static void main(String[] args) throws IOException{
		String file = "C:/zfeng/A-small-attempt1.in";
		String output = "C:/zfeng/A-small-attempt1.out";
		BufferedReader content =  new BufferedReader(new FileReader(file));	
		PrintWriter outputFile = new PrintWriter(new FileWriter(output));
		
		int num_cases = Integer.parseInt( content.readLine() );
		
		HashMap<String, Integer> set = new HashMap<String,Integer>();
		
		for( int i = 1; i<=num_cases; i++ ){
			set.clear();
			int row1 = Integer.parseInt( content.readLine() );
			for( int k=1; k<row1; k++ )
				content.readLine();			
			String dataRow = content.readLine();
			String[] dataArray = dataRow.split(" ");
			for( int j=0; j<4; j++){
				set.put(dataArray[j], 0);
			}
			for( int k=row1+1; k<5; k++ )
				content.readLine();
			
			int row2 = Integer.parseInt( content.readLine() );
			for( int k=1; k<row2; k++ )
				content.readLine();			
			dataRow = content.readLine();
			dataArray = dataRow.split(" ");
			
			int overlap = 0;
			int value = 0;
			for( int j=0; j<4; j++){
				if( set.containsKey(dataArray[j])){
					overlap++;
					value = Integer.parseInt( dataArray[j] );
				}
			}
			for( int k=row2+1; k<5; k++ )
				content.readLine();
			
			if( overlap == 1 )
				outputFile.println( "Case #"+i+": " + value );
			else if ( overlap == 0 )
				outputFile.println( "Case #"+i+": Volunteer cheated!" );
			else
				outputFile.println( "Case #"+i+": Bad magician!" );
				
		}
		
		content.close();
		outputFile.close();		
	}
	
	
}

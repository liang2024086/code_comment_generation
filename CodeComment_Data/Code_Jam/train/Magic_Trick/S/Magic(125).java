package methodEmbedding.Magic_Trick.S.LYD497;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class Magic {
	public static void main(String[] args) {
		int tc;
		int answer1;
		int answer2;
		int[] firstRow = new int[4];
		int[] secondRow = new int[4];
		String[] fRow;
		String[] sRow;
		String result = null;
		PrintWriter writer;
		try(BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"))) {
			writer = new PrintWriter("A-small-attempt0.out", "UTF-8");
			tc = Integer.parseInt(br.readLine());
			for(int i = 0; i<tc; i++){
				answer1 = Integer.parseInt(br.readLine());
				for(int j=0; j<answer1-1;j++)
					br.readLine();
				fRow = br.readLine().split(" ");
				for(int j=0; j<fRow.length;j++)
					firstRow[j] = Integer.parseInt(fRow[j]);
				
				for(int j=0; j<4-answer1;j++)
					br.readLine();
				
				answer2 = Integer.parseInt(br.readLine());
				for(int j=0; j<answer2-1;j++)
					br.readLine();
				sRow = br.readLine().split(" ");
				for(int j=0; j<sRow.length;j++)
					secondRow[j] = Integer.parseInt(sRow[j]);
				for(int j=0; j<4-answer2;j++)
					br.readLine();
				
				boolean b = false;
				int count = 0;
				for(int j=0;j<firstRow.length;j++)
					for(int k=0;k<secondRow.length;k++)
						if(firstRow[j] == secondRow[k]){
							b=true;
							result = (new Integer(firstRow[j])).toString();
							count++;
						}
				if(count > 1)
					result = "Bad magician!";
				if(!b)
					result = "Volunteer cheated!";
				writer.println("Case #" + (i+1) + ": " + result );
				//System.out.println(answer1 + " " + Arrays.toString(firstRow) + " " + answer2 + Arrays.toString(secondRow));
			}
			writer.close();
	        	       
	    }
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
}

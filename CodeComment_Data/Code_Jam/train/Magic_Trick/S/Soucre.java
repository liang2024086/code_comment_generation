package methodEmbedding.Magic_Trick.S.LYD738;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RandomNumber {
	public static void main(String []args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\DELL\\Desktop\\A-small-attempt0.in")));
		String text ;
		int T = Integer.parseInt(br.readLine());
		BufferedWriter wr = new BufferedWriter(new FileWriter(new File("C:\\Users\\DELL\\Desktop\\A-small-attempt0.out")));
		int case1 = 1;
		while(T-->0)
		{
			int firstRow = Integer.parseInt(br.readLine());
		    int i =0;
			int [][]firstArrangement = new int[4][4];
			while(i<4)
			{
				text = br.readLine();
				String []texts = text.split("\\s+");
				int j =0;
				for(String key : texts){
					
					firstArrangement[i][j++] = Integer.parseInt(key);
				}
				i++;
			}
			int secondRow = Integer.parseInt(br.readLine());
			
			i =0;
			int [][]secondArrangement = new int[4][4];
			while(i<4)
			{
				text = br.readLine();
			
				String []texts = text.split("\\s+");
			
				int j =0;
				for(String key : texts){
					secondArrangement[i][j++] = Integer.parseInt(key);
				}
				i++;
			}
			int result = -1;
			int number = 0;
			for(int j =0; j<4; j++)
			{
				for(int k =0; k<4; k++)
				{
					if(result==-1&&firstArrangement[firstRow-1][k]==secondArrangement[secondRow-1][j])
					{
						result=1;
						number = firstArrangement[firstRow-1][k];
					}
					else if(firstArrangement[firstRow-1][k]==secondArrangement[secondRow-1][j])
						result =2;
				}
				
			}
			String output ="";
			
			switch(result)
			{
			case -1:
				output = "Case #"+Integer.toString(case1++)+": Volunteer cheated!";
				break;
			case 1:
				output = "Case #"+Integer.toString(case1++)+": "+Integer.toString(number);
				break;
			case 2:
				output = "Case #"+Integer.toString(case1++)+": Bad magician!";
				break;
			}
			wr.append(output+System.getProperty("line.separator"));
		}
		
		wr.flush();
		wr.close();
	}
}

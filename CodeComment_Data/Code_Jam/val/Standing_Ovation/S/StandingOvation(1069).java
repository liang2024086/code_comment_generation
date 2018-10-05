package methodEmbedding.Standing_Ovation.S.LYD537;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class StandingOvation {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt1.in")));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		PrintWriter pw = new PrintWriter(new File("A-small-attempt1.out"));
		
		for(int i = 0; i<t; i++)
		{
			String[] spl = br.readLine().split(" ");
			
			int max = Integer.parseInt(spl[0]);
			
			int people = 0;
			
			int friends = 0;
			
			for(int j = 0; j<max+1; j++)
			{
				int actual = Integer.parseInt(""+spl[1].charAt(j));
				
				if(actual > 0 && people <j)
				{
					while(people < j)
					{
						friends++;
						people++;
					}
					people += actual;
					
				}
				else{
					people += actual;
				}
				
			}
			
			pw.println("Case #"+(i+1)+": "+friends);
			System.out.println("Case #"+(i+1)+": "+friends);
		}
		pw.close();
	}

}

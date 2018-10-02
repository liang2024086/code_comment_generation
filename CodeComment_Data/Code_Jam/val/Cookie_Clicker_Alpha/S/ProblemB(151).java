package methodEmbedding.Cookie_Clicker_Alpha.S.LYD381;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProblemB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();//Start time
		try {
			BufferedReader in = new BufferedReader(new FileReader("B-small-attempt0.in"));
			String line = null;
			line = in.readLine();			
			double C = 0;
			double F = 0;
			double X = 0;
			double r = 0;//rate
			double t = 0;//time
			double t_min = 0;
			int k=0;
			int T = Integer.parseInt(line);
			for(int i=0;i<T;i++){				
				line = in.readLine();
				String [] tokens = line.split(" ");
				C = Double.parseDouble(tokens[0]);
				F = Double.parseDouble(tokens[1]);
				X = Double.parseDouble(tokens[2]);
				k=1;
				r=2;
				t=0;
				t_min=X/r;
				while(true){
					r=2;
					t=0;
					for (int j=0;j<k;j++){
						t=t+C/r;
						r=r+F;
					}
					t=t+X/r;
					if (t<t_min){
						k++;
						t_min=t;
					} else{
						break;
					}
				}				
				System.out.println("Case #" + (i+1) +": " + t_min);				
			}
			in.close();			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
		long endTime=System.currentTimeMillis();//End time
		//System.out.println("Running time for evaluation is "+(endTime-startTime)+"ms");
	}
}

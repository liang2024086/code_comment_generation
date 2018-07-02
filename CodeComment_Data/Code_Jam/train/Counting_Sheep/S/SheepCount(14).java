package methodEmbedding.Counting_Sheep.S.LYD1240;


import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SheepCount {

	  /**
     * @param args the command line arguments
     */
     static int k=1;
     static PrintWriter out;
     
     

	public static void main(String[] args)throws IOException{
		    File f = new File("src/A-small-attempt2.in");
			File o = new File("src/A-small-attempt2.out");
			String strLine=null;

			BufferedReader br = new BufferedReader(new FileReader(f));
			out = new PrintWriter(new FileWriter(o));

			strLine = br.readLine();
			
			long T=Long.parseLong(strLine);
           
                      
      

		for (long i = 1; i <= T; i++) {

			String nextLine = br.readLine();
			long N = Long.parseLong(nextLine);
	
			TreeSet<Integer> ts = new TreeSet<Integer>();

			int t = 1;
			if (N == 0) {
				 out.write("Case #" + i +": INSOMNIA\n");
		    
			} else {
				while (ts.size() != 10) {
					long temp = t * N;
					int length = (int) (Math.log10(temp) + 1);
					for (int j = 1; j <= length; j++) {
						int k = (int) (temp % 10);
						ts.add(k);
						temp = (long) (temp / 10);
					}
					t++;
				}
		          out.write("Case #" + i +": "+(t - 1) * N+"\n");
				
			}
			
		}
		br.close();
		out.close();
	}

}

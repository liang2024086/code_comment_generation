package methodEmbedding.Standing_Ovation.S.LYD600;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class One {
	public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
		*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	String testrow = br.readLine();
        	String[] tests=testrow.split(" ");
        	String[] audiences=tests[1].split("");
        	
        	int friends=0;
        	int total=0;
        	
        	for(int j=0;j<audiences.length;j++)
        	{
        		int aud=Integer.parseInt(audiences[j]);
        		//System.out.println(">"+aud+"<");
        		while(total<j)
        		{
        			friends++;
        			total++;
        		}
        		total+=aud;
        	}
        	System.out.println("Case #"+(i+1)+": "+friends);
        }
	}
}

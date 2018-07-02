package methodEmbedding.Cookie_Clicker_Alpha.S.LYD720;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class QualiQ2 {

	public static void main(String[] args) {
	    try {
	    	String question = "Q2/B-small-Attempt0";
		    BufferedReader br = new BufferedReader(new FileReader("/Users/arieslam/Documents/workspace/testjava/Quali/"+question+".in"));
		    BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/arieslam/Documents/workspace/testjava/Quali/"+question+".out"));

		    //Close writer
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        int t = Integer.parseInt(line);
	        DecimalFormat df = new DecimalFormat("#.#######");
	        
	        for (int i=0;i<t;i++){
//            	System.out.println("CASE");
	            line = br.readLine();
	            double c,f,x;
	            StringTokenizer st = new StringTokenizer(line);
	            c = Double.parseDouble(st.nextToken());
	            f = Double.parseDouble(st.nextToken());
	            x = Double.parseDouble(st.nextToken());
	            double currentSecond = x / 2;
//            	System.out.println("CurrentSecond:"+currentSecond);
	            double farmSecond = c / 2;
//            	System.out.println("FarmSecond:"+farmSecond);
	            double newf = f+2;
//            	System.out.println("newf:"+newf);
	            double expectedSecond = farmSecond+x/newf;
//            	System.out.println("ExpectedSecond:"+expectedSecond);
	            while (expectedSecond < currentSecond){
//	            	System.out.println(expectedSecond+","+currentSecond);
	            	currentSecond = expectedSecond;
	            	farmSecond += c / newf; 
	            	newf += f;
	            	expectedSecond = farmSecond + x/newf;
	            }
	            
	            
            	writer.write("Case #"+(i+1)+": "+df.format(currentSecond));
			    writer.newLine();
	        }

//	        while (line != null) {
//	        }
	        br.close();
		    writer.close();
	    } catch (IOException e) {
			e.printStackTrace();
		} finally {
	    }
	}

}

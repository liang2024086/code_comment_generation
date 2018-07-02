package methodEmbedding.Cookie_Clicker_Alpha.S.LYD851;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Cookie {
		public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new FileReader("src/orteil/input.in"));
			FileWriter writer = new FileWriter(
					new File("src/orteil/output.txt"));
	        int $case = Integer.parseInt(br.readLine());
	    	String newline = "";
	    	double c,f,x,time;
			String out;
	        for(int i=1;i<=$case;i++){
	        	time = 0.0;
	        	String[] line = br.readLine().trim().split(" ");
	        	c = Double.parseDouble(line[0]);
	        	f = Double.parseDouble(line[1]);
	        	x = Double.parseDouble(line[2]);
	        	int j=0;
	        	int k = (int) Math.floor((f*x-c*f-2*c)/(c*f));
	        	for(j=0;j<=k;j++){
	        		time += c/(2+j*f); 
	        	}
	        	time += x/(2+j*f);
	        	out = (new DecimalFormat("#.0000000")).format(time);
	        	if(i>1)
	        		newline="\n";
	        	writer.write(newline+"Case #" +i+": "+out);
	        	writer.flush();
	        }
	        br.close();
	        writer.close();
		}
}

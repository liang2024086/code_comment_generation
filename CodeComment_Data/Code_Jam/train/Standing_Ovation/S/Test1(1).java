package methodEmbedding.Standing_Ovation.S.LYD881;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.sun.xml.internal.ws.util.StringUtils;


public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in
		   = new BufferedReader(new FileReader("D://A-small-attempt2.in"));
		PrintWriter out
		   = new PrintWriter(new BufferedWriter(new FileWriter("D://A-small-attempt2.out")));

		String line = null;
		int caseCounter = 1;
		boolean ignoreFirstLine = true;
		int totalCases = 0;
		while( (line = in.readLine()) != null)
		{
			int req = 0;
			if(ignoreFirstLine)
			{
				ignoreFirstLine = false;
				totalCases = Integer.parseInt(line);
				continue;
			}
			line = line.trim();			
			long startPoint = Long.parseLong(line.split(" ")[0]);
			String t = line.split(" ")[1];
			//System.out.println(t.charAt(0));
			int count =  Integer.parseInt(Character.toString(t.charAt(0)));
			for(int i=1;i<t.length();i++){
				//System.out.println(i+">"+count);
				if(i>count && Integer.parseInt(Character.toString(t.charAt(i))) !=0){
					//System.out.println("inif");
					req = req + (i-count);
					count = count + (i-count) + Integer.parseInt(Character.toString(t.charAt(i)));
					
				}else{
					count = count + Integer.parseInt(Character.toString(t.charAt(i)));
				}
			}
			//System.out.println(req);
			
			/*String total = line.split(" ")[1];
			if(total.length() != (startPoint+1)){
				System.out.println("invalid");
			}
			int occurance = total.length() - total.replace("0", "").length();
			*/
			out.write("Case #" + Integer.toString(caseCounter) + ": " + req + "\n");
			caseCounter ++;
			
		}
		in.close();
		out.flush();
		out.close();
		System.out.println("total cases done");
		
}
	

}

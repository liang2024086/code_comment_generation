package methodEmbedding.Cookie_Clicker_Alpha.S.LYD713;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;





public class CookieClicker {
	
	public static void main(String args[])
	  {
	  try{
	 
		  FileInputStream fstream = new FileInputStream("B-small.in");
		  DataInputStream in = new DataInputStream(fstream);
		  BufferedReader br = new BufferedReader(new InputStreamReader(in));
		  
		  BufferedWriter bw = new BufferedWriter(new FileWriter(new File("B-small.out"), true));
		  int cases = Integer.parseInt(br.readLine());
		 
		 
		  
		  
		  // Treat case loop
		  for(int i=0;i<cases;i++){
			  
			  double out = 0 ;
			  
			  String[] line = br.readLine().split(" ");
			  Double c = Double.parseDouble(line[0]);
			  Double f = Double.parseDouble(line[1]);
			  Double x = Double.parseDouble(line[2]);
			  
			  double if_we_buy = 0, if_we_dont_buy, increment = (double) 2.0, current_cookies = 0;
			  boolean stop = false;
			  double secs = 0;
			  while(!stop)
			  {
				 if(x == increment){
					 secs=(double) 1.000000;
					 stop = true;
				 }
				 else{
					 double next_farm_in = c/increment;
					 if_we_dont_buy = (double) ((x-current_cookies)/increment);
					 if_we_buy = (double) (next_farm_in + ((x-current_cookies) / (increment + f)));
					 
					 if(if_we_buy < if_we_dont_buy){
						 //buy farm
						 secs +=next_farm_in;
						 current_cookies += next_farm_in*increment;
						 current_cookies -= c;
						 increment += f;
					 }
					 else{
						 double t =(x-current_cookies)/increment;
						 secs += t;
						 stop = true;
					 }
				 }
			  }
			  DecimalFormatSymbols fts = new DecimalFormatSymbols();
			  fts.setDecimalSeparator('.');
			  DecimalFormat form = new DecimalFormat("0.0000000", fts);
			  out = secs;
			  
			  bw.write("Case #"+(i+1)+": "+form.format(out));
              bw.newLine();
			  System.out.println("Case #"+(i+1)+": "+form.format(out));
						
			  
			  
		  } // EOF Cases
		  
		  bw.close();	
		  in.close();
	    }catch (Exception e){
	    	System.err.println("Error: " + e.getMessage());
	  }
	  }
	
}

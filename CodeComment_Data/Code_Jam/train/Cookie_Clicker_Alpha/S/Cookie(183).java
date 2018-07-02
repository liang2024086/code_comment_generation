package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1393;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class Cookie {
	public static void main(String[] args) {
        //reading file line by line in Java using BufferedReader       
        FileInputStream fis = null;
        BufferedReader reader = null;
        try {
            fis = new FileInputStream("F:/B-small-attempt0.in");
            reader = new BufferedReader(new InputStreamReader(fis));
          
            System.out.println("Reading File line by line using BufferedReader");
            int totalCases = Integer.parseInt(reader.readLine().toString());

            String testcase = null;
            BufferedWriter out = new BufferedWriter(new FileWriter("F:/output.txt"));
            DecimalFormat df = new DecimalFormat("0.0000000");
            double c = 0.0d;
            double f = 0.0d;
            double x = 0.0d;

            for (int i=0 ; i<totalCases ; i++){
                double currentRate = 2.0d;
                double ifBuyPrev = 0.0d;
                double totalFinal = 0.0d;
                double totalFinalPrev = 0.0d;
                
            	testcase = reader.readLine();
            	String[] list = testcase.split(" ");
            	c =  Double.parseDouble(list[0]);
            	f =  Double.parseDouble(list[1]);
            	x =  Double.parseDouble(list[2]);
            	
            	System.out.println("c f x are : " + c + " - "+ f + " - "+ x );
            	
            	double tc = c/currentRate;
            	double tx = x/currentRate;
            	//List<String> strings = Arrays.asList(list);
            	//List<Double> totalTime = new ArrayList<Double>();
            	totalFinalPrev = x/2.0d;
            	boolean first = true;
            	System.out.println("TotalFinal"+totalFinal);
            	System.out.println("totalFinalPrev"+totalFinalPrev);
            	ifBuyPrev = tc;
            	while((totalFinalPrev > totalFinal || first)){
                	if(!first){
                		totalFinalPrev = totalFinal;
                	}
                  	System.out.println("ifBuyPrev"+ifBuyPrev);
            		first = false;
            		currentRate = currentRate + f;
            		tc = c/currentRate;
            		tx = x/currentRate;
                	totalFinal = ifBuyPrev + tx;
                	ifBuyPrev = ifBuyPrev + tc;
                	System.out.println("TotalFinal"+totalFinal);
                	System.out.println("totalFinalPrev"+totalFinalPrev);

            	}
                out.write("Case #"+(i+1)+": "+df.format(totalFinalPrev) + "\n");
            }
            out.close();

        } catch (FileNotFoundException ex) {
        	System.out.print("File not found");
        } catch (IOException ex) {	
        	System.out.print("IO Exception");
        }
	}
}

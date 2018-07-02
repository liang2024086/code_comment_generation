package methodEmbedding.Cookie_Clicker_Alpha.S.LYD890;


import java.io.*;

public class CJamB {

    public static void main(String[] args) throws IOException {	 
    	File file = new File("src/inputB.txt");
    	PrintWriter pw = new PrintWriter("src/outputB.txt");
      
    	FileReader fr = new FileReader(file);
    	BufferedReader r = new BufferedReader(fr);
    	
    	int T = Integer.parseInt(r.readLine());  
    	
    	for (int i = 0; i < T; i++){
    		double result = 0;
    		String line = r.readLine();
    		String[] str = line.split(" ");
    		double C = Double.parseDouble(str[0]);
    		double F = Double.parseDouble(str[1]);
    		double X = Double.parseDouble(str[2]);
    		double rate = 2;
    		while (true){
    			if (X/rate < C/rate + X/(rate+F)){
    				result += X/rate;
    				break;
    			}
    			result += C/rate;
    			rate += F;
    		}
    		pw.println("Case #"+(i+1)+": "+result);
    		pw.flush();
    	}
    	pw.close();
    	r.close();
    }
}

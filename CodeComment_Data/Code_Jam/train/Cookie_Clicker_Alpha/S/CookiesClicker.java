package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1364;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookiesClicker {

	public static void main(String[] args){

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    try {
	    	
	    	s = in.readLine();
	    	int case_num = Integer.parseInt(s);
	    	for (int k = 0; k < case_num; k++) {
	    		s = in.readLine();
	    		//System.out.println(s);
	    		
	    		String[] spl = s.split(" ");
	    		
	    		double c = Double.parseDouble(spl[0]);
	    		double f = Double.parseDouble(spl[1]);
	    		double x = Double.parseDouble(spl[2]);
	    			
	    		int i = 0;
	    		
	    		double old_time = 999999999.0;
	    		
	    		while (true) {
	    			
	    			double time = 0.0f;
	    			double extra_rate = 0;
	    			
	    			for (int j = 0; j < i; j++) {
	    				time = time + c / (2+extra_rate);
	    				extra_rate+=f;
	    			}
	    			
	    			time = time + x/(2+extra_rate);
	    			
	    			if (time<old_time) {
	    				old_time = time;
	    			}
	    			
	    			if (time>old_time) {
	    				//old_time = time;
	    				break;
	    			}
	    			
	    			//System.out.println(i+" "+time);
	    			
	    			i++;
	    		}
	    		
	    		System.out.println("Case #"+(k+1)+": "+old_time);
			}
	    	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
}

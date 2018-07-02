package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1475;

import java.io.BufferedReader;
import java.io.FileReader;


class Cookie {
	
	
	
	
    public static void main(String args[] ) throws Exception {
       
	try{
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
        	String tests=br.readLine();
        	String[] inputs = tests.split(" ");
        	double c=Double.parseDouble(inputs[0]);
        	double f=Double.parseDouble(inputs[1]);
        	double x=Double.parseDouble(inputs[2]);
        	double ans = 0;
			double currate = 2;
			while(true)
			{
				double stay = x/currate;
				double getnew = c/currate + x/(currate + f);
				//System.out.println(a + " " + ans + " " + stay + " " + getnew);
				if(stay < getnew)
				{
					ans += stay;
					break;
				}
				else
				{
					ans += c/currate;
					currate += f;
				}
			}
			System.out.print("Case #" + (i+1) + ": " );
			System.out.format("%.7f%n", ans);
        }
		
		
		
		
        
       
	}catch(Exception e){
		e.printStackTrace();
	}
       
    }

	

	
   
}

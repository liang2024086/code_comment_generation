package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1062;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.FileWriter;
public class Cookie {

	
	public static void main(String[] args)throws IOException {
		
		try{
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		File file=new File("./cookie.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter out = new BufferedWriter(fw);
		
		int T=Integer.parseInt(in.readLine());
		for(int i=1; i<=T;i++)
		{
				String [] in_ar=in.readLine().split(" ");
				
				double C=Double.parseDouble(in_ar[0]);
				double F=Double.parseDouble(in_ar[1]);
				double X=Double.parseDouble(in_ar[2]);
				
				double time=0, rate=2.0, no=0, temp_no, temp_rate, est1, est2;
				 while(true)
				 {
					 time=time+(C/rate);
					 
					 //at this new time 
					 no+=C;
					 
					 //choice 1
					 temp_no=no-C;
					 temp_rate=rate+F;
					 est1=(X-temp_no)/temp_rate;
					 est2=(X-no)/rate;
					 if(est1<est2)
					 {
						 no=temp_no;
						 rate=temp_rate;
					 }
					 else
					 {
						 time+=(X-no)/rate;
						 break;
					 }
						 
					 
				 }
				 out.write("Case #"+i+": "+String.format("%.7f", time));
				 out.newLine();
				
			
		}
		
		in.close();
		out.close();
		
		}catch(IOException e)
		{
			
		}
		
	}
}

package methodEmbedding.Standing_Ovation.S.LYD721;

import java.io.*;
import java.text.*;

public class StandingOvation {

	public static void main(String[] args) {

		try {

			FileReader Reader = new FileReader("input.txt");
			BufferedReader Input = new BufferedReader(Reader);
			PrintWriter PW = new PrintWriter("output.txt", "UTF-8");
			int T,Smax,sls,i1,i2,TotalStandingGuests,NumReqGuest;
			String Str1;
			String[] Str2, Str3;

			T = Integer.parseInt(Input.readLine());
			

			for (i1 = 1; i1 <= T; i1++) {

				Str1 = Input.readLine();
			    Str1 = Str1.trim();
			    Str2 = Str1.split("\\s+");
				
			    Smax = Integer.parseInt(Str2[0]);
			    
				if (Smax==0){
					
					PW.println("Case #"+i1+": 0");
				    continue;

				}
				
			    sls=Str2[1].length();
				Str3 = Str2[1].split("");
				int []slevels=new int [sls];
				
				NumReqGuest=0;
				TotalStandingGuests=slevels[0]=Integer.parseInt(Str3[1]);
				
				for (i2 = 1; i2 <sls; i2++) {
					
					slevels[i2]=Integer.parseInt(Str3[i2+1]);
					
					if (i2>TotalStandingGuests){
						
						NumReqGuest+=i2-TotalStandingGuests;
						
						TotalStandingGuests=i2;
					}
						
					TotalStandingGuests+=slevels[i2];
					
				}
				

				PW.println("Case #"+i1+": " + NumReqGuest);
			}

			Input.close();
			PW.close();

		}

		catch (IOException e) {

			e.printStackTrace();
		}

	}

}

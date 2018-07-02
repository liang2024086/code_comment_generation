package methodEmbedding.Standing_Ovation.S.LYD702;

import java.io.*;
import java.util.Arrays;

class Test
{
	public static void main(String [] args)
	{
		
		try
		{
			FileReader fr = new FileReader("A-small-attempt1.in");
			FileWriter fw = new FileWriter("output.txt");
			BufferedReader in = new BufferedReader(fr);
			BufferedWriter out = new BufferedWriter(fw);
			
			int cases = Integer.parseInt(in.readLine());
			if((cases<=100)&&(cases>=1)){
				for(int i=0;i<cases;i++){
					String [] s = in.readLine().split(" ");
					int D = Integer.parseInt(s[0]);
					char [] c = s[1].toCharArray();
					int [] aud = new int[D+1];
					int j = 0;
					for(char a : c){
						aud[j++] = Integer.parseInt(""+a);
					}
					if((D<=6)&&(D>=0)){
						int friend = 0;
						int stand = 0;
						for(int k=0;k<=D;k++){
							if(stand>=k){
								stand += aud[k];
							}
							else
							if(aud[k]==0){
								continue;
							}
							else{
								friend += (k-stand);
								stand += (aud[k]+friend);
							}
						}
						out.write("Case #"+(i+1)+": "+friend);
						out.newLine();
					}
				}
			}
			
			out.close();
		}
		catch(Exception ex)
		{
			System.out.println("Some Error");
		}
		
	}
	
}

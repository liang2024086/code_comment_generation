package methodEmbedding.Cookie_Clicker_Alpha.S.LYD692;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Cookies {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int t=Integer.parseInt(br.readLine());
			String sa=null;
			int k=1;
		while((sa=br.readLine())!=null&& sa!="")
			{
				
				
					
				String[] s=sa.split("\\s");
				
				double c=Double.parseDouble(s[0]);
				double f=Double.parseDouble(s[1]);
				double x=Double.parseDouble(s[2]);
				
				ArrayList<Double> ans=new ArrayList<Double>();
				ans.add(x/2);
				double z=2;
				double temp=0.0;
				int j=0;
				while(true)
				{
					ans.add(j,temp+(x/z));
					if(j>0&&ans.get(j)>ans.get(j-1))
						break;
					temp=temp+c/z;
					j=j+1;
					z=z+f;
				}
				
				System.out.println("Case #"+k+": "+ans.get(j-1));
				k++;
				if(k>t)
					break;
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

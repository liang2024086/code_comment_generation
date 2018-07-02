package methodEmbedding.Standing_Ovation.S.LYD1305;

import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("C:\\Users\\xn\\Desktop\\A-small-attempt0.in");
		FileWriter fout = new FileWriter("C:\\Users\\xn\\Desktop\\A-small-attempt0.out");
		BufferedReader bw = new BufferedReader(new InputStreamReader(fin));
		String str = bw.readLine();
		int t = Integer.parseInt(str);
		int Smax;
		int stand;
		int m;
		int ans;
		int add;
		
		for(int i = 1; i <= t; i++)
		{
			ans = 0;
			stand = 0;
			add = 0;
			str = bw.readLine();
			String s[] = str.split(" ");
			
			//System.out.println(s[0]+" "+s[1]);
			
			Smax = Integer.parseInt(s[0]);
			stand = s[1].charAt(0)-'0';//shyness level is 0
		
			for(int j = 1; j <= Smax;j++){
				
				m = s[1].charAt(j)-'0';
				
				if(stand < j && m > 0){
					add = (j - stand);
					stand += (add + m);
					ans += add;
				}
				else{
					stand += m; 
				}	
			}
			
			//System.out.println(ans);
			fout.write("Case #"+i+": "+ans+"\n");
		}
		bw.close();
		fout.close();
		fin.close();
	}

}

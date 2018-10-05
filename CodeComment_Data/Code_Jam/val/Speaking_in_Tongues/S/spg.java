package methodEmbedding.Speaking_in_Tongues.S.LYD262;

import java.io.*;

public class spg {
	public static void main(String args[]) throws Exception{
		char map[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		FileInputStream fs = new FileInputStream("in.txt");
	    DataInputStream in = new DataInputStream(fs);
	    BufferedReader br=new BufferedReader(new InputStreamReader(in));
		String str,res;
		FileWriter fstream = new FileWriter("out.txt");
		BufferedWriter out = new BufferedWriter(fstream);
		int no=Integer.parseInt(br.readLine());
		for(int i=0;i<no;i++){
			str=br.readLine();
			res="";
			int strlen=str.length();
			int t=i+1;
			out.write("Case #"+t+": ");
			for(int j=0;j<strlen;j++)
			{
				if(str.charAt(j)!=' ')
				res+=map[(int)(str.charAt(j))-97];
				else
				res+=' ';
			}
			out.write(res);
            out.newLine();
		}
		out.close();
		br.close();
	}
	
}

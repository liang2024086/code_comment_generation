package methodEmbedding.Cookie_Clicker_Alpha.S.LYD979;


import java.io.*;
import java.nio.charset.Charset;

public class Unsd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in=new FileInputStream("c:\\input\\sample.in");
		BufferedReader br=new BufferedReader(new InputStreamReader(in,Charset.forName("UTF-8")));
		PrintWriter writer = new PrintWriter("c:\\input\\output.txt", "UTF-8");
		String line;
		br.readLine();
		for(int i=1;(line=br.readLine())!=null;i++){
			if(line.trim().equals(""))break;
			String[] a=line.split(" ");
			double[] z={Double.parseDouble(a[0]),Double.parseDouble(a[1]),Double.parseDouble(a[2])};
			/*C,F,X*/
			if(z[0]>=z[2]){
				writer.println("Case #"+i+": "+(z[2]/2));
				continue;
			}
			double prev=z[2]/2;
			for(int q=1;;q++){
				double v=0;
				for(int w=0;w<q;w++)v+=1/(2+w*z[1]);
				v*=z[0];
				v+=z[2]/(2+q*z[1]);
				if(prev!=-1 && prev<v)break;
				prev=v;
			}
			writer.println("Case #"+i+": "+prev);
		}
		writer.close();
		br.close();
	}

}

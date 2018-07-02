package methodEmbedding.Magic_Trick.S.LYD78;

import java.io.*;

public class ans1{
	public static void main(String args[])throws IOException{
		String input="A-small-attempt0.in";
		String output="output1.txt";
		File f=new File(input);
		FileInputStream fis=new FileInputStream(f);
		BufferedReader in=new BufferedReader(new InputStreamReader(fis));
		PrintWriter out=new PrintWriter(new FileWriter(output));
		int t=Integer.parseInt(in.readLine());
		int[][] a,b;
		int a1,a2,as,bs=0,k=1;
		String s[];
		String c;
		while(k<=t){
			as=0;
			c="";
			a=new int[4][4];
			a1=Integer.parseInt(in.readLine().trim());
			for(int i=0;i<4;i++){
				s=in.readLine().trim().split(" ");
				for(int j=0;j<4;j++){
					a[i][j]=Integer.parseInt(s[j]);
				}
			}
			b=new int[4][4];
			a2=Integer.parseInt(in.readLine().trim());
			for(int i=0;i<4;i++){
				s=in.readLine().trim().split(" ");
				for(int j=0;j<4;j++){
					b[i][j]=Integer.parseInt(s[j]);
				}
			}
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(a[a1-1][i]==b[a2-1][j]){
						as++;
						bs=a[a1-1][i];
						break;
					}
				}
			}
			if(as==1){
				c+=bs;
			}
			else if(as==0){
				c+="Volunteer cheated!";
			}
			else c+="Bad magician!";
			out.println("Case #"+k+": "+c);
			k++;
		}
		out.close();
	}
}

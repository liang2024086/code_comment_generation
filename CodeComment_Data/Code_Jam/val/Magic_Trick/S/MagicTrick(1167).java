package methodEmbedding.Magic_Trick.S.LYD1719;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader(new File("in")));
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File("out")));
		StringTokenizer st;
				
		int T=Integer.parseInt(br.readLine());
		for(int cn=1;cn<=T;cn++){
			boolean pos[]=new boolean[17];
			int a=Integer.parseInt(br.readLine());
			String line[]=new String[4];
			for(int i=0;i<4;i++){
				line[i]=br.readLine();
			}
			st=new StringTokenizer(line[a-1]);
			for(int i=0;i<4;i++){
				int b=Integer.parseInt(st.nextToken());
				pos[b]=true;
			}
			
			int ans=-1;
			a=Integer.parseInt(br.readLine());
			line=new String[4];
			for(int i=0;i<4;i++){
				line[i]=br.readLine();
			}
			st=new StringTokenizer(line[a-1]);
			for(int i=0;i<4;i++){
				int b=Integer.parseInt(st.nextToken());
				if(pos[b]){
					if(ans==-1)
						ans=b;
					else
						ans=-2;
				}
			}
			
			
			
			System.out.println();
			bw.append("Case #"+cn+": ");
			if(ans==-1)
				bw.append("Volunteer cheated!\n");
			else if (ans==-2)
				bw.append("Bad magician!\n");
			else
				bw.append(ans+"\n");
		}
		bw.flush();

	}

}

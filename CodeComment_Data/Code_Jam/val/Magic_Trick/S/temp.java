package methodEmbedding.Magic_Trick.S.LYD1122;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
class temp {
	public static void main(String args[]) throws IOException {
		try{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stz = new StringTokenizer(bf.readLine());
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(stz.nextToken()),k=1;
		File f=new File("out.txt");
		FileWriter fw=new FileWriter(f);
		while(k<=t){
			Set<Integer> s=new TreeSet<Integer>();
			int n1,n2,ar1[][]=new int[4][4],ar2[][]=new int[4][4],i,j;
			stz = new StringTokenizer(bf.readLine());
			n1=Integer.parseInt(stz.nextToken());
			for(i=0;i<4;i++){
				stz=new StringTokenizer(bf.readLine());
				for(j=0;j<4;j++){
					ar1[i][j]=Integer.parseInt(stz.nextToken());
					if(i+1==n1)
						s.add(ar1[i][j]);
					}
			}
			stz = new StringTokenizer(bf.readLine());
			n2=Integer.parseInt(stz.nextToken());
			int ans=-1;
			for(i=0;i<4;i++){
				stz=new StringTokenizer(bf.readLine());
				for(j=0;j<4;j++){
					ar2[i][j]=Integer.parseInt(stz.nextToken());
					if(i+1==n2){
						if(s.contains(ar2[i][j]))
							ans=ar2[i][j];
						else
							s.add(ar2[i][j]);
						
						}
				}
			}
			int len=s.size();
			if(len==8)
				fw.write("Case #"+k+": Volunteer cheated!\n");
			else if(len==7)
				fw.write("Case #"+k+": "+ans+"\n");
			else
				fw.write("Case #"+k+": Bad magician!\n");
			k++;
		}
		fw.close();
		}
		catch(Exception e){
			
		}
	}
}

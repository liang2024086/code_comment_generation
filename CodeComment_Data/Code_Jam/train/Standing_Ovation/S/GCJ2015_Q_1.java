package methodEmbedding.Standing_Ovation.S.LYD1451;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class GCJ2015_Q_1 {
	public static void main (String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));
		BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
		String line="";
		int num=Integer.parseInt(in.readLine());
		StringTokenizer s;
	
		for (int i=0;i<num;i++){
			int count = 0;
			int friends = 0;
			line = in.readLine();
			s = new StringTokenizer( line, " " );
			int Smax = Integer.parseInt(s.nextToken());
			String temp = s.nextToken();
			int[] Slist=new int[Smax+1];
			for (int j=0;j<Smax+1;j++){
				Slist[j]=Integer.parseInt(temp.substring(j,j+1));
			}
			
			if (Slist.length!=0){
				count+=Slist[0];
				for (int j=1;j<Smax+1;j++){
					if (Slist[j]!=0){
						if (count<j){
							friends+=j-count;
							count+=Slist[j]+friends;
						}
						else{
							count+=Slist[j];
						}
					}
				}
			}
			//System.out.println(friends);
			out.write("Case #"+(i+1)+": "+friends);
			out.newLine();
			
		}
		in.close();
		out.close();
		
	}
}

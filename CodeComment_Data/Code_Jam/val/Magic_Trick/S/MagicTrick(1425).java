package methodEmbedding.Magic_Trick.S.LYD1684;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class MagicTrick {
	public static void main(String[] args) throws Throwable {
		BufferedReader f = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new FileWriter("magic.txt"));
		StringBuilder str=new StringBuilder();
		while(f.ready()){
			str.append(f.readLine()+" ");
		}
		StringTokenizer st = new StringTokenizer(str.toString());
		int numdo=Integer.parseInt(st.nextToken());
		for(int numbercas=0; numbercas<numdo;numbercas++){
			int fl=Integer.parseInt(st.nextToken())-1;
			int[][] sit={{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())},{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())},{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())},{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())}};
			int[] fi=sit[fl];
			fl=Integer.parseInt(st.nextToken())-1;
			int[][] site={{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())},{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())},{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())},{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())}};
			int[] fie=site[fl];
			ArrayList<Integer> num=new 	ArrayList<Integer>();
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(fi[i]==fie[j]){
						fi[i]=17;
						num.add(fie[j]);
					}
				}
			}
			String s="Case #"+(numbercas+1)+": ";
			if(num.size()==1){
				s+=num.get(0);
			}else if(num.size()==0){
				s+="Volunteer cheated!";
			}else{
				s+="Bad magician!";
			}
			System.out.println(s);
			out.println(s);
		}
		out.close();	
	}

}


package methodEmbedding.Magic_Trick.S.LYD658;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MagicTrick {
	
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int t=Integer.parseInt(br.readLine());
			for (int i = 0; i < t; i++) {
				ArrayList<String []> aux1=new ArrayList<String[]>();
				ArrayList<String []> aux2=new ArrayList<String[]>();
				int s1=Integer.parseInt(br.readLine());
				for (int j = 0; j < 4; j++) {
					aux1.add(br.readLine().split(" "));
				}
				int s2=Integer.parseInt(br.readLine());
				for (int j = 0; j < 4; j++) {
					aux2.add(br.readLine().split(" "));
				}
				String [] r1=aux1.get(s1-1);
				String [] r2=aux2.get(s2-1);
				int res=0;
				String res2="";
				
				for (int j = 0; j < r1.length; j++) {
					for (int j2 = 0; j2 < r2.length; j2++) {
						if(r1[j].equals(r2[j2])){
							res++;
							res2=r1[j];
						}
					}
				}
				
				if(res==1)
					System.out.println("Case #"+(i+1)+": "+res2);
				if(res>1)
					System.out.println("Case #"+(i+1)+": Bad magician!");
				if(res==0)
					System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

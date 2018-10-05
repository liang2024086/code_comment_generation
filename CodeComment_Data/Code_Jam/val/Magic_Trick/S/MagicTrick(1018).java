package methodEmbedding.Magic_Trick.S.LYD2086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MagicTrick {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(in.readLine());
		int caso=1;
		while(n-->0){
			String row1[]=new String[4];
			int row=Integer.parseInt(in.readLine());
			for (int i = 0; i < 4; i++) 
				if(i+1==row) row1=in.readLine().split(" ");
				else in.readLine();
				
			row=Integer.parseInt(in.readLine());
			String row2[]=new String[4];;
			for (int i = 0; i < 4; i++) 
				if(i+1==row) row2=in.readLine().split(" ");
				else in.readLine();
			
			ArrayList<String> common=new ArrayList<String>();
			for (int i = 0; i < row1.length; i++) 
				for (int j = 0; j < row2.length; j++) 
					if(row1[i].equals(row2[j]))
						common.add(row1[i]);
				
			
			if(common.size()==1)
				System.out.println("Case #"+caso+": "+common.get(0));
			else
				if(common.size()>1)
					System.out.println("Case #"+caso+": Bad magician!");
				else
					System.out.println("Case #"+caso+": Volunteer cheated!");
			caso++;
		}
	}
}

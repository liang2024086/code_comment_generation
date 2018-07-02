package methodEmbedding.Magic_Trick.S.LYD291;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class classnew {
	public static void main (String[] args) throws IOException{
		Scanner s = new Scanner(new File("A-small-attempt0.in"));
		int times = s.nextInt();
		for(int t = 1; t<=times; t++){
			//int time = s.nextInt();
				String card1 = "";
				String card = "";
				int row1 = s.nextInt()-1; s.nextLine();//out.println(row1);
				String[] val = new String[16];
				for(int li = 0; li<4; li++){
					card1+= s.nextLine()+" ";
				}val=card1.split(" ");
				int row = s.nextInt()-1;s.nextLine();//out.println(row);
				for(int l = 0; l<4; l++)
					card+=s.nextLine()+" ";
				String[] cl = card.split(" ");
				int count = 0;
				int same = 0;
				//out.println(card);
				for(int i = (row1*4); i<(row1*4+4); i++){
					
					for(int j = (row*4); j<row*4+4; j++){
						//out.println(val[i] + " "+cl[j]);
					if(Integer.parseInt(val[i])==Integer.parseInt(cl[j])){
						same=Integer.parseInt(val[i]);//out.println("8");
						count++;
					}}
				}if(count==1){
					out.println("Case #"+t+": "+same);
				}else
				out.println(count>1? "Case #" + t+ ": Bad magician!" :"Case #"+ t + ": Volunteer cheated!");
		
			
		}
	}
}

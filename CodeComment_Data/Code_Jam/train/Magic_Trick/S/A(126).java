package methodEmbedding.Magic_Trick.S.LYD8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {

	public static String[][] table= new String[4][4];
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int row = Integer.parseInt(br.readLine())-1;
			for (int j = 0; j < table.length; j++) {
				table[j] = br.readLine().split(" ");
			}
			String[] row1 = table[row];
			row = Integer.parseInt(br.readLine())-1;
			for (int j = 0; j < table.length; j++) {
				table[j] = br.readLine().split(" ");
			}
			String[] row2 = table[row];
			int count =0;
			String choosen=null;
			for (int j = 0; j < row1.length && count<=1; j++) {
				for (int k = 0; k < row2.length && count<=1; k++) {
					if(row1[j].equals(row2[k])){
						choosen = row1[j];
						count++;
					}
					
				}
			}
			
			if(choosen!=null){
				if(count==1){
					System.out.println("Case #"+(i+1)+": "+choosen);
				}else{
					System.out.println("Case #"+(i+1)+": Bad magician!");
				}
			}else{
				System.out.println("Case #"+(i+1)+": Volunteer cheated!");
			}
		}

	}

}

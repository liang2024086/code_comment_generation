package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1361;

import java.text.DecimalFormat;


public class Solution2_Cookie {

	public static void main(String[] args) {
		String[] input = FileLoadSave.loadFile("C:\\Users\\Umut\\Desktop\\quest.in");
		int num= Integer.parseInt(input[0]);
		String[] output = new String[num];
		double X, P, C, F;
		String[] inums;
		double time;
		boolean done;
		for (int i=0; i<num; i++) {
			inums=input[i+1].split(" ");
			C=Double.parseDouble(inums[0]);
			F=Double.parseDouble(inums[1]);
			X=Double.parseDouble(inums[2]);
			P=2;
			time=0;
			done=false;
			while(!done) {
				if ( X*F > (C*(P+F)) ) {
					time+=C/P;
					P+=F;
				}
				else {
					time+=X/P;
					done=true;
				}
			}
			output[i]="Case #"+(i+1)+": "+time;
		}
		
		FileLoadSave.writeFile("C:\\Users\\Umut\\Desktop\\quest2.txt", output);
	}

}

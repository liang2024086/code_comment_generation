package methodEmbedding.Magic_Trick.S.LYD674;

import java.util.*;
public class Magic {

	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int counter=1;
		while(counter<=t){
		int[] line1 = new int[4];
		int x1 = in.nextInt();
		int count1=0;
		for (int i = 1; i<=16; i++){
			int yo = in.nextInt();
			if (i>=(4*x1)-3 && i <= 4*x1){

				line1[count1]=yo;
				count1++;

			}
		}
		int x2 = in.nextInt();
		int totalnum=0;
		int count2=0;
		int po =0;
		for (int i =1; i<=16; i++){
			po = in.nextInt();
			if (i>=(4*x2)-3 && i <= 4*x2){
				for (int j =0; j<line1.length; j++){
					if (po  == line1[j]){
						totalnum++;
						count2=po;
					}
				}
				
			}
		}
		if (totalnum==1){
			System.out.print("\nCase #"+ counter + ": "+ count2);
		}
		else if (totalnum>1){
			System.out.print("\nCase #"+ counter + ": Bad magician!");
		}
		else if (totalnum==0){
			System.out.print("\nCase #"+ counter + ": Volunteer cheated!");
		}
		counter++;
	}
}
}

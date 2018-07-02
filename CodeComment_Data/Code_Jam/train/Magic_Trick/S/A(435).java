package methodEmbedding.Magic_Trick.S.LYD2052;

import java.util.*;

class A{

	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			int kase = sc.nextInt();
			for(int k = 1; k<=kase; k++){
				int[] row1 = new int[4];
				int ans = sc.nextInt();
				for(int i = 0; i<ans; i++) sc.nextLine();
				for(int i = 0; i<4; i++) row1[i] = sc.nextInt();
				for(int i = ans; i<=4; i++) sc.nextLine();
				int[] row2 = new int[4];
				ans = sc.nextInt();
				for(int i = 0; i<ans; i++) sc.nextLine();
				for(int i = 0; i<4; i++) row2[i] = sc.nextInt();
				for(int i = ans; i<=4; i++) sc.nextLine();
				Arrays.sort(row1);
				Arrays.sort(row2);
				int card = -1;
				int i1 = 0; int i2 = 0;
				while(i1<4 && i2<4){
					while(i1<4 && row1[i1]<row2[i2]) i1++;
					while(i2<4 && i1<4 && row2[i2]<row1[i1]) i2++;
					if(i1<4 && i2<4 && row1[i1]==row2[i2]){
						if(card == -1) card = row1[i1];
						else card = -2;
						i1++; i2++;
					}
				}
				System.out.println("Case #"+k+": "+(card==-1?"Volunteer cheated!":(card==-2?"Bad magician!":card)));
			}
		}
		catch(Exception e){e.printStackTrace();}
	}
}

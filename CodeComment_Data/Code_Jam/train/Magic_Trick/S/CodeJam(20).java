package methodEmbedding.Magic_Trick.S.LYD2013;

import java.util.*;
public class CodeJam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testcases = 1;
		int rown = 0;
		int[] inpAr = new int[4];
		int[] inpAr2 = new int[4];
		Scanner scn = new Scanner(System.in);
		testcases = scn.nextInt();
		int count = 1;
		int sn = 0;
		String ou = "";
		while(testcases != 0){
			rown = scn.nextInt();
			
			for(int xx = 0; xx < 5; xx++){
				String userInp = scn.nextLine();
				if(xx == rown){
					StringTokenizer st = new StringTokenizer(userInp, " ");
					int iA = 0;
					while(st.hasMoreElements()){
						String str = st.nextToken();
						inpAr[iA] = Integer.parseInt(str);
						iA++;
					}
				}
			}
			
			int row2 = scn.nextInt();
			for(int xy = 0; xy < 5; xy++){
				String userInp = scn.nextLine();
				if(xy == row2){
					StringTokenizer st = new StringTokenizer(userInp, " ");
					int iA2 = 0;
					while(st.hasMoreElements()){
						String str = st.nextToken();
						inpAr2[iA2] = Integer.parseInt(str);
						iA2++;
					}
				}
			}
			
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					if(inpAr2[i] == inpAr[j]){
						sn++;
						if(sn == 1)
							ou = "" + inpAr2[i];
						else
							ou = "Bad magician!";
					}
				}
			}
			if(sn == 0)
				ou = "Volunteer cheated!";
			System.out.println("Case #" + count + ": " + ou);
			count++;
			testcases--;
			ou = "";
			sn = 0;
		}
	}
}

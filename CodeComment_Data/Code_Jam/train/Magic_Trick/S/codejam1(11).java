package methodEmbedding.Magic_Trick.S.LYD588;

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
///Users/lxze/Desktop/
public class codejam1{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("A-small-attempt1.in"));
		BufferedWriter write = new BufferedWriter(new FileWriter("output.txt"));


		String[] result = {"Bad Magician!","Volunteer cheated!"};
		int caseN = sc.nextInt();
		sc.nextLine();
		int[][] sq1 = new int[4][4];
		int[][] sq2 = new int[4][4];
		int sel1,sel2;
		String[] allCase = new String[caseN];
		int found = 0;
		boolean chk = false;

		for(int icase=0;icase<caseN;icase++){
			sel1 = sc.nextInt();
			sc.nextLine();
			for(int isq=0;isq<4;isq++){
				for(int j=0;j<4;j++){
					sq1[isq][j] = sc.nextInt();
				}
			}
			sel2 = sc.nextInt();
			sc.nextLine();
			for(int isq=0;isq<4;isq++){
				for(int j=0;j<4;j++){
					sq2[isq][j] = sc.nextInt();
				}
			}
			sel1-=1;
			sel2-=1;
			Arrays.sort(sq1[sel1]);
			Arrays.sort(sq2[sel2]);
			if(Arrays.equals(sq1[sel1],sq2[sel2])){
				allCase[icase] = "Case #"+(icase+1)+": "+result[0];
				chk=true;
			}
			
			else{
				for (int x : sq1[sel1]) {
					for(int y : sq2[sel2]){
						if(x==y && !chk){
							chk=true;
							allCase[icase] = "Case #"+(icase+1)+": "+x;
						}
						else if(chk && x==y){
							allCase[icase] = "Case #"+(icase+1)+": "+result[0];
							break;
						}
					}
				}
			}
			if(!chk)
				allCase[icase] = "Case #"+(icase+1)+": "+result[1];


			sel1=0;
			sel2=0;
			sq1 = new int[4][4];
			sq2 = new int[4][4];
			found=0;
			chk=false;
		}

		for(int i=0;i<allCase.length;i++){
			//System.out.println(allCase[i]);
			write.append(allCase[i]+"\n");
		}
		write.close();
	}

}

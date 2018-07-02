package methodEmbedding.Magic_Trick.S.LYD933;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Magictrick {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scn=new Scanner(new File("A-small-attempt0.in"));
		int numCases=Integer.parseInt(scn.nextLine());
		int[][] possibilities=new int[2][4];//, possibilities2=new int[4];
		int[] row=new int[2];
		int ans;
		String[] temp;
		for (int caseN=0; caseN<numCases; caseN++){
			ans=-1;
			for (int j=0; j<2; j++){
				row[j]=Integer.parseInt(scn.nextLine());
				for (int i=1; i<row[j]; i++)
					scn.nextLine();
				temp=scn.nextLine().split("[ ]+");
				for (int i=0; i<4; i++)
					possibilities[j][i]=Integer.parseInt(temp[i]);
				for (int i=row[j]+1; i<=4; i++)
					scn.nextLine();
			}
			checking:
			for (int i=0; i<4; i++){
				for (int j=0; j<4; j++){
					if (possibilities[0][i]==possibilities[1][j]){
						if (ans==-1)
							ans=possibilities[0][i];
						else{
							ans=-2;
							break checking;
						}
					}
				}
			}
			System.out.print("Case #"+(caseN+1)+": ");
			if (ans==-1)
				System.out.println("Volunteer cheated!");
			else if (ans==-2)
				System.out.println("Bad magician!");
			else
				System.out.println(ans);
		}
		scn.close();
	}
}

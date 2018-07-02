package methodEmbedding.Magic_Trick.S.LYD636;

import java.io.*;
import java.util.Scanner;


public class Magician {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("A-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("output.txt"));
		int t = in.nextInt();
		int a[] = new int[4];
		int cards[][] = new int[4][4];
		for(int i=0;i<t; i++){
			int ans = in.nextInt();
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					cards[j][k]=in.nextInt();
				}
			}
			for(int j=0;j<4;j++){
				a[j]=cards[ans-1][j];
			}
			ans = in.nextInt();
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					cards[j][k]=in.nextInt();
				}
			}
			int found=0;
			int magic_card=0;
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					if(a[j]==cards[ans-1][k]){
						found++;
						magic_card=a[j];
					}
				}
			}
			if(found == 0){
				out.println("Case #"+(i+1)+": Volunteer cheated!");
			}else if(found==1){
				out.println("Case #"+(i+1)+": "+magic_card);
			}else if(found>1){
				out.println("Case #"+(i+1)+": Bad magician!");
			}
		}
		
		out.close();

	}

}

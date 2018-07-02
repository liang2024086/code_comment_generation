package methodEmbedding.Magic_Trick.S.LYD351;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class A {
   public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(Paths.get("a.in"));
	BufferedWriter out = Files.newBufferedWriter(Paths.get("a.out"));
	int T = sc.nextInt()+1;
	int[][] matrica1 = new int[4][4];
	int [] [] matrica2 = new int[4][4];
	int red1, red2;
	String poruka;
	int broj=0;
	boolean ima, vise;
	for(int t=1;t<T;t++){
		ima=false; vise=false;
		red1 = sc.nextInt()-1;
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				matrica1[i][j]=sc.nextInt();
		red2 = sc.nextInt()-1;
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				matrica2[i][j]=sc.nextInt();
		
		for(int i=0;i<4;i++){
			
			if(vise)break;
			for(int j=0;j<4;j++){
				if(matrica1[red1][i]==matrica2[red2][j]){
					if(ima)vise=true;
					else 
						ima=true;
					broj=matrica1[red1][i];
					break;
				}
			}
				
		}
		if(ima){
			if(vise){
				poruka="Bad magician!";
			}
			else
			poruka = new StringBuilder("").append(broj).toString();
		}
		else
			poruka="Volunteer cheated!";
				
		out.write(new StringBuilder("Case #").append(t).append(": ").append(poruka).append("\n").toString());
		
	}
	
	out.close();
}
}

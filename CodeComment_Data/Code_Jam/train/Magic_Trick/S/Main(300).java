package methodEmbedding.Magic_Trick.S.LYD984;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		 int[][] inicial=new int[4][4];
		 int[][] segunda=new int[4][4];
		 int casos=sc.nextInt(),pi,si,r=0,pos=0;
		 File f=new File("D:/filetext.txt");
			if(!f.exists())f.createNewFile();
			FileWriter fw=new FileWriter(f.getAbsoluteFile());
			BufferedWriter bw=new BufferedWriter(fw);
		 for(int i=0;i<casos;i++){
			 r=0;pos=0;
			 pi=sc.nextInt()-1;
			 for(int fil=0;fil<4;fil++){
				 for(int c=0;c<4;c++){
					 inicial[fil][c]=sc.nextInt();
				 }
			 }
			 si=sc.nextInt()-1;
			 for(int fil=0;fil<4;fil++){
				 for(int c=0;c<4;c++){
					 segunda[fil][c]=sc.nextInt();
				 }
			 }
			 
			 for(int fil=0;fil<4;fil++){
				 for(int c=0;c<4;c++){
					 if(segunda[si][c]==inicial[pi][fil]){
						 r++;
						 pos=segunda[si][c];
					 }
					 
				 }
			 }
			 if(r==0){
				 bw.write("Case #"+(i+1)+": Volunteer cheated!" );
				 bw.newLine();
			 }
			 if(r==1){
				 bw.write("Case #"+(i+1)+": "+ pos);
				 bw.newLine();
			 }
			 if(r>1){
				 bw.write("Case #"+(i+1)+": Bad magician!" );
				 bw.newLine();
			 }
		 }
		bw.close();
	}
	
}

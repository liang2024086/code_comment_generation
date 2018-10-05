package methodEmbedding.Magic_Trick.S.LYD144;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


public class MagicTrick {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter writer= new PrintWriter("Output", "UTF-8");
		Scanner s=new Scanner(System.in);
		int cases=s.nextInt();
		int guess, count, num=-1, currentCase=1;
		while(currentCase<=cases){
			guess=s.nextInt();
			int[][] cards=new int[4][4];
			for(int y=0;y<4;y++)
				for(int x=0;x<4;x++)
					cards[y][x]=s.nextInt();
			int[] possible = new int[4];
			for(int x=0;x<4;x++)
				possible[x]=cards[guess-1][x];
			guess=s.nextInt();
			for(int y=0;y<4;y++)
				for(int x=0;x<4;x++)
					cards[y][x]=s.nextInt();
			count=0;
			for(int g:possible){
				for(int c:cards[guess-1]){
					if(g==c){ 
						count++;
						num=g;
					}
				}
			}
			System.out.println();
			writer.println();
			System.out.print("Case #" + currentCase + ": ");
			writer.println("Case #" + currentCase + ": ");
			if(count==1){
				System.out.print("" + num);
				writer.println("" + num);
			}
			else if(count>1){
				System.out.print("Bad magician!");
				writer.println("Bad magician!");
			}
			else{
				System.out.print("Volunteer cheated!");
				writer.println("Volunteer cheated!");
			}
			currentCase++;
		}
	}
}

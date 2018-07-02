package methodEmbedding.Magic_Trick.S.LYD656;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class card {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("A-small-attempt0.in"));
		int N = scan.nextInt();
		FileWriter fw = new FileWriter( new File("cardresult.txt"));
		for(int k=0;k<N;k++){
			int ans1 = scan.nextInt();
			int[][] card1 = new int[4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					card1[i][j]=scan.nextInt();
				}
			}
			
			int ans2 = scan.nextInt();
			int[][] card2 = new int[4][4];
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					card2[i][j]=scan.nextInt();
				}
			}
			//resh
			HashSet<Integer> set = new HashSet<Integer>();
			boolean check = false;
			int res=0;
			for(int i=0;i<4;i++){
				set.add(card1[ans1-1][i]);
			}
			for(int i=0;i<4;i++){
				if(set.contains(card2[ans2-1][i])){
					if(!check){
						check=true;
						res=card2[ans2-1][i];
					}
					else{
						res=0;
						break;
					}
				}
			}
			String answer;
			if(res!=0){
				answer=String.valueOf(res);
			}
			else{
				if(check){
					answer="Bad magician!";
				}
				else{
					answer="Volunteer cheated!";
				}
			}
			System.out.print("Case #"+(k+1)+": "+answer+"\n");
			fw.write("Case #"+(k+1)+": "+answer+"\n");
			fw.flush();
		}
	}

}

package methodEmbedding.Speaking_in_Tongues.S.LYD328;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class main {
	 
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner res = new Scanner( new File("/home/loic/INF422/workspace/CodeJam1/bin/Result.txt"));
		char[][] google; char[][] translated; char[] code = new char[26];
		res.nextLine();
		code = res.nextLine().toCharArray();
		google=new char[sc.nextInt()][];
		translated= new char[google.length][];
		sc.nextLine();
		System.out.println(google.length);
		for(int i =0; i<google.length;i++){
			google[i]=sc.nextLine().toCharArray();
		}
		/*for(int i =0;i<google.length;i++){
			translated[i]=sc.nextLine().toCharArray();
		}
		for(int i = 0; i<google.length;i++){
			for(int j=0; j<google[i].length;j++){
				if (google[i][j]!=' '){
					code[(int) translated[i][j]-97]=google[i][j];
				}
			}
		}*/
		for(int i =0; i<google.length;i++){
			translated[i]=new char[google[i].length];
		}
		for(int i = 0; i<google.length;i++){
			for(int j=0; j<google[i].length;j++){
				if (google[i][j]==' ')
					translated[i][j]=' ';
				else
					translated[i][j]=code[(int) google[i][j]-97];
			}
		}
		//code[0]='y'; code[25]='q'; code['q'-97]='z';
		
		System.out.println("Output");
		for (int i=0;i<google.length;i++){
			System.out.print("Case #"+(i+1)+": ");
			System.out.println(translated[i]);
		}
		
	}

}

package methodEmbedding.Standing_Ovation.S.LYD1731;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


public class Standing_Ovation  {
	public static void main(String args[]) throws IOException{
		FileReader fin = new FileReader("C:\\Users\\mbj\\Downloads\\A-small-attempt2.in");
		FileWriter fos=new FileWriter("C:\\Users\\mbj\\Downloads\\A-small-attempt2.out");
		Scanner scanner=new Scanner(fin);
		int T = Integer.parseInt(scanner.nextLine());
		for(int i=0; i<T; i++){
			String[] input = scanner.nextLine().split(" ");
			System.out.println(input[0]+" "+input[1]);
			int n = Integer.parseInt(input[0]);
			int[] S = new int[n+1];
			for(int j=0; j<=n; j++){
				S[j] = Integer.parseInt(input[1].substring(j,j+1));
				System.out.print(Integer.toString(S[j])+" ");
			}
			System.out.println(" ");
			int y=0, A = 0;
			for(int k =0; k<n+1; k++){
				if(A >= k){
					A += S[k];
				}else{
					if(S[k]!=0){
						y += k-A;
						A =S[k]+k;
					}
				}
				System.out.println(Integer.toString(k)+"**"+Integer.toString(y));
			}
			System.out.println("Case #"+Integer.toString(i+1)+": "+Integer.toString(y)+System.getProperty("line.separator"));
			String r = "Case #"+Integer.toString(i+1)+": "+Integer.toString(y)+System.getProperty("line.separator");
			fos.write(r);
			fos.flush();
		}



		//System.out.println(Integer.toString(T));
		scanner.close();


	}
}


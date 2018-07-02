package methodEmbedding.Revenge_of_the_Pancakes.S.LYD639;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class B_Pancakes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("B-small-attempt0.in.txt");
		File file2 = new File("B_Output.out");
		PrintWriter pWriter = null;
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			pWriter = new PrintWriter(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int T = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=T;i++){
			String str = sc.nextLine();
			char[] search = {'-','+'};
			int searchi = 0;
			int count = 0;
			for(int j=str.length()-1;j>=0;j--){
				if(search[searchi]==str.charAt(j)){
					count++;
					searchi = (searchi==0)?1:0;
				}
			}
			System.out.println("Case #"+i+": "+ count);
			pWriter.println("Case #"+i+": "+ count);
		}
		pWriter.close();
	}

}

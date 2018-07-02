package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1119;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CodeJam2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		File file = new File("Out2.txt");
		PrintWriter pr = new PrintWriter(file);
		
		for(int i=0;i<n;i++){
			String str = sc.next();
			int count = 1;
			int len = str.length();
			char c = str.charAt(0);
			for(int j=1;j<len;j++){
				if(str.charAt(j)==c)
					continue;
				else{
					count++;
					c = str.charAt(j);
				}
					
			}
			if(str.charAt(len-1) == '+'){
				pr.write("Case #"+(i+1)+": "+(count-1)+"\n");
				System.out.println("Case #"+(i+1)+": "+(count-1));
			}
				
			else{
				pr.write("Case #"+(i+1)+": "+(count)+"\n");
				System.out.println("Case #"+(i+1)+": "+(count));
			}
				
		}
		pr.close();
	}

}

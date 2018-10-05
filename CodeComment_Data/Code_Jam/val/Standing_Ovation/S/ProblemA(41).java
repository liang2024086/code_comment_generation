package methodEmbedding.Standing_Ovation.S.LYD165;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ProblemA {
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(new File("input.txt"));
		PrintWriter pw = new PrintWriter("OUTPUT.TXT");
		int tmp, Smax, sum = 0, count = 0;
		String s;
		char[] ch;
		int T = sc.nextInt();
		for(int i=0; i< T; ++i){
			
			Smax = sc.nextInt();
			s = sc.next();
			ch = s.toCharArray();
			sum = count = 0;
			for(int k=0; k <= Smax; ++k){
				tmp = ch[k] - 48;
				
				if(tmp > 0){
					if(sum >= k){
						sum += tmp;
					}
					else{
						count += k - sum;
						sum += (k - sum) + tmp;
					}
				}
			}
			pw.println("Case #" + (i+1) + ": " + count );
			
		}
		pw.close();
//		char ch = '0';
//		for(int i=0; i<10; ++i, ++ch)
//			System.out.println((int)ch + " " + ch);
	}

}

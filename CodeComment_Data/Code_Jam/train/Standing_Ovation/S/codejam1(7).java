package methodEmbedding.Standing_Ovation.S.LYD1617;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.attribute.FileAttributeView;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class codejam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String w = scan.nextLine();
		int e = Integer.parseInt(w);
		for (int j = 1; j <= e; j++) {
			
			String l = scan.nextLine();
			String[] r = l.split(" ");
			int t = Integer.parseInt(r[0]) ;
			String[] r1 = r[1].split("");
			int[]s = new int[r1.length];
			for (int i = 0; i < r1.length; i++) {
				s[i] = Integer.parseInt(r1[i]);
			}
			
			int[] sum =  new int[s.length];
			sum[0] = s[0];
			for (int i = 1; i < sum.length; i++) {
				sum[i] = s[i]+sum[i-1];
			}
			
			int need = 0 ; int real = 0 ; int have = sum[0] ;
			for (int i = 1; i < s.length; i++) {
				if(s[i] >= 1){
					need = have-i;
					
					if(need <0){
						have -=need ;
						real += (0-need) ;
				}
				have += s[i];
//				System.out.println(have);
			}
			}		
			
//			System.out.println("Case #"+j+": "+real+'\n');
//			String text = "Case #"+j+": "+real ;
			 FileWriter fw = null;
			  PrintWriter pw = null;
			    try {
			        fw = new FileWriter("exmaple.txt",true);
			        pw = new PrintWriter(fw);

			    pw.println("Case #"+j+": "+real+'\n');
		
			        pw.close();
			        fw.close();
			    } catch (IOException ex) {
			        Logger.getLogger(FileAttributeView.class.getName()).log(Level.SEVERE, null, ex);
			    }
			
//			System.out.println("Case #"+j+": "+real);
		}
		
		
		
		
	}
		
	}
	


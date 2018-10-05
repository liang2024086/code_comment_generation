package methodEmbedding.Standing_Ovation.S.LYD1594;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ProblemAsmall {

	public ProblemAsmall() {
		//try{
			Scanner scan = new Scanner(System.in);
			//Scanner scan = new Scanner(new File("A-small-attempt0.in"));
			 int T = scan.nextInt();
			 scan.nextLine();
			 for(int i = 0; i < T; i++){
				Scanner line = new Scanner(scan.nextLine());
				int level = line.nextInt()+1; 
				int friend = 0;
				String members = line.next();
				int total = members.charAt(0)-48;
				for(int k = 1; k < level; k++){
					int sl = members.charAt(k)-48;
					if(total < k && sl != 0){
						int count  = k - total;
						friend += count;
						total += sl+count;
					}else {
						total += sl;
					}
				}
				System.out.println("Case #"+(i+1)+": "+ friend);
			 }
//		}catch(IOException e){	
//		}
		
	}

	public static void main(String[] args) {
		new ProblemAsmall();

	}

}

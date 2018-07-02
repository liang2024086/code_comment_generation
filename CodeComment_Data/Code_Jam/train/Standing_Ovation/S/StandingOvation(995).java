package methodEmbedding.Standing_Ovation.S.LYD542;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileOutputStream out = new FileOutputStream("StandingOvationSmall.txt");
		int tc,ct=1;
		tc= sc.nextInt();
		while((tc--)>0){
			int smax = sc.nextInt();
			String input = sc.nextLine();
			String  sLevels =input.replaceAll(" ", "");
			int friendsReq = 0;
			int standing = 0;
			for(int i=0;i<sLevels.length();i++){
				int si = Integer.parseInt(sLevels.charAt(i)+"");				
				if(standing<i) {					
					friendsReq=friendsReq+ (i-standing);
					standing=standing+(si+i-standing);
				}else{
					standing+=si;
				}
			}
			out.write(("Case #" + (ct) + ": "+friendsReq + "\n").getBytes());
			ct++;
		}
		

	}

}

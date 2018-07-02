package methodEmbedding.Standing_Ovation.S.LYD2225;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StandingOvation {
	
	public StandingOvation() {
		Scanner sc = new Scanner(System.in);
		int ncase=0; //number of the test case
		Integer Smax;//maxinun shyness 
		String LineCase;
	//	ncase = Integer.parseInt(sc.nextLine());
		
		int i;
		int y = 0;
		File fl = new File("E:/Desenvolvimento/Java/GoogleCodeJam/src/in.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(fl);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		}
		BufferedReader br = new BufferedReader(fr);
		
		try {
			ncase = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String out[] = new String[ncase] ;
		if(ncase>0 && ncase<=100){
			for(i=0;i<ncase;i++){
				try {
					out[i] = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		for(i=0;i<ncase;i++){
			y=0;
			int can=0;
			
			Smax = Integer.parseInt(out[i].split(" ")[0]);
			if(Smax >= 0 && Smax <= 6){
				String cadena = out[i].split(" ")[1];
				String per= cadena;
				for(int c=0;c<cadena.length();c++){
					Character ch = cadena.charAt(c);
					int at = Integer.parseInt(ch.toString());
					if(c==0 && at>=cadena.length()) break;
					if(can> cadena.length()) break;
					if(at > 0){
					
						if((y+can)<c){
							   y = c-can;
							    can+=at;
							   
						   }else{
							   can+=at;
							   
						   }
					}else{
						//can++;
					}
				}
				System.out.println("Case #"+String.valueOf(i+1)+": "+String.valueOf(y));
			}
			
		}
	}

	public static void main(String[] args) {
	
			new StandingOvation();
			}

}

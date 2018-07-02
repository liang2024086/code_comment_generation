package methodEmbedding.Magic_Trick.S.LYD257;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;


public class Q_A {

	public static void main(String[] args){
		
		FileReader ir;
		try {
			ir = new FileReader("src/A-small-attempt0 (2).in");
			BufferedReader b = new BufferedReader(ir);
			String s;
			s = b.readLine();
			int num = Integer.valueOf(s);
			
			FileWriter fw = new FileWriter("src/q_a.out");

			String q = new String();
			int i = 0;
			
			boolean result = false;
			boolean draw = true;
			int gameNum = 0;
			
			while((s = b.readLine())!= null){
				gameNum++;
				
				Integer Q1 = Integer.valueOf(s) -1;
				s = b.readLine();
				String[][] S = new String[4][4];
				S[0] = s.split(" ");
				s = b.readLine();
				S[1] = s.split(" ");
				s = b.readLine();
				S[2] = s.split(" ");
				s = b.readLine();
				S[3] = s.split(" ");

				s = b.readLine();
				Integer Q2 = Integer.valueOf(s) -1;
				s = b.readLine();
				String[][] T = new String[4][4];
				T[0] = s.split(" ");
				s = b.readLine();
				T[1] = s.split(" ");
				s = b.readLine();
				T[2] = s.split(" ");
				s = b.readLine();
				T[3] = s.split(" ");

//				System.out.println("Question");
//				System.out.println(Q1);
//				System.out.println(Q2);

				Integer cnt = 0;
				Integer i1 = 0, i2 = 0;
				String A = "";
				for(i1 = 0; i1 < 4; i1++){
					for(i2 = 0; i2 < 4; i2++){
//						System.out.println(S[Q1][i1]);
//						System.out.println(T[Q2][i2]);
						if(S[Q1][i1].equals(T[Q2][i2])){
							A = S[Q1][i1];
							cnt++;
						}
					}
				}
				
				String ans = "Case #"+gameNum + ": ";
				if(cnt == 1){
					ans += A;
				}else if(cnt == 0){
					ans += "Volunteer cheated!";	
				}else{
					ans += "Bad magician!";
				}
//				System.out.println(cnt);
				System.out.println(ans);
				
				fw.write(ans + "\r\n");
				
			}
			
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			e.printStackTrace();
		}
		
	}
	
}

package methodEmbedding.Magic_Trick.S.LYD1689;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Gcj_A {

	public static void main(String[] args) {
		
		try{
			
			System.setIn(new FileInputStream("/Users/kunyangjia/Downloads/A-small-attempt1.in.txt"));
			System.setOut(new PrintStream("/Users/kunyangjia/Desktop/A-small-attempt1.out.txt"));
			
		}catch(Exception e){
			
		}
		Scanner in = new Scanner(System.in);
		int t;
		t = in.nextInt();
		
		
		for(int tc = 1;tc <= t; tc++){
			
			int target = in.nextInt();
			HashSet<Integer> first = new HashSet<>();
			List<Integer> second = new ArrayList<>();
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					int _t = in.nextInt();
					if(i + 1 == target)
						first.add(_t);
				}
			}
			
			target = in.nextInt();
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					int _t = in.nextInt();
					if(i + 1 == target)
						second.add(_t);
				}
			}
			
			int cnt = 0;
			int ans = 0;
			for(Integer i : second){
				if(first.contains(i)){
					ans = i;
					cnt++;
				}
			}
//			System.out.println(first+ "\n" + second);
			System.out.printf("Case #%d: ",tc);
			if(cnt == 0){
				System.out.println("Volunteer cheated!");
			}
			else if(cnt == 1){
				System.out.println(ans);
			}
			else {
				System.out.println("Bad magician!");
			}
		}
	}

}

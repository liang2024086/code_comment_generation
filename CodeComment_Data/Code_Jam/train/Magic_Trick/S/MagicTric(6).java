package methodEmbedding.Magic_Trick.S.LYD2127;

import java.util.*;
public class MagicTric {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		for(int i=1;i<N+1;i++){
			int counter =0;
			int card=0;
			ArrayList<Integer> res1 = new ArrayList<Integer>();
			int ans1 = sc.nextInt();
			for(int j=0;j<16;j++){
				if(j<ans1*4&&j>=(ans1-1)*4){
					res1.add(sc.nextInt());
				}else{
					sc.next();
				}
			}
			int ans2 = sc.nextInt();
			int ans_card=0;
			for(int j=0;j<16;j++){
				if(j<ans2*4&&j>=(ans2-1)*4){
					card = sc.nextInt();
					if(res1.contains(card)){
						if(counter==0) ans_card = card;
						counter++;
					}
				}else{
					sc.next();
				}
			}
			String resbuf;
			if(counter ==0){
				resbuf = "Volunteer cheated!";
			}else if(counter ==1){
				resbuf = Integer.toString(ans_card);
			}else{
				resbuf = "Bad magician!";
			}
			System.out.println("Case #"+i+": "+resbuf);
		}
	}
}

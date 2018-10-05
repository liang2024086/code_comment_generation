package methodEmbedding.Magic_Trick.S.LYD1651;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MagicTrick {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int j=0;j<n;j++) {
			List<Integer> l = new ArrayList<Integer>();
			int a = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<4;i++) {
				if(a==i+1) {
					l.add(sc.nextInt());
					l.add(sc.nextInt());
					l.add(sc.nextInt());
					l.add(sc.nextInt());
				}
				sc.nextLine();
			}
			int b = sc.nextInt();
			sc.nextLine();
			for(int i=0;i<4;i++) {
				if(b==i+1) {
					l.add(sc.nextInt());
					l.add(sc.nextInt());
					l.add(sc.nextInt());
					l.add(sc.nextInt());
				}
				sc.nextLine();
			}
			Collections.sort(l);
			int count = 0,val=0;
			for(int i=0;i<l.size()-1;i++) {
				if(l.get(i)==l.get(i+1)) {
					count++;
					val = l.get(i);
				}
			}
			if(count==1) {
				System.out.println("Case #"+(int)(j+1)+": "+val);
			}
			else if(count>1) {
				System.out.println("Case #"+(int)(j+1)+": Bad magician!");
			}
			else {
				System.out.println("Case #"+(int)(j+1)+": Volunteer cheated!");
			}
		}
	}

}

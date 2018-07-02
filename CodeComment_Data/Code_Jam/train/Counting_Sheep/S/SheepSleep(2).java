package methodEmbedding.Counting_Sheep.S.LYD1066;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SheepSleep {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("src/Input.txt"));
		int T = Integer.parseInt(scan.nextLine());
		for (int i = 1; i <= T; i++) {
			long ans = 0;
			List<Integer> list = new ArrayList<Integer>();
			list.add(0);
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(8);
			list.add(9);
			List<Integer> newList = new ArrayList<Integer>();
			long N = Long.parseLong(scan.nextLine());
			if (N == 0)
				System.out.println("Case #"+i+": INSOMNIA");
			else {
				int j = 1;
				while(true) {
					long N1 = N * j;
					newList = new ArrayList<>();
					String check = N1+"";
					//System.out.println("check : "+check);
					for (int k : list) {
						if (check.indexOf(""+k)!=-1) {
							//newList.remove(k);
							
						} else {
							//System.out.println(" K "+k);
							if (!newList.contains(k)) {
								//System.out.println("N1 : "+N1);
								newList.add(k);
							}
						}
						
					}
					//System.out.println("J "+j);
					list = new ArrayList<>(newList);
					
					if (list.size() == 0) {
						ans = N1;
						break;
					}
					j++;
				}
				System.out.println("Case #"+i+": "+ans);
			}
		}
	}

}

package methodEmbedding.Counting_Sheep.S.LYD1648;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class pr1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		String answer[] = new String[caseNum];
		int arrNum[] = new int[caseNum];
		for (int i = 0; i < caseNum; i++) {
			arrNum[i] = sc.nextInt();
		}
		for (int i = 0; i < caseNum; i++) {
			HashSet<Integer> hs = new HashSet<Integer>();
			boolean flag = true;
			int multiple = 1;
			while (flag) {
				int tempNum = arrNum[i] * multiple;
				String tempString = String.valueOf(tempNum);
				int len = tempString.length();
				for (int j = 0; j < len; j++) {
					hs.add(Character.getNumericValue(tempString.charAt(j)));
				}
				Iterator<Integer> it = hs.iterator();
				if (hs.size()==10) {
					flag= false;
					System.out.println(tempNum);
					answer[i] = String.valueOf(tempNum);
				}
				multiple++;
				if (multiple>=1000000) {
					flag= false;
					answer[i] = "INSOMNIA";
				}
			}
		}
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println("Case #"+(i+1) +" : "+answer[i]);
		}
	}
}

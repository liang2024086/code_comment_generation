package methodEmbedding.Magic_Trick.S.LYD1774;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		int caseno = 1;
		while(testCases > 0){
			boolean []valueSel = new boolean[16];
			int rowSel = 0;
			int resFlag = 0;
			int input = 0;
			int result = 0;

			rowSel = scanner.nextInt();
			for(int i=0; i< 4; ++i){
				if(rowSel == i+1){
					valueSel[scanner.nextInt()-1] = true;
					valueSel[scanner.nextInt()-1] = true;
					valueSel[scanner.nextInt()-1] = true;
					valueSel[scanner.nextInt()-1] = true;
				} else {
					scanner.nextInt();
					scanner.nextInt();
					scanner.nextInt();
					scanner.nextInt();
				}
			}
			rowSel = scanner.nextInt();
			for(int i=0; i< 4; ++i){
				if(rowSel == i+1){
					input = scanner.nextInt();
					if(valueSel[input-1] == true){
						++resFlag;
						result = input;
					}
					input = scanner.nextInt();
					if(valueSel[input-1] == true){
						++resFlag;
						result = input;
					}
					input = scanner.nextInt();
					if(valueSel[input-1] == true){
						++resFlag;
						result = input;
					}
					input = scanner.nextInt();
					if(valueSel[input-1] == true){
						++resFlag;
						result = input;
					}
				} else {
					scanner.nextInt();
					scanner.nextInt();
					scanner.nextInt();
					scanner.nextInt();
				}
			}
		
			if(resFlag == 0){
				System.out.println("Case #"+caseno+": Volunteer cheated!");
			} else if(resFlag == 1){
				System.out.println("Case #"+caseno+": "+result);
			} else {
				System.out.println("Case #"+caseno+": Bad magician!");
			}
			--testCases;
			++caseno;
		}
	}
}

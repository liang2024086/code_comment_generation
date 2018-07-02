package methodEmbedding.Standing_Ovation.S.LYD467;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int testCases = reader.nextInt();
		String[] array = new String[testCases];
		boolean ignore = true;
		int count = 0;
		while(count < testCases){
			String i = reader.next();
			if(ignore){
				ignore = false;
			} else{
				ignore = true;
				array[count] = i;
				count++;
			}
		}
		for(int i = 0; i < testCases; i++){
			int answer = 0;
			int totalCount = 0;
			char[] charArray = array[i].toCharArray();
			for(int j = 0; j < charArray.length; j++){
				int n = Character.digit(charArray[j], 10);
				if(n > 0){
					if(j > totalCount){
						answer += j - totalCount;
						totalCount = j;
					}
					totalCount += n;
				}
			}
			array[i] = "Case #" + (i+1) + ": " + answer;
			System.out.println(array[i]);
		}
		
	}

}

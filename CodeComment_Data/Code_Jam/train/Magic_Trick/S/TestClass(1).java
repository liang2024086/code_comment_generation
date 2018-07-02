package methodEmbedding.Magic_Trick.S.LYD1922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for(int count = 0; count < testCases; count++){
        	int firstAnswer = Integer.parseInt(br.readLine());
        	int firstArrangement[] = new int[4];
        	for(int i = 0; i < 4; i++){
        		String input[] = br.readLine().split(" ");
        		if(i + 1 != firstAnswer){
        			continue;
        		}
        		for(int j = 0; j < 4; j++){
        			firstArrangement[j] = Integer.parseInt(input[j]);
        		}
        	}
        	int secondAnswer = Integer.parseInt(br.readLine());
        	int secondArrangement[] = new int[4];
        	for(int i = 0; i < 4; i++){
        		String input[] = br.readLine().split(" ");
        		if(i + 1 != secondAnswer){
        			continue;
        		}
        		for(int j = 0; j < 4; j++){
        			secondArrangement[j] = Integer.parseInt(input[j]);
        		}
        	}
        	int commonList[] = new int[4];
        	int commonItems = 0;
        	for(int i = 0; i < 4; i++){
            	for(int j = 0; j < 4; j++){
            		if(firstArrangement[i] == secondArrangement[j]){
            			commonList[commonItems++] = firstArrangement[i];
            		}
            	}
            }
        	if(commonItems == 0){
        		System.out.println("Case #" + (count + 1) +": Volunteer cheated!");
        	}else if(commonItems == 1){
        		System.out.println("Case #" + (count + 1) + ": " + commonList[0]);
        	}else{
        		System.out.println("Case #" + (count + 1) + ": Bad magician!");
        	}
        }
    }
}

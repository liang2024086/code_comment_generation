package methodEmbedding.Counting_Sheep.S.LYD488;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SleepingSheep {
	public static void main(String[] args) throws IOException {
		Scanner stdin = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int noTestcase = stdin.nextInt(); 
        int currentNo = 0, currentDummy = 0, sumbit = 0;
        List<Integer> bitList = new ArrayList<Integer>();
        for(int no = 0; no < 10; no++)
        	bitList.add(0);
        for(int i = 1; i <= noTestcase; i++) {
        	currentNo = stdin.nextInt();
        	if(currentNo == 0)
        		System.out.println("Case #" + i + ": INSOMNIA");
        	else {
        		for(int j=1; ;j++) {
	        		currentDummy = j * currentNo;
	        		while(currentDummy > 0) {
	        			if(currentDummy%10 == 0) {
	        				if((bitList.get(0)) != 1)
	        					bitList.set(0, 1);
	        				currentDummy /= 10;
	        			}
	        			if((bitList.get(currentDummy%10)) != 1) {
	        				bitList.set((currentDummy%10), 1);
	        			}
	        			currentDummy /= 10;
	        		}
	        		for(int bit : bitList)
	        			sumbit += bit;
	        		if(sumbit == 10) {
	        			System.out.println("Case #" + i + ": " + j*currentNo);
	        			sumbit = 0;
	        			for(int no = 0; no < 10; no++)
	        	        	bitList.set(no, 0);
	        			break;
	        		} else {
	        			sumbit = 0;
	        		}
        		}
        	}
        }
	}
}

package methodEmbedding.Magic_Trick.S.LYD2001;

import java.util.*;
public class Quest1 {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	Scanner scan1 = new Scanner(System.in);
    	
    	int caseNum = scan1.nextInt();
    	int row1, row2;
    	int[][] nums = new int[4][4];
    	int[][] nums1 = new int[4][4];

    	int same = 0;
    	int sameNum = 0;
    	
    	ArrayList<String> cases = new ArrayList<String>();
     	for (int a = 0; a < caseNum; a++){
    		/////////////////////////////////////////////////////////////
     		row1 = scan1.nextInt();
    		
    		for (int b = 0; b < 4; b++){
    			for (int d = 0; d < 4; d++){
    				nums [d][b] = scan1.nextInt();
    			}
    		}
    		//System.out.println(nums[2][2]);
    		
    		////////////////////////////////////////////////////////////
    		row2 = scan1.nextInt();
    		
    		for (int b = 0; b < 4; b++){
    			for (int d = 0; d < 4; d++){
    				nums1 [d][b] = scan1.nextInt();
    			}
    		}
    		
    		///////////////////////////////////////////////////////////

    		for (int col = 0; col < 4; col++){
    			for (int col2 = 0; col2 < 4; col2++){
	    			if (nums1[col2][row2 - 1] == nums[col][row1 - 1]){
	    				sameNum = nums1[col2][row2 - 1];
	    				same ++;
	    			}
    			}
    		}
    		/////////////////////////
    		if (same == 1){
    			cases.add("Case #" + (cases.size() + 1)+ ": "  + sameNum);
    		}
    		else if (same > 1){
    			cases.add("Case #" + (cases.size() + 1) + ": Bad magician!");
    		}
    		else if (same == 0)
    			cases.add("Case #" + (cases.size() + 1) + ": Volunteer cheated!");
    		same = 0;
    	}
    	for (int a = 0; a < cases.size(); a++){
    		System.out.println(cases.get(a));
    	}
    	
    	
    }
}

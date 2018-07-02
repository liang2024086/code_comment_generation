package methodEmbedding.Standing_Ovation.S.LYD1947;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class G1{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();
	    in.nextLine();
            for(int j=0;j<n;j++){
		String[] line1 = in.nextLine().split(" ");
		char[] line = line1[1].toCharArray();
		int currSum = 0;
		int ex = 0;
		for(int i = 0; i < line.length; ++i){
			int num = line[i] - '0';
			if(num > 0 && currSum < i){
				ex += (i - currSum);
				currSum += (num + ex);
			}else{
				currSum += num;
			}
			//System.out.println(i + " " + currSum + " " + ex);
		}
		System.out.println("Case #"+ (j+1) +": " + ex);
            }
	
        }

}

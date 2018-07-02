package methodEmbedding.Standing_Ovation.S.LYD1757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class StandingOvation {

	public static void main(String[] args) {
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       try {
	        int t = Integer.parseInt(br.readLine());
	        

	        for(int i=0; i<t; i++){
			    int friends = 0;
			    int standing = 0;
		      	String[] eachLine = br.readLine().split(" ");
		      	int n = Integer.parseInt(eachLine[0]);
		      	String[] ovationStr = eachLine[1].split("");
		      //	int[] intArray = new int[eachLine.length];
			      	for(int j = 0; j < ovationStr.length; j++) {
			      	   // intArray[j] = Integer.parseInt(eachLine[j]);
			      		int iShyNum = Integer.parseInt(ovationStr[j]);
			      		if(standing>=j){
			      			standing=standing+iShyNum;
			      		}
			      		else if(iShyNum!=0){
			      			friends = friends + j-standing;
			      			standing = standing + friends+iShyNum;
			      		}
			      	}
			     System.out.println("Case #"+(i+1)+": "+friends+"");
	        }
	         
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
		
	}

}

package methodEmbedding.Standing_Ovation.S.LYD1651;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Set;
import java.util.TreeSet;


public class StandingOvation {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("A-small-attempt7.in");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		System.setOut(new PrintStream(new FileOutputStream("A-small-attempt.out")));
		
		String str = br.readLine();
		int T = Integer.parseInt(str);
		
		//int target[][] = new int[2][];

		for(int i=0; i<T; i++){
			int count=0,nonzero=0,zero=0,bzero=0;
			String array = br.readLine();
			String[] arrayconvert = array.split(" ");
			int a = Integer.parseInt(arrayconvert[0]);
			a++;
		    String[] smax = arrayconvert[1].split("");
		    int target[] = new int[a];
			//target[i] = new int[a+1];
			
		    //string to int
			for(int j=0; j< a; j++){
				target[j]=Integer.parseInt(smax[j]);
			//	target[i][j]=Integer.parseInt(smax[j+1]);
			}
			if(target[0]==0) {
				bzero=1;
			}
			//the minimum number of friends you must invite
			for(int j=0; j< a; j++){
		
//				if(a==1){
//					break;
//				}else if(target[j]!=1&target[j]!=0&target[0]==0){
//					count=j;
//					break;
//				}else if(target[j]!=1&target[j]!=0&target[0]!=0){
//					count=0;
//					break;
//				}else if(target[j]==1){
//					nonzero++;
//				}else if(target[j]==0){
//					zero++;
//					count=j;
//				}
				if(a==1){
					break;
				}else if(j>zero){
					count+=j-zero;
					zero=j;
				}
				zero+=target[j];
				
			}
//			if(a==nonzero+zero)System.out.print("Case #" + (i+1) + ": "+zero+"\r\n");
//			else System.out.print("Case #" + (i+1) + ": "+count+"\r\n");
			System.out.print("Case #" + (i+1) + ": "+count+"\r\n");
		}
		
	}

}

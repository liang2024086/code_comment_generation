package methodEmbedding.Magic_Trick.S.LYD610;


import java.io.File;
import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	
	public static void main(String[] args) throws Exception{
		
		String input="C:\\Users\\weekien\\Downloads\\A-small-attempt0.in";
		String output="C:\\Users\\weekien\\Downloads\\A-small-attempt0.out";
		System.setIn(new FileInputStream(new File(input)));
		System.setOut(new PrintStream(new File(output)));
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		
		
		for(int m=0;m<cases;m++){
			int first = in.nextInt();
			int[][] a= new int[4][4];
			int[] row= new int[4];
			int[] row2= new int[4];
			for( int j=0;j<4;j++){
				for( int i=0;i<4;i++){
					a[j][i]=in.nextInt();
				}
			}
			row=a[first-1];
			
			int second = in.nextInt();
			int[][] a2= new int[4][4];
			for( int j=0;j<4;j++){
				for( int i=0;i<4;i++){
					a2[j][i]=in.nextInt();

				}

			}
			row2=a2[second-1];
			
			
			Set set= new HashSet();
            for(int i=0;i<4;i++){
            	set.add(row[i]);
            }
            int answer=0;
            int count=0;
            
            for(int i=0;i<4;i++){
            	if(!set.add(row2[i])){
            		answer=row2[i];
            		count++;
            	}
            }
            
            
            if(count==0){
            	System.out.printf("Case #%d: %s", m+1,"Volunteer cheated!");

            }else if (count==1){
            	System.out.printf("Case #%d: %d", m+1,answer);

            }else{
            	System.out.printf("Case #%d: %s", m+1,"Bad magician!");            	
            }
            if(m<cases-1)
            System.out.println("");			
			
		}
		
		
	}
}

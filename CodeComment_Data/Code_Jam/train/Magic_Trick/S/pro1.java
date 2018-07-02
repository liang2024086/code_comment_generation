package methodEmbedding.Magic_Trick.S.LYD418;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class pro1 {

	
	public static void main(String[] args) {
		BufferedReader br; 
		BufferedWriter bw;
		
		StringTokenizer st;
		
		int T;
		int firstRowNum, secondRowNum;
		int[] firstRow;
		int ans, ansnum;
		try{
				br = new BufferedReader(new InputStreamReader(System.in));
				bw = new BufferedWriter(new OutputStreamWriter(System.out));

				T = Integer.parseInt(br.readLine());

			for( int t=0; t< T; t++){
					
				firstRow = new int[4];
				ans = 0;
				ansnum = 0;

				firstRowNum = Integer.parseInt(br.readLine());
				for( int i=0; i< 4; i++){
					String line = br.readLine();
					if( (i+1) == firstRowNum ){
						st = new StringTokenizer(line);
						for( int j = 0; j<4; j++){
							firstRow[j] = Integer.parseInt(st.nextToken());
						}
					}
				}
				
				secondRowNum = Integer.parseInt(br.readLine());
				for( int i=0; i< 4; i++){
					String line = br.readLine();
					if( (i+1) == secondRowNum ){
						st = new StringTokenizer(line);
						for( int w= 0; w<4; w++){
							int temp = Integer.parseInt(st.nextToken());
							for( int j = 0; j<4; j++){
								if( firstRow[j] == temp ){
									ans = firstRow[j];
									ansnum++;
								}
							}
						}
					}
				}
				
				if( ans == 0 ){
					bw.write("Case #"+(t+1)+": Volunteer cheated!\n");
				}
				else if( ansnum == 1 ){
					bw.write("Case #"+(t+1)+": "+ans+"\n");
				}
				else{
					bw.write("Case #"+(t+1)+": Bad magician!\n");
				}
			}
			br.close();
			bw.close();
		}
		catch(Exception e){
			;
		}
		
	
	}

}


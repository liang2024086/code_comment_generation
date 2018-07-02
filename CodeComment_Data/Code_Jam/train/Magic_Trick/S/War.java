package methodEmbedding.Magic_Trick.S.LYD174;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class War {
 
	public static void main(String[] args) {
 
		BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("input.txt"));

			int T = Integer.valueOf(br.readLine());
			
			for(int t=0;t<T;t++){
				
				int ans = Integer.valueOf(br.readLine());
				
				int array[][]=new int[4][4];
				for(int j=0;j<4;j++){
					String A[]= br.readLine().split(" ");
					for(int k=0;k<4;k++){
						array[j][k]=Integer.valueOf(A[k]);
					}
				}
				
				int ans2 = Integer.valueOf(br.readLine());
				
				int array2[][]=new int[4][4];
				for(int j=0;j<4;j++){
					String A[]= br.readLine().split(" ");
					for(int k=0;k<4;k++){
						array2[j][k]=Integer.valueOf(A[k]);
					}
				}

				int count=0;
				int no=0;
				for(int j=0;j<4;j++){
					for(int k=0;k<4;k++){
							if(array[ans-1][j]==array2[ans2-1][k]){
								count++;
								no=array[ans-1][j];
							}
					}
				}
				
				String output="";
				if(count==1)
					output+=no;
				else if(count>1)
					output+="Bad magician!";
				else
					output+="Volunteer cheated!";
					
				System.out.println("Case #"+(t+1)+": "+output);
				
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
}

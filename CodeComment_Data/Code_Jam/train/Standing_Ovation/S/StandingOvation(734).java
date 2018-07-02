package methodEmbedding.Standing_Ovation.S.LYD234;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class StandingOvation {
	
	public static void main(String[] args){
		

		try {
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			BufferedWriter bw = new BufferedWriter(new FileWriter( new File("A-output.txt"),false));
			
			
			int T = Integer.parseInt(br.readLine());
			
			for(int i=0;i<T;i++){
				
				String str[] = br.readLine().split(" ");
				
				int smax = Integer.parseInt(str[0]);
				char[] countList = str[1].toCharArray();
				
				int friends = 0 ;
				int tmpCount = 0 ;
				
				if(smax>0){
					
					for(int j=0;j<=smax;j++){
						
						if(tmpCount<j){
							friends += (j-tmpCount);
							tmpCount=j;
						}
						tmpCount += ( countList[j] - '0' );
						if(tmpCount>=smax) break;
						
					}
					
				}
				
				
				System.out.println("Case #"+(i+1)+": " + friends);
				bw.write("Case #"+(i+1)+": " + friends );
				bw.newLine();
			}
			
			if(br!=null)br.close();
			if(bw!=null)bw.close();
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
			
		
	}
	

}

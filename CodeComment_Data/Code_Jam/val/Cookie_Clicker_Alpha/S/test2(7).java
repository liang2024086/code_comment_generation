package methodEmbedding.Cookie_Clicker_Alpha.S.LYD293;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class test2 {
	public static final String OUT = "Case #%d: ";
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int caseCount = 0;
		
		File f = new File("data/input");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		caseCount = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=caseCount ; i++){
			double inputC=0;
			double inputF=0;
			double inputX=0;
			
			String lineString = br.readLine();
			
			StringTokenizer st = new StringTokenizer(lineString, " ");
			inputC = Double.parseDouble(st.nextToken());
			inputF = Double.parseDouble(st.nextToken());
			inputX = Double.parseDouble(st.nextToken());
			
			if(inputC > inputX){
				System.out.printf(OUT+(inputX/2)+"\n", i);
			}
			else{
				int count=0;
				double time1=0;
				double time2=0;
				while(true){
					int j=0;
					time1=0;
					time2=0;
					for(j=0; j<count; j++){
						time1 += inputC/(2+inputF*j);
					}
					time2 = time1;
					time1 += (inputX/(2+inputF*count));
					time2 += (inputC/(2+inputF*count)) + (inputX/(2+inputF*(count+1)));
					count++;
					if(time1<time2)
						break;
				}
				System.out.printf(OUT+String.format("%.7f", time1)+"\n", i);
			}
		}
		
		br.close();
	}
}

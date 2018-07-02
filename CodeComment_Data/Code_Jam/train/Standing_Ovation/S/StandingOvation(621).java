package methodEmbedding.Standing_Ovation.S.LYD983;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;




class StandingOvation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file =new File("/home/subhendu/Downloads/code.txt");
		File file_out =new File("/home/subhendu/Downloads/codejam_1_out.txt");

		//Input
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		//Output
		if (!file_out.exists()) {
			file_out.createNewFile();
		}
		FileWriter fw = new FileWriter(file_out.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);	
		String line = null;
		int j=0;
		String T =br.readLine();
		//System.out.println(T);
		int t = Integer.parseInt(T);
		while(j++<t){
			String s[] = br.readLine().split(" ");
			int sMax = Integer.parseInt(s[0]);
			char shy_index[] = s[1].toCharArray();
			int count=0;
			int sum = 0;
			for(int i = 0 ; i <=sMax ; i++ ){
				
				if((shy_index[i]-'0')!=0){
					if(sum>=i){
						sum=sum+shy_index[i]-'0';
					}
					else{
						count=count+(i-sum);
						sum=sum+(i-sum)+shy_index[i]-'0';
					}
					
				}
				
			}
			String content = "Case #"+j+":"+" "+count+"\n";
			bw.write(content);
			
		}


		
		
		//close files
		bw.close();
		br.close();
	}

}

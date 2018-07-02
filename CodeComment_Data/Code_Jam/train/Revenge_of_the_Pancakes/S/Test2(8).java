package methodEmbedding.Revenge_of_the_Pancakes.S.LYD91;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;


public class Test2 {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\syadalam.ORADEV\\Desktop\\B-small-attempt0.in")))){
			int N=Integer.parseInt(br.readLine().trim());
			BufferedWriter brout=new BufferedWriter(new FileWriter(new File("C:\\Users\\syadalam.ORADEV\\Desktop\\output2.txt")));
			for(int i=1;i<=N;i++){
				String data=br.readLine().trim();
				int length=data.length();
				int count=0;
				boolean flip=false;
				for(int j=length-1;j>=0;j--){
					if(flip){
						if(data.charAt(j)=='-'){
							continue;
						}else{
							count++;
							flip=!flip;
						}
					}else{
						if(data.charAt(j)=='+'){
							continue;
						}else{
							count++;
							flip=!flip;
						}
					}
				}
				brout.write("Case #"+i+": "+count+"\n");
			}
			
			brout.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
}

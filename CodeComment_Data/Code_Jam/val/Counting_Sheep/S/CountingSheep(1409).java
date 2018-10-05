package methodEmbedding.Counting_Sheep.S.LYD225;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) throws Exception {
		File f = new File("input.in");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		int cases = Integer.parseInt(br.readLine());
		for(int i=0; i<cases; i++){
			Set<Integer> ar = new HashSet<Integer>();
			int aCase = Integer.parseInt(br.readLine());
			
			
			int _t=0;
			int index=1;
			for(int N=aCase; ;N*=index){
				_t = N;
				if(aCase==0){
					break;
				}
				//System.out.println("Checking for "+ N);
					if(N>9){
						while(N>9){
							int temp = N%10;
							N=N/10;
							ar.add(temp);
							
							if(N<10){
								ar.add(N);
								break;
							}
						}
					}
					else{
						ar.add(N);
					}
					
					
					if(ar.size()==10){
						System.out.println(_t);
						break;
					}
					
					N=aCase;
					index++;
			}
			
			File file = new File("sheep.out");
			if(!file.exists()){
				file.createNewFile();
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			if((i+1)!=cases){
				if(ar.size()==10){
					bw.write("Case #"+(i+1)+": "+_t+"\n");
				}
				else{
					bw.write("Case #"+(i+1)+": "+"INSOMNIA\n");
				}
			}
			else{
				if(ar.size()==10){
					bw.write("Case #"+(i+1)+": "+_t);
				}
				else{
					bw.write("Case #"+(i+1)+": "+"INSOMNIA");
				}
			}
			bw.close();
			
		}
		
	}
	
	

}

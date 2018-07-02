package methodEmbedding.Counting_Sheep.S.LYD42;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class CoutningSheeps {
	public static void main(String[] args) throws NumberFormatException, IOException{
		@SuppressWarnings("resource")
		BufferedReader bReader = new BufferedReader(new FileReader(args[0]));
		File file = new File("result.txt");
		BufferedWriter bWriter = new BufferedWriter(new FileWriter(file));
		String Line;
		Vector<Integer> j=null,numbers = null;;
		int count = 0;
		while((Line=bReader.readLine())!=null){
			if(count==0){
				numbers = new Vector<Integer>(Integer.parseInt(Line),1);
				count++;
			}
			else{
				numbers.add(Integer.parseInt(Line));
			}	
		}
		bReader.close();
		
		int N,k=1;
		while(k<=numbers.size()){
			int i=1;
			N = numbers.get(k-1);
			if(N==0)
				bWriter.write("Case #"+k+": INSOMNIA\n");
			else{
				int temp=0;
				while(j.size()!=10){
					temp = N*i;
					int r =temp;
					while(r>0){
						int q = r%10;
						r/=10;
						if(!j.contains(q))
							j.add(q);
					}
					i++;
				}
				
				bWriter.write("Case #"+k+": "+ temp+"\n");
			}
			k++;
			j = new Vector<Integer>(1,1);
		}
		bWriter.flush();
		bWriter.close();
	}
}

package methodEmbedding.Standing_Ovation.S.LYD995;




import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StandingOvation {
	static String input = "C:\\Users\\Thuc\\Desktop\\input.in";
	static String output = "C:\\Users\\Thuc\\Desktop\\output.in";
	public static void main(String[] args) {
		Scanner bf;		
		try {
			bf = new Scanner(new FileReader(input));
			BufferedWriter writer = new BufferedWriter(new FileWriter(output));
			int T = bf.nextInt();
			for (int t=1;t<=T;t++){
				int Smax = bf.nextInt();
				String s = bf.next();
				int demand=0;				
				int total=Integer.parseInt(s.charAt(0)+"");
				for(int i=1;i<=Smax;i++){
					int num = Integer.parseInt(s.charAt(i)+"");
					if(num>0){
						demand = Math.max(i-total,0)+demand;					
						if(i>total)
							total=i+num;
						else
							total = total+num;					
					}
				}
				writer.write("Case #"+t+": "+demand+"\n");
			}
			
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
}


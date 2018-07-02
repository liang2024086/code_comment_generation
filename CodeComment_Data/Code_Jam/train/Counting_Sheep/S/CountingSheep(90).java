package methodEmbedding.Counting_Sheep.S.LYD382;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author bytz
 */
public class CountingSheep {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(new File("CountingSheep.in"));
		FileWriter fileWriter=new FileWriter("CountingSheep.out");
		Integer T=scanner.nextInt();
		for(int t=0;t<T;t++){
			Integer N=scanner.nextInt();
			List<Integer> digits=new ArrayList<>();
			if(N+N>N){
				long iN=0;
				while(digits.size()<10){
					iN+=N;
					long n=iN;
					while(n>0){
						int digit=(int)(n%10);
						if(!digits.contains(digit))
							digits.add(digit);
						n/=10;
					}
				}
				fileWriter.write("Case #"+(t+1)+": "+iN);fileWriter.write(System.lineSeparator());
			}
			else{
				fileWriter.write("Case #"+(t+1)+": INSOMNIA");fileWriter.write(System.lineSeparator());
			}
		}
		fileWriter.close();
		scanner.close();
	}
	
}

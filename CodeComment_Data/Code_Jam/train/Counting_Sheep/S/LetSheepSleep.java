package methodEmbedding.Counting_Sheep.S.LYD992;


import java.io.*;
import java.util.Arrays;

public class LetSheepSleep {
	public static void main(String[] args) throws FileNotFoundException{
		
		int N = 0, n = 0, dig = 0, printCase = 1, m = 2, originalN = 0;
		boolean done = false;
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		
		for(int i=0; i<10; i++){
			arr[i] = i;
		}	
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\SVF 15213\\new workspace\\GoogleCodeJam16\\src\\sheep\\A-small-attempt1.in"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\SVF 15213\\new workspace\\GoogleCodeJam16\\src\\sheep\\out.out")));
			
			int T = Integer.parseInt(br.readLine());
			
			while(T > 0){
				
				for(int i=0; i<10; i++){
					arr1[i] = 99;
				}
				
				N = Integer.parseInt(br.readLine());
				originalN = N;
				 
				done = false;
				do{
					if(N != 0){
						n = N;
						if(Arrays.equals(arr1, arr) == false){
							while(n != 0){
								dig = n % 10;
								n = n / 10;
								arr1[dig] = dig;
							}
						}
						if(Arrays.equals(arr1, arr)){
							done = true;
							m = 2;
							bw.write("Case #" + printCase + ": "+ N+"\r\n");
						} else {
							N = originalN*m;
							m++;						
						}
					} else {
						done = true;
						m = 2;
						bw.write("Case #" + printCase + ": INSOMNIA"+"\r\n");
					}
					
				}
				while(done != true);
				
				T--;
				printCase++;
				
			}
			br.close();
			bw.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}

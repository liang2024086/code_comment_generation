package methodEmbedding.Counting_Sheep.S.LYD1330;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Practice {

	public static void main(String[] args) throws IOException {
	
		/*BufferedReader reader = new BufferedReader(new FileReader("A-small-practice.in"));
		
		String NumberCases = reader.readLine();
		
		int T = Integer.parseInt(NumberCases);
		String [] arr;
		for(int i=0; i<T ; i++){
			
			String NandK = reader.readLine();
			arr = NandK.split(" ",-1);
			
			int N = Integer.parseInt(arr[0]);
			int K = Integer.parseInt(arr[1]);
			
			String table [][]   = new String[N][N];
			
			for(int a=0; a<N; a++)
			{ 	
				String line = reader.readLine();
				
				for(int b=0; b<N; b++){
					table[a][b]=Character.toString(line.charAt(b));
				}
			}
			
			//array before
			for (int q=0;q<N;q++){
				for(int w=0;w<N;w++){
					System.out.print(table[q][w]+" ");}
						System.out.println("");}
			
			for(int a=0; a<N; a++){
				
				for(int b=N-1; b>-1;b--){
					
					if(table[a][b].equals(Character.toString('.'))){
						continue;
					}
					else{
						
						for (int c=N-1; c>-1;c--){
							
							if (table[a][c].equals(Character.toString('.'))){
								table[a][c]=table[a][b];
								table[a][b]=Character.toString('.');
								break;
							}
						}
					}
				}
			}
			
			System.out.println("arr after");
			//array after 
			for (int q=0;q<N;q++){
				for(int w=0;w<N;w++){
					System.out.print(table[q][w]+" ");}
						System.out.println("");}
			System.out.println("");

		}
*/		
		//System.out.println(NumberCases);
		
	

		
		BufferedReader reader = new BufferedReader(new FileReader("A-small-attempt2.in"));
		String NumberCases = reader.readLine();
		
		PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
		Boolean AllNumbers = false;
		int ttt = 0;
		int T = Integer.parseInt(NumberCases);
		//int T = Integer.parseInt("1");
		for(int i=0; i<T ; i++){
			
			String Number = reader.readLine();
			
			int N = Integer.parseInt(Number);
			//int N = 1692; 
			int array []= new int[10]; 
			array[0]=-1;
			
			if(N==0){
				writer.println("Case #"+(i+1)+": INSOMNIA");
				continue;
			}
			
			int x=2;
			int numberOfTryes=1;
			
			String str = Integer.toString(N);
			
			while(AllNumbers!=true){
				
				
				int length = str.length();
				
				for (int t=0;t<length;t++){
					String temp = Character.toString(str.charAt(t));
						
					if (temp.equals('.')){
						continue;
					}
					else{		
						
						int inttemp = Integer.parseInt(temp);
						array[inttemp] = inttemp;
						
					}
				}
				
				str = Integer.toString(x*N);
				
				int bool=0;
				for(int w=0;w<10;w++){
					if(array[w]==w){
						bool++;
					}
				}
				
				if (bool==10){
					AllNumbers=true;
					ttt = N*numberOfTryes;
					break;
				}
				
				
				
				
				numberOfTryes++;
				
				
				
				x++;
				
				
				
				
			}
			writer.println("Case #"+(i+1)+": "+ttt);
			AllNumbers=false;
			
		} 
	
	
	
	
		writer.close();
	

		
		
		
		
		
		
		


		
	}
	

			
		
}

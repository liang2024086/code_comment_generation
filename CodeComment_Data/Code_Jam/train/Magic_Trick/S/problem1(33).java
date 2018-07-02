package methodEmbedding.Magic_Trick.S.LYD1033;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class problem1 {

	
	public static void main(String[] args){
		try{
			BufferedReader reader = new BufferedReader( new FileReader("A-small-attempt0.in") );
			PrintWriter writer = new PrintWriter("A-small-attempt0.out", "UTF-8");
			String linea = "";
			int casos = Integer.parseInt(reader.readLine()); 
			StringTokenizer st;
			for(int i = 0; i < casos; i++){
				int res1 = 0, res2 = 0, resultado = 0, repetidos = 0;
				Set<Integer> numbers = new HashSet<Integer>();
				res1 = Integer.parseInt(reader.readLine());
				for(int j = 0; j < res1; j++) linea = reader.readLine();
				st = new StringTokenizer(linea, " ");
				for(int j = 0; j < 4; j++){
					Integer act = Integer.parseInt(st.nextToken());
					numbers.add(act);
				}
				for(int j = 0; j < 4-res1; j++)linea = reader.readLine();
				res2 = Integer.parseInt(reader.readLine());
				for(int j = 0; j < res2; j++) linea = reader.readLine();
				st = new StringTokenizer(linea, " ");
				for(int j = 0; j < 4; j++){
					Integer act = Integer.parseInt(st.nextToken());
					if(numbers.contains(act)){
						resultado = act;
						repetidos++;
					}
				}
				for(int j = 0; j < 4-res2; j++)linea = reader.readLine();
				String ans;
				if(repetidos == 0){
					ans = "Volunteer cheated!";
				}else{
					if(repetidos == 1){
						ans = Integer.toString(resultado);
					}else{
						ans = "Bad magician!";
					}
				}
				System.out.println("Case #" + (i+1) + ": " + ans);
				writer.println("Case #" + (i+1) + ": " + ans);
			}
			writer.close();
			reader.close();
			}catch (Exception e){
				System.err.println("Error: " + e.getMessage());
			}
	}		
}

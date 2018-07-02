package methodEmbedding.Counting_Sheep.S.LYD105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSheep {
	public static void main(String[]args) throws IOException{
		BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(lector.readLine());
		for (int i = 1; i <= casos; i++) {
			String respuesta = "Case #"+i+": ";
			boolean[] digito = new boolean[10];
			int num = Integer.parseInt(lector.readLine());
			int nums = 1, result = 0;
			boolean cond = false;
			while (!cond&&num!=0){
				result = num*nums;
				String[] a = (result+"").split("");
				for (int j = 0; j < a.length; j++) {
					boolean control=false;
					for (int j2 = 0; j2 < digito.length&&!control; j2++) {
						if (Integer.parseInt(a[j])==j2){
							digito[j2]=true;
							control=true;
						}
					}
				}
				int c = 0;
				for (int j = 0; j < digito.length; j++) {
					if (digito[j]){
						c++;
					}
				}
				if (c==10){
					cond = true;
				}
				nums++;
			}
			if (result == 0){
				System.out.println(respuesta+"INSOMNIA");
			}
			else{
				System.out.println(respuesta+result);
			}
		}
	}
}

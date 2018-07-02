package methodEmbedding.Standing_Ovation.S.LYD532;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Concierto {
	

public static void main(String[] args) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String r = in.readLine();
	int x = Integer.parseInt(r);
	int amigos = 0;
	int personas_paradas = 0;
	for (int i = 0; i<x; i++){
		int y = 0;
		String q = in.readLine();
		String [] numeros = q.split(" ");
		String b = numeros[1];
		amigos = 0;
		personas_paradas = 0;
		for (int j = 0; j<b.length();j++){
			char c = b.charAt(j);
			String tmp = c + "";
			int num = Integer.parseInt(tmp);
			if (j == 0){
				if (num == 0) {
					amigos++;
					personas_paradas++;
				}
			}
			else{
				if (personas_paradas < j){
					amigos ++;
					personas_paradas++;
				}
			}
			personas_paradas += num;					
		}
	    y = i + 1;
		System.out.println("Case #" + y + ": " + amigos );
	}
	
//	for (int i=0; i<x ; i++){
//		suma = 0;
//		String q= in.readLine();
//		String [] numeros = q.split(" ");
//		int a = Integer.parseInt(numeros[0]);
//		String b = numeros[1];
//		for (int j= 0; j<b.length();j++){
//			char c = b.charAt(j);
//			String tmp = c + "";
//			int num = Integer.parseInt(tmp);
//			suma += num;
//		}
//		suma += a;
//		System.out.println(suma);
//		
//	}
//	System.out.println(resp);
	
	//BufferedWritter out = new BufferedWritter(new OutputStreamReader(System.out));
}

}

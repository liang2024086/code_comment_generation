package methodEmbedding.Standing_Ovation.S.LYD1314;

import java.util.*;
import java.io.*;

public class StandingOvation{

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(bf.readLine());
		for (int j=1;j<=cases;j++) {
			String[] cadena =  bf.readLine().split(" ");
			String personas = cadena[1];
			int cont = Integer.parseInt(personas.charAt(0)+""),need = 0,aux=0;
			for (int i=1;i<personas.length();i++ ) {
				if(cont>=i){
					cont+=Integer.parseInt(personas.charAt(i)+"");
				}else{
					aux = i-cont;
					need+=aux;
					cont+=aux+Integer.parseInt(personas.charAt(i)+"");
				}
			}
			System.out.println("Case #"+j+": "+need);
		}

	}
}

package methodEmbedding.Speaking_in_Tongues.S.LYD113;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class EjercicioA {
	public static boolean prueba = false;
	public static void main(String args[]){
		
 		try {
 			FileOutputStream fos = new FileOutputStream(new File("solucion.txt"));
 			char array[] =new char[27];
 			String f = "ejp mysljylc kd kxveddknmc re jsicpdrysi";
 			String h = "our language is impossible to understand";
 			for (int i = 0; i < f.length(); i++){
 				if (f.charAt(i) != ' ')
 					array[f.charAt(i) - 97] = h.charAt(i); 				
 			}
 			f = "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd";
  			h = "there are twenty six factorial possibilities";
  			for (int i = 0; i < f.length(); i++){
  				if (f.charAt(i) != ' ')
  					array[f.charAt(i) - 97] = h.charAt(i); 				
  			}
  			f = "de kr kd eoya kw aej tysr re ujdr lkgc jv";
  			h = "so it is okay if you want to just give up";
  			for (int i = 0; i < f.length(); i++){
  				if (f.charAt(i) != ' ')
  					array[f.charAt(i) - 97] = h.charAt(i); 				
  			}
  			array[25] = 'q';
  			array[16] = 'z';
  			
 			OutputStream os = System.out;
 			if (!prueba)
 				os = fos;
			Scanner s = new Scanner(new File("problema.txt"));
			int a = s.nextInt();
			s.nextLine();
			for(int i = 0; i < a; i++){			
				char  p[] = s.nextLine().toCharArray();
				for (int j = 0; j< p.length; j++){				
					if (p[j] != ' ')
						p[j] = array[p[j] - 97];
				}
				String k = new String(p);				
				os.write(("Case #" + (i + 1) + ": " + k+  "\n").getBytes());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

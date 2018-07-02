package methodEmbedding.Counting_Sheep.S.LYD93;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class EjercicioA {
	public static boolean prueba = false;
	
	public static void main(String args[]) {

		try {
			FileOutputStream fos = new FileOutputStream(
					new File("solucion.txt"));

			
			OutputStream os = System.out;
			if (!prueba)
				os = fos;
			
			Scanner s = new Scanner(new File("problema.txt"));
			int a = s.nextInt();
			
			for (int i = 0; i < a; i++) {
				int b = s.nextInt();
				int count = 0;
				boolean nums[]= new boolean[10];
				int n = 1;
				int lala = 0;
				int num, or = 0;
				while (count < 10 && lala < 10000000){
					
					num = n*b;
					or = num;
					while (num > 0){						
						if (!nums[num%10]){
							nums[num%10] = true;
							count++;
							lala = 0;
						}
						num = num/10;
					}
					lala++;
					n++;					
					
				}
				if (lala == 10000000){
					os.write(("Case #" + (i + 1) + ": INSOMNIA \n").getBytes());
				}else{
					os.write(("Case #" + (i + 1) + ": " +  or +  "\n").getBytes());
				}
			}

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

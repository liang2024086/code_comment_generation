package methodEmbedding.Magic_Trick.S.LYD1530;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Scanner;

public class EjercicioB {
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
				HashSet<Integer> nums = new HashSet<Integer>();
				for (int j = 0; j < 4 ; j++){
					for (int h = 0; h < 4 ; h++){
						if (j == b - 1)
							nums.add(s.nextInt());
						else
							s.nextInt();
					}
				}
				HashSet<Integer> nums2 = new HashSet<Integer>();
				b = s.nextInt();
				for (int j = 0; j < 4 ; j++){
					for (int h = 0; h < 4 ; h++){
						if (j == b - 1)
							nums2.add(s.nextInt());
						else
							s.nextInt();
					}
				}
				
				nums2.retainAll(nums);
				if (nums2.size() == 0)
					os.write(("Case #" + (i + 1) + ": Volunteer cheated!\n").getBytes());
				if (nums2.size() == 1)
					os.write(("Case #" + (i + 1) + ": "  + nums2.iterator().next() +  "\n").getBytes());
				if (nums2.size() > 1)
					os.write(("Case #" + (i + 1) + ": Bad magician!\n").getBytes());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
}

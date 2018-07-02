package methodEmbedding.Counting_Sheep.S.LYD1499;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.*/
import java.io.BufferedReader;
import java.io.FileReader;

class TestClass {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Harish/Downloads/A-small-attempt1.in"));
		String line = br.readLine();
		int t = Integer.parseInt(line);
		int count = 1;
		while (t-- > 0) {
			line = br.readLine();
			int l = line.length();
			if(line.equalsIgnoreCase("0")){
				System.out.println("Case #"+(count++)+": INSOMNIA");
				continue;
			}
			int quo = 0;
			int rem = 0;
			int[] digits = new int[10];
			int multiplier = 1;
			String newnum;
			while (true) {
				quo =0;
				rem =0;
				newnum = "";
				for (int i = l - 1; i >= 0; i--) {
					int num = Integer.parseInt("" + line.charAt(i));
					num = num*multiplier + quo;
					quo = num/10;
					rem = num%10;
					digits[rem] = 1;
					newnum = ""+rem+newnum;
				}
				if(quo !=0){
					digits[quo] = 1;
					newnum = ""+quo+newnum;
				}
				boolean d = true;
				for(int i=0;i<10;i++){
					if(digits[i] != 1) d = false;
				}
				if(d){
					break;
				}
				multiplier++;
			}
			System.out.println("Case #"+(count++)+": "+newnum);
		}

	}
}

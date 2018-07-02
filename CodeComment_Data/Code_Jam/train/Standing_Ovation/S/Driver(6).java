package methodEmbedding.Standing_Ovation.S.LYD1535;


public class Driver {

	static int t, s, ts, f;
	static int[] c;
	static String output;
	static String[] values;
	
	public static void main(String[] args) throws java.io.IOException {
		java.io.FileReader isr = new java.io.FileReader(new java.io.File("file.in"));
		//java.io.InputStreamReader isr = new java.io.InputStreamReader(System.in);
		java.io.BufferedReader in = new java.io.BufferedReader(isr);
		java.io.BufferedOutputStream out = new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File("output.txt")));
		
		t = Integer.parseInt(in.readLine());
		for (int r = 0; r < t; r++) {
			values = in.readLine().split(" ");
			s = Integer.parseInt(values[0]);
			char[] a = values[1].toCharArray();
			c = new int[s+1];
			for (int i = 0; i < s+1; i++) {
				c[i] = a[i] - 48;
			}
			
			ts = c[0];
			f = 0;
			for (int i = 1; i < s+1; i++) {
				while (ts < i) {
					f++;
					ts++;
				}
				ts += c[i];
			}
			
			output = "Case #" + (r+1) + ": " + f;
			if (r < t-1) {
				output += "\n";
			}
			
			out.write(output.getBytes());
		}
		out.flush();
		in.close();
		out.close();
	}
}

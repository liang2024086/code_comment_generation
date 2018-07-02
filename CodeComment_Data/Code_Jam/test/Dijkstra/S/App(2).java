package method_new_test.Dijkstra.S.LYD1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Semaphore;

public class App {
	public static final String INPUT_FILE_NAME = "input.txt";
	public static final String OUTPUT_FILE_NAME = "output.txt";
	
	public static final int MAX_THREADS = 10;

	
	public static void main(String[] args) {
		long beginTime = System.currentTimeMillis();
		
		try {
			String inputName = INPUT_FILE_NAME;
			String outputName = OUTPUT_FILE_NAME;
		
			if (args.length > 0)
				inputName = args[0];
		
			if (args.length > 1)
				outputName = args[1];
			
			String[] vector = new String[4];
			vector[0] = "1";
			vector[1] = "i";
			vector[2] = "j";
			vector[3] = "k";
			
			String[][] matix = new String[4][4];
			matix[0][0] = "1";
			matix[0][1] = "i";
			matix[0][2] = "j";
			matix[0][3] = "k";
			matix[1][0] = "i";
			matix[1][1] = "-1";
			matix[1][2] = "k";
			matix[1][3] = "-j";
			matix[2][0] = "j";
			matix[2][1] = "-k";
			matix[2][2] = "-1";
			matix[2][3] = "i";
			matix[3][0] = "k";
			matix[3][1] = "j";
			matix[3][2] = "-i";
			matix[3][3] = "-1";
			
			Semaphore semaphore = new Semaphore(MAX_THREADS);
		
			try (BufferedReader reader = new BufferedReader(new FileReader(new File(inputName)))) {
				try (PrintWriter writer = new PrintWriter(outputName)) {
					int nCases = Integer.parseInt(reader.readLine());

					List<WorkThread> threads = new ArrayList<WorkThread>();

					boolean[] results = new boolean[nCases];
					
					for (int nCase = 0; nCase < nCases; ++nCase) {
						String[] data = reader.readLine().split(" ");

						long len = Integer.parseInt(data[0]);
						long repeat = Integer.parseInt(data[1]);
						long total = len * repeat;
						String str = reader.readLine();
						
						semaphore.acquire(); 
						WorkThread thread = new WorkThread(semaphore, results, nCase, len, total, str);
						threads.add(thread);
						thread.start();
						
					}
					
					for (WorkThread thread : threads)
						thread.join();
					
					for (int nCase = 0; nCase < nCases; ++nCase) 
						writer.println("Case #" + (nCase + 1) + ": " + (results[nCase] ? "YES" : "NO"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		long endTime = System.currentTimeMillis();
		
		System.out.println(String.format("Done. Spend %d ms", endTime - beginTime));
	}
}

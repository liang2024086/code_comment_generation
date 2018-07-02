package methodEmbedding.Standing_Ovation.S.LYD605;


import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws Exception {
		String output = "";

		String pathname = "D:\\Documents\\Downloads\\A-small-attempt0.in"; // ????????????????????????????????????????????????????????????????
		File filename = new File(pathname); // ????????????????input??txt????
		InputStreamReader reader = new InputStreamReader(new FileInputStream(
				filename)); // ??????????????????reader
		BufferedReader sc = new BufferedReader(reader); // ????????????????????????????????????????????????
		// String line = "";
		// line = br.readLine();
		//
		// Scanner sc= new Scanner(System.in);
		// System.out.print (sc.readLine());
		int total = Integer.parseInt(sc.readLine());
		int starting = 1;
		//System.out.println(total);
		int[] arr = new int[total];
		for (int i = 0; i < total; i++) {
			String r1 = sc.readLine();
			String[] a1 = r1.split(" ");
			int maxshy = Integer.parseInt(a1[0]);
			//System.out.print("max Shy is ="+maxshy+"      ");
			int currentCount =0;
			int needTobeAdded=0;
			for (int digit = 0; digit <= maxshy; digit++) {
				int currentDigit=Integer.parseInt(""+a1[1].charAt(digit));
				//System.out.print(Integer.parseInt(""+a1[1].charAt(digit)));
				if(currentCount<digit){
					
					int needToBeAdd=digit-currentCount;
					//System.out.print("need to be add is :"+needToBeAdd+";");
					needTobeAdded+=needToBeAdd;
					currentCount=digit;
				}
				currentCount+=currentDigit;
				//System.out.print("current Count="+currentCount);
				//currentCount+=a1[1].charAt(digit);
			}
			output+="Case #"+(i+1)+": "+needTobeAdded+"\n";
			arr[i]=needTobeAdded;
			//System.out.println();
		}

		
		Writer writer = null;

		try {
			writer = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream("AnsCaseA.txt"), "utf-8"));
			writer.write(output);
		} catch (IOException ex) {
			// report
		} finally {
			try {
				writer.close();
			} catch (Exception ex) {
			}
		}

	}
}

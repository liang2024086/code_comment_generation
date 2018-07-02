package methodEmbedding.Magic_Trick.S.LYD620;

import java.util.*;
import java.lang.*;
import java.io.*;

public class A {
  public static void main (String[] args) {
		try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(in.readLine());
			for (int i = 0; i < num; i++) {
				int counter = 0;
				int a1RowAnswer = Integer.parseInt(in.readLine());
				for (int k = 1; k < a1RowAnswer; k++) {
					in.readLine();
					counter++;
				}
				String[] a1Row = in.readLine().split(" ");
				counter++;
				for (int k = 0; k < 4-counter; k++) {
					in.readLine();
				}
				
				counter = 0;
				int a2RowAnswer = Integer.parseInt(in.readLine());
				for (int k = 1; k < a2RowAnswer; k++) {
					in.readLine();
					counter++;
				}
				String[] a2Row = in.readLine().split(" ");
				counter++;
				for (int k = 0; k < 4-counter; k++) {
					in.readLine();
				}
				
				HashSet<String> hash = new HashSet<String>();
				for (String val : a1Row) {
					hash.add(val);
				}
				int state = 0;
				String result = "";
				for (String val : a2Row) {
					if (hash.contains(val) && state == 0) {
						state = 1;
						result = val;
					} else if (hash.contains(val)) {
						state = 2;
					} else {
					}
				}
				if (state == 0) {
					System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
				} else if (state == 1) {
					System.out.println("Case #"+(i+1)+": "+result);
				} else {
					System.out.println("Case #"+(i+1)+": "+"Bad magician!");
				}
			}
			in.close();
		} catch (Exception e) {}
	}
}

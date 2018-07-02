package methodEmbedding.Counting_Sheep.S.LYD787;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class quesA {

	public static void main(String[] args) throws IOException {
		int t, n;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		String str = "";
		int i;
		for (i = 0; i < t; i++) {
			n = s.nextInt();
			PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
			if (n == 0) {
                str = str + "Case #"+(i+1)+": INSOMNIA\n";
				
			}
			else {
	            int j = 0;
	            int arr[] = {0,0,0,0,0,0,0,0,0,0};
	            int done = 0;
	            while (true) {
	                j++;
	                int num = j*n;
	                while (num != 0) {
	                    int digit = num % 10;
	                    num = num / 10;
	                    if (arr[digit] == 0) {
	                        done += 1;
	                        arr[digit] = 1;
	                    }
	                }
	                if (done == 10) {
	                    str = str +  "Case #"+(i+1)+": "+(j*n)+"\n";
	                    break;
	                }
	            }
			}
			out.println(str);
			out.close();
		}
	}

}

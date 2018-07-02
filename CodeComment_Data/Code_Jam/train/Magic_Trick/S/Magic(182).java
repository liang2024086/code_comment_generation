package methodEmbedding.Magic_Trick.S.LYD424;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Magic {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("e:\\input.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("e:\\output.txt"));
        int cases = sc.nextInt();
        sc.nextLine();
        for (int c = 0; c < cases; c++) {
            System.out.println("Processing test case " + (c + 1));
            pw.print("Case #" + (c + 1) + ": ");
           
            int f = sc.nextInt();
        	int a[][] = new int[4][4];
        	int b[][] = new int[4][4];
        	
        	for (int i = 0; i < 4; i++) {
    			for (int j = 0; j < 4; j++) {
    				a[i][j] = sc.nextInt();
    			}
    		}

        	int s = sc.nextInt();
        	
        	for (int i = 0; i < 4; i++) {
    			for (int j = 0; j < 4; j++) {
    				b[i][j] = sc.nextInt();
    			}
    		}
        	
        	int count = 0;
        	int answer=-1;
        	for (int i = 0; i < 4; i++) {
    			for (int j = 0; j < 4; j++) {
    				if(a[f -1 ][i] == b[s-1][j]){
    					count++;
    					answer = a[f -1 ][i];
    				}
    			}
    		}
        	
        	if(count == 0){
        		pw.println("Volunteer cheated!");
        	}else if(count == 1){
        		pw.println(answer);
        	}else {
        		pw.println("Bad magician!");
        	}

            
            if(c < cases - 1){
            	sc.nextLine();
            }
        }
        pw.flush();
        pw.close();
        sc.close();
	}
}

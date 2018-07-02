package methodEmbedding.Speaking_in_Tongues.S.LYD624;

import java.io.*;
public class GoogleCodeJam1 
{
    public static void main(String[] args) throws IOException 
    {
        FileInputStream fstreami = new FileInputStream("input.txt");
        DataInputStream in = new DataInputStream(fstreami);
        FileWriter fstreamo = new FileWriter("output.txt");
        BufferedWriter out = new BufferedWriter(fstreamo);
		PrintWriter pw=new PrintWriter(out);
        int testCases = Integer.parseInt(in.readLine());
        int i = 0;
		String test;
        while(i < testCases)
        {
						test = in.readLine();
					test = test.replace('a', 'Y');
                    test = test.replace('b', 'H');
                    test = test.replace('c', 'E');
                    test = test.replace('d', 'S');
                    test = test.replace('e', 'O');
                    test = test.replace('f', 'C');
                    test = test.replace('g', 'V');
                    test = test.replace('h', 'X');
                    test = test.replace('i', 'D');
                    test = test.replace('j', 'U');
                    test = test.replace('k', 'I');
                    test = test.replace('l', 'G');
                    test = test.replace('m', 'L');
                    test = test.replace('n', 'B');
                    test = test.replace('o', 'K');
                    test = test.replace('p', 'R');
                    test = test.replace('q', 'Z');
                    test = test.replace('r', 'T');
                    test = test.replace('s', 'N');
                    test = test.replace('t', 'W');
                    test = test.replace('u', 'J');
                    test = test.replace('v', 'P');
                    test = test.replace('w', 'F');
                    test = test.replace('x', 'M');
                    test = test.replace('y', 'A');
                    test = test.replace('z', 'Q');
					test = test.toLowerCase();
						pw.println("Case #" + (i+1) + ": " + test);
					//	System.out.println("done\n");
			   i++;
            }
		in.close();
		out.close();
    }
}

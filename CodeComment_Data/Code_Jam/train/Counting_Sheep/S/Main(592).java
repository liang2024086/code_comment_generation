package methodEmbedding.Counting_Sheep.S.LYD700;


import java.io.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        // The name of the file to open.
        String fileName = "A-small-attempt0.in";

        // This will reference one line at a time
        String line = null;
        int N[];
        int T=1;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            T = Integer.parseInt(bufferedReader.readLine());
            N = new int[T];
            int linenum=0;
            while((line = bufferedReader.readLine()) != null) {
                N[linenum] = Integer.parseInt(line);
                linenum++;
                //System.out.println(line);
            }

            // Always close files.
            bufferedReader.close();

            //output array
            int Output[] = new int[T];

            //start
            for(int i=0; i<T; i++){ //starting numbers
                int digits[] = new int[10];
                int n = Math.abs(N[i]);
                if(n==0) {
                    Output[i] = 0;
                }
                else {
                    int LoopTimes = 10000;
                    for(int j=1; j<=LoopTimes; j++) {
                        int num = j * n;
                        while(num!=0) {
                            int digit = num%10;
                            num = (int) num/10;
                            digits[digit] = 1;
                        }
                        int sum = 0;
                        for(int k=0;k<10;k++) {
                            sum += digits[k];
                        }
                        if(sum == 10) {
                            Output[i] = j*n;
                            break;
                        }
                    }
                }
            }

            for(int i=0;i<T;i++) {
                int casenum = i+1;
                if(Output[i]==0)
                    System.out.println("Case #"+casenum+": INSOMNIA");
                else
                    System.out.println("Case #"+casenum+": "+Output[i]);
            }

        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
}

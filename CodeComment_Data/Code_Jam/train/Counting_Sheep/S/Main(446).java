package methodEmbedding.Counting_Sheep.S.LYD968;


import java.io.*;

public class Main {
    static BufferedWriter writer;
    static BufferedReader reader;

    public static void main(String[] args) {
//        File inFile = new File("input.in"); // input file
        File inFile = new File("A-small-attempt0.in"); // input file
        File outFile = new File("output.out"); // outfile

        try {
            FileWriter fwriter = new FileWriter(outFile);
            writer = new BufferedWriter(fwriter);
            FileReader freader = new FileReader(inFile);
            reader = new BufferedReader(freader);

            int t = Integer.parseInt(reader.readLine());
            nextLine:
            for (int i = 1; i < t + 1; i++) {
                boolean[] digits = new boolean[10];
                int n = Integer.parseInt(reader.readLine());
//                System.out.println("n:"+n);
                if(n == 0){
//                    System.out.println("Case #" + i + ": INSOMNIA");
                    writer.write("Case #" + i + ": INSOMNIA");
                    writer.newLine();
                    continue nextLine;

                }
//                System.out.println("=============================================");
//                System.out.println("n:"+n);
                int counter = 0;
                findNumber:
                while (true) {
                    counter++;
//                        System.out.println("===>temp:" + n + "*" + counter + ": " + n * counter + "<==");
                    int temp = n * counter;
                    while (temp > 0) {

//                            System.out.println("************");
//                            System.out.println("**temp%10:" + temp % 10);
//                            System.out.println("temp/10:" + temp / 10);
//                            System.out.println("************");

                        digits[temp % 10] = true;
                        temp = temp / 10;
                    }
                    for (boolean b : digits) {
                        if (!b)
                            continue findNumber;
                    }
//                    System.out.println("Case #" + i + ": " + n * counter);

                    writer.write("Case #" + i + ": " + n * counter);
                    writer.newLine();
                    continue nextLine;
                }


            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

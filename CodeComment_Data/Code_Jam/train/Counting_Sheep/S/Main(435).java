package methodEmbedding.Counting_Sheep.S.LYD918;

import java.io.*;
import java.util.*;




    public class Main {



        public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);
            Writer writer = new PrintWriter(new File("out.out"));


            int t = scanner.nextInt();
            for(int i =1;i<=t;i++)
            {
                int n = scanner.nextInt();

                if(n == 0 )
                {
                    System.out.print("Case #"+String.valueOf(i)+": ");
                    writer.write("Case #"+String.valueOf(i)+": ");
                    writer.write("INSOMNIA\n");
                    continue;
                }


                ArrayList<Character> soln = new ArrayList<Character>();

                int temp =0;
                int k =1;
                while(soln.size() <10)
                {
                    temp = k*n;
                    char[] chars = String.valueOf(temp).toCharArray();
                    for(char c:chars)
                    {
                        if(!soln.contains(c))
                        {
                            soln.add(c);

                        }
                    }

                    k++;
                }













                System.out.print("Case #" + String.valueOf(i) + ": "+String.valueOf(temp));
                writer.write("Case #"+String.valueOf(i)+": "+String.valueOf(temp));

                System.out.println();
                writer.write("\n");






            }

            writer.close();






        }
    }


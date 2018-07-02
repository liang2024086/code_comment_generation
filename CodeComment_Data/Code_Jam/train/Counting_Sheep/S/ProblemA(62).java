package methodEmbedding.Counting_Sheep.S.LYD178;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;


public class ProblemA {
    
    public static void main(String[] args) throws IOException
    {
        final int NUM = 200;
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        StringBuilder out = new StringBuilder();
        String input = in.readLine();
        
        int t = Integer.parseInt(input);
        
        long base = 0;
        long finalNumber = 0;
        
        for(int caseNumber = 1; caseNumber <= t; caseNumber++)
        {
//            TreeSet<Character> digitsLeft = new TreeSet<>();
//            digitsLeft.add('0');
//            digitsLeft.add('1');
//            digitsLeft.add('2');
//            digitsLeft.add('3');
//            digitsLeft.add('4');
//            digitsLeft.add('5');
//            digitsLeft.add('6');
//            digitsLeft.add('7');
//            digitsLeft.add('8');
//            digitsLeft.add('9');
            
            TreeSet<Character> digitsSeen = new TreeSet<>();
            
            input = in.readLine();
            base = Long.parseLong(input);
            
            boolean success = false;
            
            for(long i = 1; i < NUM; i++)
            {
                finalNumber = base * i;
                String str = "" + finalNumber;
                
                for(int j = 0; j < str.length(); j++)
                {
                    digitsSeen.add(str.charAt(j));
                }
                
                if(digitsSeen.size() == 10)
                {
                    success = true;
                    break;
                }
//                for(char digit : digitsLeft)
//                {
//                    String str = "" + finalNumber;
//                    
//                    if(str.contains("" + digit))
//                    {
//                        digitsLeft.remove(digit);
//                        
//                        if(digitsLeft.isEmpty())
//                        {
//                            break;
//                        }
//                    }
//                }
//                
//                if(digitsLeft.isEmpty())
//                {
//                    break;
//                }
            }
            
            out.append("Case #" + caseNumber + ": " + (success ? finalNumber : "INSOMNIA") + "\n");
        }
        
        in.close();
        System.out.println(out);
        
        FileWriter output = new FileWriter("output.txt");
        output.append(out.toString());
        output.close();
    }
}

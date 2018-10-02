package methodEmbedding.Counting_Sheep.S.LYD45;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodeJam {
    
    
    public static void main(String[] args) {
        File file = new File("A-small-attempt1.in");
        Scanner scanner = new Scanner(System.in);
        try{
            scanner = new Scanner(file);
        }catch(Exception e){
                e.printStackTrace();
        }
        String testCase = scanner.nextLine();
        String counter = "0";
        while(!counter.equals(testCase) && scanner.hasNextLine()){
            counter = new BigInteger(counter).add(new BigInteger("1"))+"";
            String initialNumber = scanner.nextLine();

            ArrayList<String> myMap = new ArrayList<String>();
            myMap.add("0");
            myMap.add("1");
            myMap.add("2");
            myMap.add("3");
            myMap.add("4");
            myMap.add("5");
            myMap.add("6");
            myMap.add("7");
            myMap.add("8");
            myMap.add("9");
            String initialNumber2 = "";
            boolean notyet = true;

            int count = 1;
            while(notyet){
                initialNumber2 = (new BigInteger(initialNumber)).multiply(new BigInteger(count+""))+"";
                for(int i=0; i<myMap.size(); i++){
                    String c = myMap.get(i);
                    if(initialNumber2.contains(myMap.get(i))){
                        myMap.remove(i);
                        i = -1;
                    }
                }
                if(myMap.size() == 0){
                    notyet = false;
                }else{
                    count++;
                }
                if(initialNumber.equals("0")){
                    initialNumber2 = "INSOMNIA";
                    notyet = false;
                }

            }

            try{
                File file2 = new File("output.txt");
                if (!file2.exists()) {
                    file2.createNewFile();
		}
                
                FileWriter fw = new FileWriter(file2.getAbsoluteFile(),true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Case #"+counter+": "+initialNumber2);
                bw.newLine();
		bw.close();

            }catch(Exception e){
                e.printStackTrace();
            }


        }
    }
    
}

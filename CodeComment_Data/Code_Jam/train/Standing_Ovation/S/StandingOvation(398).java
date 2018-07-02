package methodEmbedding.Standing_Ovation.S.LYD2168;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import static java.lang.Character.getNumericValue;

class StandingOvation{
    public static void main(String[] args){
        String newline = System.getProperty("line.separator");
        int count = 0;
        int answer = 0;
        String answer2;
        int number = 0;
        int initiator = 0;
        int value;
        int testCases = 0;
        char[] array;
        byte[] data;
        try{
            File file = new File("A-small-attempt0.in");
            File file2 = new File("outfile.in");
            FileReader fileReader = new FileReader(file);
            FileOutputStream fos = new FileOutputStream(file2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while((line = bufferedReader.readLine()) != null){
                if(initiator == 0){
                    testCases = Integer.parseInt(line);
                    initiator++;
                }
                for(int i = 0; i < testCases; i++){
                    line = bufferedReader.readLine();
                    array = line.toCharArray();
                    value = getNumericValue(array[0]);
                    for(int j = 0; j<=value; j++){
                        number = getNumericValue(array[j+2]);
                        if(number != 0){
                            if(count < j){
                                answer = answer + j - count;
                                count = j;
                            }
                            count = count + number;
                        }
                    }
                   answer2 = "Case #" +(i+1) +": " +answer;
                   answer2 = answer2 + newline;
                   data = answer2.getBytes();
                   fos.write(data, 0, data.length);
                   count = 0;
                   answer = 0;
                }
                break;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

package methodEmbedding.Counting_Sheep.S.LYD1063;


import org.omg.CORBA.*;

import java.io.*;
import java.io.DataInputStream;

public class Main {

    public static void main(String args[]){
        try{
            FileInputStream fstream = new FileInputStream("A-small-attempt0.in");
            DataInputStream dis = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(dis));

            FileWriter writer = new FileWriter("result.txt");

            StringWriter sw = new StringWriter();
            BufferedWriter bw = new BufferedWriter(sw);
            String pattern = "Case #%d: %s\n";
            String patString;

            int N = Integer.parseInt(br.readLine());
            int counter, remaining;
            String number;
            String auxNumber = null;
            char[] currentCount = new char[10];

            for (int i = 0; i<10; i++){
                currentCount[i] = 'e';
            }
            //number = Integer.toString((Integer.parseInt(startNumber) * 2));
            //number = br.readLine();

            System.out.println(currentCount[2]);

            for (int i = 0; i<N; i++){

                remaining = 10;
                counter = 2;
                number = br.readLine();
                System.out.println("numero investigando: "+number);

                if(Integer.parseInt(number) == 0)
                    auxNumber = "INSOMNIA";
                else {

                    for (int x = 0; x < number.length(); x++){

                        if(currentCount[number.charAt(x) - 48] == 'e'){
                            currentCount[number.charAt(x) -48] = number.charAt(x);
                            System.out.println(currentCount);
                            remaining--;
                        }

                    }

                    for(;;){

                        auxNumber = Long.toString((Long.parseLong(number) * counter));
                        System.out.println(auxNumber);
                        for (int x = 0; x < auxNumber.length(); x++){
                            //System.out.println(remaining);

                            if(remaining == 0)
                                break;

                            if(currentCount[auxNumber.charAt(x) - 48] == 'e'){
                                currentCount[auxNumber.charAt(x) -48] = auxNumber.charAt(x);
                                remaining--;
                            }
                        }

                        if(remaining == 0)
                            break;

                        counter++;
                    }

                }

                for (int j = 0; j<10; j++){
                    currentCount[j] = 'e';
                }

                //print number
                patString = String.format(pattern,i+1,auxNumber);
                writer.write(patString);

            }

            writer.close();
            dis.close();
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}

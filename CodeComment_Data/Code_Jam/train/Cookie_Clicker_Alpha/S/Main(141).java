package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1557;

import java.io.*;

public class Main {

    public static void  main(String[] args) throws IOException {
        FileWriter fichero = null;
        PrintWriter pw = null;
        fichero = new FileWriter("result.out");
        pw = new PrintWriter(fichero);
        File archivo = new File ("input.in");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        Integer numbersOfCases = Integer.parseInt(linea.toString());
        Integer numberCase = 1;
        while(numberCase <= numbersOfCases){
            linea = br.readLine();
            String[] options = linea.split(" ");
            Double costFarm = Double.valueOf(options[0]);
            Double mejora = Double.valueOf(options[1]);
            Double limit = Double.valueOf(options[2]);
            CoockieClicker cockier = new CoockieClicker(costFarm, mejora, limit);
            Double time = cockier.giveMeTime();
            String response = "Case #" + numberCase + ": " + time;
            pw.println(response);
            numberCase++;
        }
        br.close();
        fichero.close();
        pw.close();
        fr.close();
    }
}

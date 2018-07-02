package methodEmbedding.Standing_Ovation.S.LYD10;


import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main (String[] args) {
        String ficName = "input.txt";
        if (args.length > 0){
            ficName = args[0];
        }
        int i = 1;
        try{
            BufferedReader in = new BufferedReader(new FileReader(ficName));
            String ligne;
            ligne = in.readLine();
            ligne = in.readLine();
            while (ligne != null) {
                System.out.print("Case #" + i + ": ");

                //r?solution du probl?me
                String[] str_tab = ligne.split(" ");
                int shyMax = Integer.parseInt(str_tab[0]);
                int gensDebouts = 0;
                int invites = 0;
                for (int a=0;a<=shyMax;++a){
                    int personnesManquantes = a - (gensDebouts + invites);
                    if (personnesManquantes > 0){
                        invites += personnesManquantes;
                    }
                    gensDebouts += Integer.parseInt(str_tab[1].substring(a, a+1));
                }
                System.out.print(invites);
                i++;
                System.out.println();
                ligne = in.readLine();
            }
            in.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

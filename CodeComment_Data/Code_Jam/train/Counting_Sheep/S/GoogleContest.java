package methodEmbedding.Counting_Sheep.S.LYD563;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class GoogleContest {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int pruebas = Integer.parseInt(sc.nextLine());
        BufferedWriter br = new BufferedWriter(new FileWriter("output"));
        for (int i = 0; i < pruebas; i++) {
            String prueba = sc.nextLine();

            int numero = Integer.parseInt(prueba);
            if (numero == 0) {
                br.write("Case #" + String.valueOf(i + 1) +": " + "INSOMNIA");
                br.newLine();
            } else {
                boolean visto0 = false;
                boolean visto1 = false;
                boolean visto2 = false;
                boolean visto3 = false;
                boolean visto4 = false;
                boolean visto5 = false;
                boolean visto6 = false;
                boolean visto7 = false;
                boolean visto8 = false;
                boolean visto9 = false;
                int actual = 1;
                while (!(visto0 && visto1 && visto2 && visto3 && visto4 && visto5 && visto6 && visto7 && visto8 && visto9)) {
                    prueba = String.valueOf(numero * actual);
                    actual++;
                    for (int j = 0; j < prueba.length(); j++) {
                        switch (prueba.charAt(j)) {
                            case '0':
                                visto0 = true;
                                break;
                            case '1':
                                visto1 = true;
                                break;
                            case '2':
                                visto2 = true;
                                break;
                            case '3':
                                visto3 = true;
                                break;
                            case '4':
                                visto4 = true;
                                break;
                            case '5':
                                visto5 = true;
                                break;
                            case '6':
                                visto6 = true;
                                break;
                            case '7':
                                visto7 = true;
                                break;
                            case '8':
                                visto8 = true;
                                break;
                            case '9':
                                visto9 = true;
                                break;
                            default:
                                break;
                        }
                    }
                }
                br.write("Case #" + String.valueOf(i + 1) + ": " + prueba);
                br.newLine();
            }

        }
        br.close();
    }

}

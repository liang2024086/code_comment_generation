package methodEmbedding.Speaking_in_Tongues.S.LYD213;

import java.util.Scanner;
public class Codejam {
    static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("clave googlerese:");
        String input = keyboard.nextLine();
        char[] gcode = input.toCharArray();
        System.out.println("clave ingles:");
        input = keyboard.nextLine();
        char[] ecode = input.toCharArray();
        byte counter = 1;
        String[] array = new String[30];
        do
        {
        System.out.println("cosas que me manden una por una:");
        input = keyboard.nextLine();
        if (input.equals("0")) counter = 30;
        char[] result = input.toCharArray();
        for (int i = 0; i<result.length; i++)
            {
                for (int j=0; j<gcode.length; j++)
                {
                if (result[i]==gcode[j]){
                result[i]=ecode[j];
                j=gcode.length;
                }
                }
            }
        array[counter-1]= "Case #" +counter +": ";
        for (int i = 0; i < result.length; i++)
            {
                array[counter-1]+=result[i];
            }
        counter +=1;
        }
        while(counter<31);
         for (int i = 0; i < 30; i++)
            {
                System.out.println(array[i]);
            }
    }
}

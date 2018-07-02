package methodEmbedding.Standing_Ovation.S.LYD324;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        int[] array=new int[t];
        for (int j = 0; j < t; j++) {
            
            int size = s.nextInt();
            String digit = s.next();          
            int persons = 0;
            int need = 0;
            int n;
            
            for (int  i= 0; i < size + 1; i++) {

                n=digit.charAt(i) - 48;
                if (i > persons & n != 0) {
                    need +=i-persons;
                    persons += n+need;
                }
                else{
                    persons += n;
                }
            }
            array[j]=need;
        }
        for (int j = 0; j < t; j++){
            System.out.println("Case #"+(j+1)+": "+array[j]);
        }
    }
}

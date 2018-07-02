package methodEmbedding.Cookie_Clicker_Alpha.S.LYD437;



import java.util.Scanner;

public class Cookies {

    public static void main(String[] args) {
       int casos;
       int i; 
       Scanner sc = new Scanner(System.in);
       casos = sc.nextInt();
       for(i=1; i<=casos; i++)
       {
           double C, F, X, VP, T, TACUM, T2, TACUM2;
           C = sc.nextDouble();
           F = sc.nextDouble();
           X = sc.nextDouble();
           boolean sigue=true;
           TACUM=0;
           TACUM2=0;
           VP=2;
           T=0;
           while(sigue)
           {
               //OPCION1
               T2=X/VP;
               TACUM2=TACUM+T2;
               
               //OPCION2
               T=C/VP;
               TACUM=TACUM+T;
               // INCREMENTO VP
               VP=VP+F;
               T=X/VP;
               TACUM=TACUM+T;
               // PRUEBO SI DEBO SEGUIR O NO
               if( TACUM2<TACUM )
               {
                   sigue=false;
                   System.out.print("Case #"+i+": ");
                   System.out.printf ("%.7f\n", TACUM2);
               }
               else
               {
                    // REGRESO A SUS VALORES ANTERIORES del tiempo
                    TACUM=TACUM-T;
               }
           }
           
       } 
    }
    
}

package methodEmbedding.Standing_Ovation.S.LYD1887;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class A
{

    /**
     * @param args
     */
    public static void main( String[] args ) throws Exception
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader( System.in ));
        
        int numeroCasos = Integer.parseInt(bf.readLine( ));
        int caso=1;
        int tamanho = 0;
        int parados = 0;
        int invitados = 0;
        while(caso<=numeroCasos)
        {
            parados = 0;
            invitados = 0;
            char[] arreglo = bf.readLine( ).toCharArray( );
            tamanho = Integer.parseInt( "" + arreglo[0]);
            for( int i = 0; i < arreglo.length-2; i++ )
            {
                if(parados>=tamanho)
                    break;
                if(parados<i)
                {
                    invitados+=(i-parados);
                    parados=i;
                }
                
                parados+=Integer.parseInt( "" + arreglo[i+2]);
                    
            }
            
            System.out.println("Case #" + caso++ + ": " + invitados);
            
        }
        
        bf.close( );

    }

}

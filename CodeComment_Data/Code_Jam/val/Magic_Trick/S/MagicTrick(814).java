package methodEmbedding.Magic_Trick.S.LYD1928;

/**
 *
 * @author Julio
 */
public class MagicTrick {

        public static void main (String args[]) throws java.lang.Exception
    {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.PrintWriter out = new java.io.PrintWriter(System.out);

        int s = Integer.parseInt(br.readLine());

        int r1,r2 = 0;
        String res ="";
        int caso = 1;

        String[] tabla1 = new String[4];
        String[] tabla2 = new String[4];

        while(s-->0)
        {
            r1 = Integer.parseInt(br.readLine());

            for(int x = 1; x < 5; x++)
            {
                String temp = br.readLine();
                if(x == r1)
                {
                    tabla1 =  temp.split(" ");
                }
            }

            r2 = Integer.parseInt(br.readLine());

            for(int x = 1; x < 5; x++)
            {
                String temp = br.readLine();
                if(x == r2)
                {
                    tabla2 =  temp.split(" ");
                }
            }


            //Averiguemos
            for(int x = 0; x < 4; x++)
            {
                if(res.equals("Bad magician!"))
                    break;

                for(int y = 0; y < 4; y++)
                {
                    if(tabla1[x].equals(tabla2[y]))
                    {
                        //si lo encontr??, lo guarda
                        if(res.equals(""))
                            res = tabla1[x];
                        //si ya hab??a encontrado, es un mal mago
                        else
                        {
                            res = "Bad magician!";
                            break;
                        }
                    }
                }
            }

            //Si despu??s de esto no encontr?? nada, el voluntario hizo trampa

            if(res.equals(""))
                res = "Volunteer cheated!";

            out.println("Case #" + caso + ": " + res);

            //Limpiamos todo
            res = "";
            caso++;
        }


        out.close();
    }

}

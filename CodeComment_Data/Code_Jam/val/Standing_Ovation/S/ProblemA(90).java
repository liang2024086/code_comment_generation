package methodEmbedding.Standing_Ovation.S.LYD221;

import java.util.*;
import java.io.*;
public class ProblemA
{
    public static void main(String [] args)throws Exception
    {
        String nombreArchivo = "A-small-attempt0.in";
        Scanner sc = new Scanner(new FileReader(nombreArchivo));
        PrintWriter pw = new PrintWriter(new FileWriter("solutionA.txt"));
        int testCases = sc.nextInt();
        int smax=0,invite=0, shadies=0,k=0;
        String ks="";

        sc.nextLine();
    //    System.out.println(testCases);

        for(int t = 1; t <= testCases ; t ++)
        {
			k=0;
			invite=0;
			shadies=0;
	//		System.out.println("Caso n?mero: "+t);
         	smax=sc.nextInt();
  //       	System.out.println("smax= "+smax);

         	ks=sc.nextInt()+"";


			while(ks.length()<=smax)
				ks="0"+ks;
	//		System.out.println("ks= "+ks);

			shadies=ks.charAt(k)-48;
			k++;

			while(smax>=k)
			{
				if(smax!=0)
				{

					if(ks.charAt(k)>0)
					{

//						System.out.println("k= "+k+"\nShadies="+shadies);
	//					System.out.println(shadies+"<"+k);
						if(shadies<k)
						{
	//						System.out.println(shadies+"<"+k);
							invite+=k-(int)shadies;
							shadies++;
	//						System.out.println("shadies? "+shadies+"   invite? "+invite);

						}
//						System.out.println(shadies+"+"+(ks.charAt(k)-48));
						shadies+=ks.charAt(k)-48;
//						System.out.println("shadies?2"+shadies);
					}
					//shadies=k;
//					System.out.println("hola2"+shadies+" invite: "+invite);


					k++;
//					System.out.println("k= "+k+"\n\n");
				}
				else
				{
					invite=0;
					k++;

				}
			}

            pw.println("Case #"+t+": " + invite);
         //   sc.nextLine();
        }
        sc.close();
 //       pw.flush();
        pw.close();
    }

}

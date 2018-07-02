package methodEmbedding.Counting_Sheep.S.LYD40;

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
        int numdig=0;
        long sheep=0,sheepor,i;
        String sheepstr="";
        String fois="";
        boolean a1=false,a2=false,a3=false,a4=false,a5=false,a6=false,a7=false,a8=false,a9=false,a0=false;

        sc.nextLine();

        for(int t = 1; t <= testCases ; t ++)
        {
			i=1;
			sheep=0;
			sheepstr="";
			fois="";
			a1=false;a2=false;a3=false;a4=false;a5=false;a6=false;a7=false;a8=false;a9=false;a0=false;
			sheepor=sc.nextInt();
			fois=sheepor+"";
			if(sheepor==0)
				fois="INSOMNIA";
			else
			{
				while(!a1 || !a2 ||!a3 ||!a4 ||!a5 ||!a6 || !a7 ||!a8 ||!a9 || !a0)
				{
					sheep=(i++)*sheepor;
					sheepstr=sheep+"";
					for(numdig=0;numdig<String.valueOf(sheep).length();numdig++)
					{
						if(sheepstr.charAt(numdig)=='0') a0=true;
						if(sheepstr.charAt(numdig)=='1') a1=true;
						if(sheepstr.charAt(numdig)=='2') a2=true;
						if(sheepstr.charAt(numdig)=='3') a3=true;
						if(sheepstr.charAt(numdig)=='4') a4=true;
						if(sheepstr.charAt(numdig)=='5') a5=true;
						if(sheepstr.charAt(numdig)=='6') a6=true;
						if(sheepstr.charAt(numdig)=='7') a7=true;
						if(sheepstr.charAt(numdig)=='8') a8=true;
						if(sheepstr.charAt(numdig)=='9') a9=true;
					}
					if(i>900)
						break;
				}
				fois=sheepstr;
			}
            pw.println("Case #"+t+": " + fois);
        }
        sc.close();
        pw.close();
    }
}

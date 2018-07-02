package methodEmbedding.Counting_Sheep.S.LYD412;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Adarsh
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.text.DecimalFormat;
import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {


			long startTime = System.currentTimeMillis();
            int N,N1,index,j,output=-1,N2;
            int arr[]= new int[10];


            // initialiing
            for(int i=0;i<10;i++)
            {
                arr[i]=-1;
            }


            Reader reader = new FileReader("small1.in");
			BufferedReader bufReader = new BufferedReader(reader);
			String x = bufReader.readLine();


            int numOfTestCases = Integer.parseInt(x);
			int count = 0;

			File file = new File("small1.out");
			FileWriter writer = new FileWriter(file);


            for(count =1; count<= numOfTestCases; count++) {
                 N = Integer.parseInt(bufReader.readLine());
                 N1=N;
                 output=-1;
                   //System.out.println("case "+ count);

                  for(int i=0;i<10;i++)
                    {
                        arr[i]=-1;
                    }
                   for(int i=1;i<102;i++)
                    {
                        N2=N1;
                         while(N1>0)
                         {
                            index=N1%10;
                            arr[index]=index;
                            N1=N1/10;
                         }
                        for(j=0;j<10;j++)
                        {
                            if(arr[j]==-1)
                                break;
                        }
             //           System.out.println("j value N value"+j+"  "+N2);
                        if(j==10)
                        {
                            output=N2;
                            break;
                        }
                        else
                        {
                            N1=N*(i+1);
                        }
                    }
                //int output = new stand().getTime(secondLine[0], secondLine[1]);
                 if(output==-1){
				writer.write("Case #" + count + ": INSOMNIA" +"\n");
				System.out.println("Case #" + count + ": INSOMNIA" );
                 }
                 else{

				writer.write("Case #" + count + ": " + output+"\n");
				System.out.println("Case #" + count + ": " + output);
                 }
			}
			writer.close();
			System.out.println("Total time = " + (System.currentTimeMillis() - startTime));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

}

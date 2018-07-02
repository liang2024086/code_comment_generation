package methodEmbedding.Counting_Sheep.S.LYD1289;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vineet
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GoogleCodeJam {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		File x=new File("C:\\Users\\vineet\\Downloads\\A-small-attempt0.in");
		File y=new File("C:\\Users\\vineet\\Downloads\\out.out");
		BufferedReader infile=new BufferedReader(new FileReader(x));
		BufferedWriter outfile=new BufferedWriter(new FileWriter(y,true));
		int number=Integer.parseInt(infile.readLine());
		for(int j=1;j<=number;j++){
                    boolean valid=true;
                    int N=Integer.parseInt(infile.readLine());
                    int i=1;
                    int test[]=new int[10];
                    int temp=N;
                    while(valid){                        
                        if(temp==0){
                            outfile.write("Case #"+(j)+": INSOMNIA\n");
                            break;
                        }
                        while(temp>0){
                            int rem=temp%10;
                            temp/=10;
                            test[rem]=1;
                        }
                        for(int k=0;k<10;k++){
                            valid=false;
                            if(test[k]!=1){
                                valid=true;
                                break;
                            }
                        }
                        temp=N*++i;
                    }
                    if(N!=0)
                        outfile.write("Case #"+(j)+": "+N*(i-1)+"\n");
                    
                }
		outfile.close();
		infile.close();
}
}


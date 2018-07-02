package methodEmbedding.Counting_Sheep.S.LYD179;

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
		File file1=new File("C:\\Users\\vineet\\Documents\\NetBeansProjects\\GoogleCodeJam\\src\\googlecodejam\\A-small-attempt0.in");
		File file2=new File("C:\\Users\\vineet\\Documents\\NetBeansProjects\\GoogleCodeJam\\src\\googlecodejam\\output.out");
		BufferedReader infile=new BufferedReader(new FileReader(file1));
		BufferedWriter outfile=new BufferedWriter(new FileWriter(file2,true));
		int num=Integer.parseInt(infile.readLine());
		for(int j=1;j<=num;j++){
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


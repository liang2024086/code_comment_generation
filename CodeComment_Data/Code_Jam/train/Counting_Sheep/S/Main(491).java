package methodEmbedding.Counting_Sheep.S.LYD802;

import java.io.*;
import java.util.Scanner;
import java.util.Formatter;
public class Main {
public static void main(String args[]) throws FileNotFoundException{
Scanner fin=new Scanner(new File("a.in"));
Formatter fout=new Formatter(new File("bo.in"));
int T=fin.nextInt();
for(int count=0;count<T;count++){
boolean[] bord={false,false,false,false,false,false,false,false,false,false};
int number=fin.nextInt();
int snumber=number;
int g=0;
int j=1;
while(number!=0){
	
	 g=number;
	while (number > 0) {
	    int digit=(number % 10);
	    bord[digit]=true;
	    number = number / 10;
	    }
//here we will check all the digits are true or not
int c=0;
	for(int i=0;i<10;i++){
		if(bord[i]==true)
			c++;
			}
	if(c==10)
		break;
	
	j++;
	number=snumber*j;
	System.out.println("number incrimented"+number);
}
//now here all the printing stuff will take place.
if(snumber==0){
	fout.format("Case #%d: INSOMNIA\n",count+1);
}else{
fout.format("Case #%d: %d\n",count+1,g);
}
System.out.println(" \n \n \n casedkjasfhk \n \n \n");
}
fin.close();
fout.close();
}
}

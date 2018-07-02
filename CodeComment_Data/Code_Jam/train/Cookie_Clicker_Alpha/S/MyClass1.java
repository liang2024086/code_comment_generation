package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1285;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashSet;


class MyClass1 
{


public static void main(String[] arguments) throws Exception
{
BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Java\\B-small-attempt0.in")));
BufferedWriter bw=new BufferedWriter(new FileWriter(new File("C:\\Java\\B-small-attempt0.out")));
//BufferedWriter bw2=new BufferedWriter(new FileWriter(new File("C:\\Java\\PractiseData1.out")));	

int T = java.lang.Integer.parseInt(br.readLine());
double C,F,X;
double PTotal,Total,Cumul,farm;
for(int i=0;i<T;++i)
{

String Values[] = br.readLine().split(" ");
C = java.lang.Double.parseDouble(Values[0]);
F = java.lang.Double.parseDouble(Values[1]);
X = java.lang.Double.parseDouble(Values[2]);

PTotal=0.0;
Total=0.0;
farm = 0.0;
Cumul = 0.0;
while(true)
{
if(farm>0)
{
Cumul = Cumul + (C / (((farm-1)*(F))+2));
}
Total = (X / (farm*F + 2 )) + Cumul;

if(farm>0)
{
if(PTotal< Total)
{
break;
}

}
PTotal = Total;
farm++;
}

bw.write("Case #"+(i+1)+": "+PTotal);

bw.newLine();
//bw2.newLine();

//bw2.close();
}
bw.close();


}
}



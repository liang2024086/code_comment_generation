package methodEmbedding.Magic_Trick.S.LYD1750;

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
BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Java\\A-small-attempt0.in")));
BufferedWriter bw=new BufferedWriter(new FileWriter(new File("C:\\Java\\A-small-attempt0.out")));
//BufferedWriter bw2=new BufferedWriter(new FileWriter(new File("C:\\Java\\PractiseData1.out")));	

int T = java.lang.Integer.parseInt(br.readLine()),N,firstAns,secondAns;
String ArrayLine[];
for(int i=0;i<T;++i)
{

int[] Array1 = new int[4];
int[] Array2 = new int[4];
firstAns=java.lang.Integer.parseInt(br.readLine());
for(int j=0;j<4;j++)
{
ArrayLine= br.readLine().split(" ");
if((j+1)==firstAns)
{

Array1[0] = java.lang.Integer.parseInt(ArrayLine[0]);
Array1[1] = java.lang.Integer.parseInt(ArrayLine[1]);
Array1[2] = java.lang.Integer.parseInt(ArrayLine[2]);
Array1[3] = java.lang.Integer.parseInt(ArrayLine[3]);
}
}
secondAns=java.lang.Integer.parseInt(br.readLine());
for(int j=0;j<4;j++)
{
ArrayLine=br.readLine().split(" ");
if((j+1)==secondAns)
{
Array2[0] = java.lang.Integer.parseInt(ArrayLine[0]);
Array2[1] = java.lang.Integer.parseInt(ArrayLine[1]);
Array2[2] = java.lang.Integer.parseInt(ArrayLine[2]);
Array2[3] = java.lang.Integer.parseInt(ArrayLine[3]);
}
}

int duplicate = 0;
int Number=0;
for(int j = 0;j<4;j++)
{
for(int k=0;k<4;k++)
{
if(Array1[j]==Array2[k]){ duplicate++;
Number= Array1[j];
}

}
}

if(duplicate==1)
{
bw.write("Case #"+(i+1)+": "+Number);

}
if(duplicate>1)
{
bw.write("Case #"+(i+1)+": Bad magician!");

}
if(duplicate==0)
{
bw.write("Case #"+(i+1)+": Volunteer cheated!");
}
bw.newLine();
//bw2.newLine();

//bw2.close();
}
bw.close();


}
}



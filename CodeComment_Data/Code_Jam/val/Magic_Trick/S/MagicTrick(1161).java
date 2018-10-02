package methodEmbedding.Magic_Trick.S.LYD1824;

import java.io.*;
import java.util.*;

public class MagicTrick{

public static void main(String[] args)throws IOException{
BufferedReader bf=new BufferedReader(new FileReader("A-small-practice.in"));
PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("A-small-practice.out")));

StringTokenizer st;
int row;
int numbers1[]=new int [4];
int numbers2[]=new int [4];
int cases=1;

int t=Integer.parseInt(bf.readLine());

while(t>0){
int number=0;
int coin=0;
row=Integer.parseInt(bf.readLine());
for(int i=1;i<=4;i++){
if(row==i){
st=new StringTokenizer(bf.readLine());
numbers1[0]=Integer.parseInt(st.nextToken());numbers1[1]=Integer.parseInt(st.nextToken());
numbers1[2]=Integer.parseInt(st.nextToken());numbers1[3]=Integer.parseInt(st.nextToken());
}else
bf.readLine();
}

row=Integer.parseInt(bf.readLine());
for(int i=1;i<=4;i++){
if(row==i){
st=new StringTokenizer(bf.readLine());
numbers2[0]=Integer.parseInt(st.nextToken());numbers2[1]=Integer.parseInt(st.nextToken());
numbers2[2]=Integer.parseInt(st.nextToken());numbers2[3]=Integer.parseInt(st.nextToken());
}else
bf.readLine();
}

for(int i=0;i<4;i++){
for(int j=0;j<4;j++){
if(numbers1[i]==numbers2[j]){
coin++;number=numbers1[i];
}
}
}

if(coin==1) out.println("Case #"+cases+": "+number);
if(coin>1) out.println("Case #"+cases+": Bad magician!");
if(coin==0) out.println("Case #"+cases+": Volunteer cheated!");

cases++;
t--;

}

out.close();
System.exit(0);

}
}

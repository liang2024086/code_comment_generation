package methodEmbedding.Magic_Trick.S.LYD1466;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class MagicTrickPablo {

public static void main(String[] args) throws IOException {
	File input = new File("C:/Users/Pablo/Documents/A-small-attempt2.in");
Scanner k=new Scanner(input);
int t=k.nextInt();
File file=new File("C:/Users/Pablo/Documents/CodeJam/MagicTrickPablo.txt");
PrintWriter out=new PrintWriter(file);
for(int i = 1; i<=t;i++){
int rowNum1=k.nextInt();
int[][]case1=new int[4][4];
for(int rows=0; rows<4; rows++){
for(int cols=0; cols<4; cols++){
case1[rows][cols]=k.nextInt();
}
}
int rowNum2=k.nextInt();
int[][]case2=new int[4][4];
for(int rows=0; rows<4; rows++){
for(int cols=0; cols<4; cols++){
case2[rows][cols]=k.nextInt();
}
}
ArrayList <Integer> sameNums=new ArrayList<Integer>();
rowNum1--;
rowNum2--;
for(int y=0; y<4;y++){
for(int z=0;z<4;z++){
if(case1[rowNum1][y]==case2[rowNum2][z]){
sameNums.add(case1[rowNum1][y]);
}
}
}

if(sameNums.size()==1){
out.println("Case #"+i+": "+sameNums.get(0));	
}
else if(sameNums.size()>1){
out.println("Case #"+i+": Bad magician!");
}
else{
out.println("Case #"+i+": Volunteer cheated!");
}


}
out.close();

}

}

package methodEmbedding.Revenge_of_the_Pancakes.S.LYD475;

import java.io.*;
public class happycake {
public static void main(String args[]) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int T=Integer.parseInt(br.readLine());
for(int i=0; i<T; i++){
char[] inx = br.readLine().toCharArray();
int turns = 0;
char lastChar = inx[inx.length-1];
if(lastChar == '-') turns++;
for(int j=inx.length-2; j>=0; j--){
if(inx[j] != lastChar ){
lastChar = inx[j];
turns++;}}
System.out.println("Case #"+(i+1)+": " + turns);}}}

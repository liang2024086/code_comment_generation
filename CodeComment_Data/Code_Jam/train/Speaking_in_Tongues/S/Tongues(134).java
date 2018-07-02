package methodEmbedding.Speaking_in_Tongues.S.LYD1041;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import java.util.HashMap;

public class Tongues {
    public Tongues() {
        super();
    }
    public static void main(String args[]){
    RandomAccessFile inputFile = null;
    char[] key = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] value = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
    try{
        inputFile =  new RandomAccessFile("/scratch/input.txt","r");
                String line = inputFile.readLine();
                line = line.trim();
                char[] lc = line.toCharArray();
                int i = 0;
                int l = 0;
                while(lc.length >i && lc[i]>='0' && lc[i] <= '9'  ){
                  l =  l *10 + lc[i]-48;
                    i++;
                }
                for(int rc = 0 ; rc <l;rc++){
                    line = inputFile.readLine();
                    String op = "";
                    byte [] ca = line.getBytes();
                    for(int j=0; j<ca.length;j++){
                        if(ca[j]>='a' && ca[j]<='z'){
                          op = op + value[ca[j]-97]  ;
                        } else {
                            op = op + (char)ca[j];
                        }
                    }
                    System.out.println("Case #" +(rc+1) + ": " + op);
                }            
            }catch(FileNotFoundException fe){
                fe.printStackTrace();
                } catch(IOException ioe){
                    ioe.printStackTrace();
                    } catch(Exception e){
                        e.printStackTrace();
                    }
            finally {
                try{
                        inputFile.close(); 
                }catch(Exception e){
                    e.printStackTrace();
                }
    }
    }
}

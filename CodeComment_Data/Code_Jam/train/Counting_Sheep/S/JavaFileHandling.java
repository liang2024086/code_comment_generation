package methodEmbedding.Counting_Sheep.S.LYD793;



public class JavaFileHandling 
{

    public static void main(String[] args) 
    {
        readFromFile read=new readFromFile();
        read.openFile();
        read.readFile();
        read.closeFile();
    }
    
}

package methodEmbedding.Magic_Trick.S.LYD701;


import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		ParseFile parseFile = new ParseFile();
		List<Test> tests = parseFile.parse();
		int testCount =1;
		for(Test test: tests)
		{
			System.out.println("Case #"+testCount+": "+test.find());
			testCount++;
		}
	}
}

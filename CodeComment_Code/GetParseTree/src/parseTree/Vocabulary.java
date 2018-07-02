package parseTree;

import java.lang.Math;
import java.util.HashMap;
import java.util.Map.Entry;

public class Vocabulary{

	HashMap<String,Integer> codeWordToIndex = new HashMap<String,Integer>();
	HashMap<Integer,String> codeIndexToWord = new HashMap<Integer,String>();
	HashMap<Integer,Integer> codeWordNums = new HashMap<Integer,Integer>();

	HashMap<String,Integer> langWordToIndex = new HashMap<String,Integer>();
	HashMap<Integer,String> langIndexToWord = new HashMap<Integer,String>();

	HashMap<String,Integer> rawCodeWordToIndex = new HashMap<String,Integer>();
	HashMap<Integer,String> rawCodeIndexToWord = new HashMap<Integer,String>();
	HashMap<Integer,Integer> rawCodeWordNums = new HashMap<Integer,Integer>();

	HashMap<Integer,String> interNodeToName = new HashMap<Integer,String>();
	HashMap<String,Integer> interNodeToIndex = new HashMap<String,Integer>();

	private int dim ;
	public Vocabulary(int dim){
		this.dim = dim;
	}

	public int getCodeSize(){
		return codeWordToIndex.size();
	}

	public int getLangSize(){
		return langWordToIndex.size();
	}

	public int getCodeWordIndex(String word){
		if (codeWordToIndex.get(word) == null){
		    return 0;
		}
		else
		  return codeWordToIndex.get(word);
	}

	public int getInterNodeIndex(String word){
		if (interNodeToIndex.get(word) == null){
		    return -1;
		}else
		    return interNodeToIndex.get(word);
	}

	public HashMap<Integer,String> getInterNodeToName(){
		return this.interNodeToName;
	}

	public HashMap<String,Integer> getInterNodeToIndex(){
		return this.interNodeToIndex;
	}

	public HashMap<String,Integer> getCodeWordToIndex(){
		return this.codeWordToIndex;
	}

	public HashMap<Integer,String> getCodeIndexToWord(){
		return this.codeIndexToWord;
	}

	public HashMap<String,Integer> getLangWordToIndex(){
		return this.langWordToIndex;
	}

	public HashMap<Integer,String> getLangIndexToWord(){
		return this.langIndexToWord;
	}

	public HashMap<Integer,Integer> getCodeWordNums(){
		return this.codeWordNums;
	}

	public void codeWordFilter(){
	    int wordIndex = 1;
	    codeWordToIndex.put("UNK",0);
	    codeIndexToWord.put(0,"UNK");
	    codeWordNums.put(0,0);

	    for (Entry<Integer, String> en : rawCodeIndexToWord.entrySet()){
		if (rawCodeWordNums.get(en.getKey()) > 5){
		    codeWordToIndex.put(en.getValue(),wordIndex);
		    codeIndexToWord.put(wordIndex,en.getValue());
		    codeWordNums.put(wordIndex,rawCodeWordNums.get(en.getKey()));
		    wordIndex++;
		}else{
		    codeWordNums.put(0,codeWordNums.get(0)+1);
		}
	    }
	
	}

	public boolean addCode(String codeWord){
		if (rawCodeWordToIndex.containsKey(codeWord)){
			rawCodeWordNums.put(rawCodeWordToIndex.get(codeWord),rawCodeWordNums.get(rawCodeWordToIndex.get(codeWord))+1);
			return false;
		}
		else{
			int length = rawCodeWordToIndex.size();
			rawCodeWordToIndex.put(codeWord,Integer.valueOf(length));
			rawCodeIndexToWord.put(Integer.valueOf(length),codeWord);
			rawCodeWordNums.put(Integer.valueOf(length),1);
			return true;
		}
	}

	public boolean addInterNodeWord(String word){
	    if (!interNodeToIndex.containsKey(word)){
		int length = interNodeToIndex.size();
		interNodeToIndex.put(word,Integer.valueOf(length));
		interNodeToName.put(Integer.valueOf(length),word);
		return true;
	    }
	    return true;
	}

	public boolean addLanguage(String word){
		if (langWordToIndex.containsKey(word))
			return false;
		else{
			int length = langWordToIndex.size();
			langWordToIndex.put(word,Integer.valueOf(length));
			langIndexToWord.put(Integer.valueOf(length),word);
			return true;
		}
	}
}

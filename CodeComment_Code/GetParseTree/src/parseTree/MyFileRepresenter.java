package parseTree;

import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;

public class MyFileRepresenter {
	public String filePath = null;
	public LinkedList<String> codes = new LinkedList<String>();
	public LinkedList<String> comments = new LinkedList<String>();
        public HashMap<String, LinkedList<String>> methodCodes = new HashMap<String, LinkedList<String>>();
        public HashMap<String, LinkedList<String>> methodComments = new HashMap<String, LinkedList<String>>();
        public MyFileRepresenter(String filePath, LinkedList<String> codes, LinkedList<String> comments, HashMap<String, LinkedList<String>> methodCodes, HashMap<String, LinkedList<String>> methodComments){
                this.filePath = filePath;
                this.codes = codes;
                this.comments = comments;
                this.methodCodes = methodCodes;
                this.methodComments = methodComments;
	}
}

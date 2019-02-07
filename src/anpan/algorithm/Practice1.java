package anpan.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Practice1 {
	
	static String[] participant = {"leo","kiki","eden","eden"};
	static String[] completion = {"eden","kiki","leo"};
	
	public static String solution(String[] participant , String[] completion) {
		
		String result="";
		
		Vector<String> vt = new Vector<String>();
		
		for(int i=0;i<participant.length;i++) {
			vt.addElement(participant[i]);
		}
		
		for(int i=0;i<completion.length;i++) {
			vt.remove(vt.indexOf(completion[i]));
		}
		
		result =vt.get(0);
		return result;
		
	}
	
	public static String refactorSolution(String[] participants , String[] completions) {
		
		String result="";
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(String participant : participant) {
			map.put(participant, map.getOrDefault(participant, 0)+1);
		}
		for(String completion : completion) {
			map.put(completion, map.getOrDefault(completion, 0)-1);
		}
		
		for(String key: map.keySet()) {
			if(map.get(key) !=0) {
				result = key;
				break;
			}
		}
		
		return result;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String result = refactorSolution(participant,completion);
		System.out.println(result);
		
	}

}

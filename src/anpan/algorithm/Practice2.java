package anpan.algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Practice2 {
	
	static String[] phoneBook = {"546","12","12358","44740"};
	
	public static boolean solution(String[] phoneBook) {
		
		boolean result =true;
		
		Arrays.sort(phoneBook, (a,b)->Integer.compare(a.length(),b.length()));
		
		String compareNum ="";
		for(int i=0; i <phoneBook.length-1 ; i++ ) {
			compareNum = phoneBook[i];
			for(int j=i+1; j<phoneBook.length;j++) {
				if(phoneBook[j].indexOf(compareNum) == 0) {
					result = false;
					break;
				};
			}
		}
		return result;
		
	}
	
    public static boolean solution2(String[] phoneBook) {
        Arrays.sort(phoneBook);
        boolean result = true;
        for (int i=0; i<phoneBook.length-1; i++) {
        	System.out.println(phoneBook[i]);
            if (phoneBook[i+1].contains(phoneBook[i])) {
                result = false;
                break;
            }
        }
        return result;
    }
    
    public static boolean solution3(String[] phoneBook) {
        boolean answer = true;

         HashSet hm = new HashSet();
         for(String num : phoneBook)
         {
             hm.add(num);
         }

         for(String tel : phoneBook)
         {
             Iterator it = hm.iterator();
             while(it.hasNext())
             {
                 String def = (String) it.next();
                 if(def.startsWith(tel) && def.equals(tel) == false)
                     return false;
             }
         }
         return answer;
     }
	
	public static void main(String[] args) {
		System.out.println(solution(phoneBook));;
		System.out.println(solution2(phoneBook));;		
		
		
	}
}

package anpan.algorithm;

import java.util.HashMap;

public class Practice3 {

	static String[][] arg = {{"yellow_hat","headgear"},{"blue_sunglasses","eyewear"},{"green_turban","headgear"}};
	
    public static int solution(String[][] clothes) {
    	int answer = 0;
        //의상의 종류에 따른 개수를 담을 HashMap
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<clothes.length;i++)
        	map.put(clothes[i][1], map.getOrDefault(clothes[i][1] , 0)+1);
            //map.put(clothes[i][1], map.get(clothes[i][1]) == null ? 1 : map.get(clothes[i][1]) + 1);

        int numMulCase = 1;
        //조합
        for(int i : map.values()){
        	numMulCase *= i+1;
        }
        answer = numMulCase -1;
        return answer;
    }
    
    public static void main(String[] args) {
    	System.out.println(solution(arg));
	}

}

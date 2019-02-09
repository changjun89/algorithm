package anpan.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Practice4 {
	
	//[classic, pop, classic, classic, pop]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
	static String[] genres = {"classic", "pop", "classic", "classic", "pop"};
	static int[] plays = {500, 600, 150, 800, 2500};
	
	public static int[] solution(String[] genres, int[] plays) {
		
		HashMap<String,Integer> genreTotal = new HashMap<String,Integer>();
		genreTotal.
		
		for(int i=0; i<genres.length; i++) {
        	genreTotal.put(genres[i], genreTotal.getOrDefault(genres[i],0)+plays[i]);
        	
        }
        
        
		int[] answer = {};
        return answer;
    }

	public static void main(String[] args) {
		System.out.println(solution(genres,plays));
	}

}

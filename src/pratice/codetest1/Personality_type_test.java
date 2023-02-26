package pratice.codetest1;

import java.util.HashMap;
import java.util.Map;

public class Personality_type_test {

	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		Map<Character, Integer> map = new HashMap<>();
		
		 for(int i=0; i<survey.length; i++) {
			 int cho = choices[i];
			 char a = survey[i].charAt(0);
			 char b = survey[i].charAt(1);
			 
			 if(cho > 0 && cho <4) {
				 map.put(a, map.getOrDefault(a, 0) + 4 - cho);
			 }else if(cho > 4) {
				 map.put(b, map.getOrDefault(b, 0) + cho - 4);
			 }
		 }
		 String answer = "";
		 StringBuilder ans = new StringBuilder();
		 ans.append(map.getOrDefault('R',0) >= map.getOrDefault('T', 0) ?  'R' : 'T');
		 ans.append(map.getOrDefault('C',0) >= map.getOrDefault('F', 0) ?  'C' : 'F');
		 ans.append(map.getOrDefault('J',0) >= map.getOrDefault('M', 0) ?  'J' : 'M');
		 ans.append(map.getOrDefault('A',0) >= map.getOrDefault('N', 0) ?  'A' : 'N');
		 
		 answer = ans.toString();
	}
	class Solution {
	    public String solution(String[] survey, int[] choices) {
	    	
	    	String temp = "";
	        for(int i=0; i<survey.length; i++) {
	        	temp += survey[i];
	        }
	    	String answer = "temp";
	        return answer;
	    }
	}
}

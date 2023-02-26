package pratice.codetest1;

public class KnightWeapon {

	public static void main(String[] args) {
		int number = 10;
		int limit = 3;
		int power =2;
		int answer = 0;
		int temp = 0;
		
		for(int j=1; j<=number; j++) {
			for(int i=1; i*i<=j; i++) {
				if(i * i  == j)
					temp ++;
				else if(j % i  ==0) 
					temp += 2;
			}
			if(temp <= limit) {
				answer += temp;
				
			}
			else {
				answer += power;
			}
			temp =0;
		}
		System.out.println(answer);
		
	}


}
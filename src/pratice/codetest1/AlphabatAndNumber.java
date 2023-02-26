package pratice.codetest1;

public class AlphabatAndNumber {

	public static void main(String[] args) {
		String s = "one4seveneight";
		s = s.replace("one", Integer.toString(1));
		System.out.println(s);
		
		String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		for(int i=0; i<10; i++) {
			s=s.replace(num[i],Integer.toString(i));
		}
		System.out.println(s);
	}

}

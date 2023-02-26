package pratice.codetest1;

public class StrangeString {

	public static void main(String[] args) {
		String s = "try hello world";
		String[] sp = s.split("");
		String answer = "";
		int temp = 0;
		for (String a : sp) {
			temp = a.contains(" ") ? 0 : temp +1;
			answer += temp%2 == 0 ? a.toLowerCase() : a.toUpperCase();
		}
		System.out.println(answer);
	}
}

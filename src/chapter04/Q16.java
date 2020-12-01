package chapter04;

public class Q16 {
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 26);
		System.out.println(randomNumber);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(Character.toUpperCase(alphabet.charAt(randomNumber)));
	}

}

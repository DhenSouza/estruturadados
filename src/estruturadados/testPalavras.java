package estruturadados;

public class testPalavras {

	public static void main(String[] args) {

		String word = "abcABC1";

		System.out.println(criptografaString(word));

	}

	public static String criptografaString(String word) {
		for (int i = 1; i <= 3; i++) {
			if (i == 1) {
				word = ascii3(word);
				System.out.println(word);
			} else if (i == 2) {
				word = reverseString(word);
				System.out.println(word);
			} else if (i == 3) {
				word = ascii1(word);
				System.out.println(word);

			}
		}
		return word;
	}

	public static String ascii3(String word) {
		for (int j = 0; j < word.length(); j++) {
			if (Character.isLetter(word.charAt(j))) {
				int ascii = (int) word.charAt(j);
				ascii += 3;
				word = word.replace(word.charAt(j), (char) ascii);
			}
		}

		return word;

	}

	public static String reverseString(String word) {
		StringBuilder builder = new StringBuilder(word);
		word = builder.reverse().toString();

		return word;

	}

	public static String ascii1(String word) {
		for (int j = 7; j == word.length(); j--) {
			//if (j <= word.length() / 2) {
				int ascii = (int) word.charAt(j) - 1;
				
				word = word.replace(word.charAt(j), (char) ascii);
			//}
		}

		return word;
	}

}

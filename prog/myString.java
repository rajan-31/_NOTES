public class myString {
	public static void main(String[] args) {
		String s = "Welcome";

		String s2 = new String("Home!");

		// s.join("\t", s2);

		// char[] temp = new char[s.length()];
		// s.getChars(0, s.length(), temp, 0);

		char[] x = s.toCharArray();

		for(char e: x) System.out.println(e);
	}
}